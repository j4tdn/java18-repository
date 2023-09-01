package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import connection.DBConnection;
import dto.StudentWithMathAndLiterateOver8Dto;
import utils.SqlUtils;

public class JdbcClassDao implements ClassDao {
	
	private static final String Q_GET_STUDENTS_BY_CONDITION = ""
															+ "SELECT c.NAME AS Class_Name,\r\n"
															+ "COUNT(*) AS Number_Of_Students,\r\n"
															+ "GROUP_CONCAT(s.`NAME`) AS Students_With_Scores_Over_8\r\n"
															+ "FROM CLASS c \r\n"
															+ "JOIN STUDENT s \r\n"
															+ "ON c.ID = s.CLASS_ID\r\n"
															+ "JOIN RESULT r \r\n"
															+ "ON s.ID = r.STUDENT_ID\r\n"
															+ "WHERE (r.`SUBJECT` = 'Math' AND r.SCORE >= 8)\r\n"
															+ "OR (r.`SUBJECT` = 'Literature' AND r.SCORE >= 8)\r\n"
															+ "GROUP BY c.NAME;";
	private Connection connection;
	private Statement st;
	private ResultSet rs;
	
	public JdbcClassDao() {
		connection = DBConnection.getConnection();
	}
	@Override
	public List<StudentWithMathAndLiterateOver8Dto> getClassInfoWithScoresOver8() {
		List<StudentWithMathAndLiterateOver8Dto> result = new ArrayList<>();	
		try {
			st = connection.createStatement();
			rs = st.executeQuery(Q_GET_STUDENTS_BY_CONDITION);		
			while (rs.next()) {
			    String studentNamesString = rs.getString("Students_With_Scores_Over_8");
			    List<String> studentNames = Arrays.asList(studentNamesString.split(","));
			    
			    result.add(
			    		StudentWithMathAndLiterateOver8Dto.of()
											              .withStudentNames(studentNames)
											              .withNumberOfStudents(rs.getInt("Number_Of_Students"))
											              .withClassName(rs.getString("Class_Name"))
			    );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}  finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

}

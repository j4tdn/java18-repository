package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import connection.DbConnection;
import dto.ClassDto;
import utils.SqlUtils;

public class JdbcClassDao implements ClassDao {
	
	private static final String Q_GET_STUDENTS_BY_CONDITION = ""
			+ "SELECT c.NAME AS Class_Name, \n"
			+ "       COUNT(*) AS Number_Of_Students, \n"
			+ "       GROUP_CONCAT(s.`NAME`) AS Students_With_Good_Scores \n"
			+ "FROM CLASS c \n"
			+ "JOIN STUDENT s ON c.ID = s.CLASS_ID \n"
			+ "JOIN RESULT r ON s.StudentID = r.StudentID \n"
			+ "WHERE (r.`SUBJECT` = 'Math' AND r.SCORE >= 8) \n"
			+ "   OR (r.`SUBJECT` = 'Literature' AND r.SCORE >= 8) \n"
			+ "GROUP BY c.NAME";
	
	private Connection connection;
	private Statement st;
	private ResultSet rs;
	
	public JdbcClassDao() {
		connection = DbConnection.getConnection();
	}
	
	@Override
	public List<ClassDto> getClassInfoWithGoodScores() {
		List<ClassDto> result = new ArrayList<>();	
		try {
			st = connection.createStatement();
			rs = st.executeQuery(Q_GET_STUDENTS_BY_CONDITION);		
			while (rs.next()) {
			    String studentNamesString = rs.getString("Students_With_Good_Scores");
			    List<String> studentNames = Arrays.asList(studentNamesString.split(","));
			    
			    result.add(
			        ClassDto.of()
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

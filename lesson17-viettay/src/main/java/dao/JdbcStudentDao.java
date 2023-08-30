package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Student;
import connection.DbConnection;
import utils.SqlUtils;

public class JdbcStudentDao implements StudentDao {
	

	private static final String Q_GET_ALL_STUDENTS_BY_CLASS_ID = ""
			+ "SELECT *\n"
			+ "  FROM student st\n"
			+ "  JOIN class cls\n"
			+ "    ON st.class_id = cls.ID\n"
			+ " WHERE cls.id = ?";
		
	private Connection connection;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;

	public JdbcStudentDao() {
		connection = DbConnection.getConnection();
	}
	
	public List<Student> getStudents(int classId) {
		List<Student> result = new ArrayList<>();
		
		try {
			pst = connection.prepareStatement(Q_GET_ALL_STUDENTS_BY_CLASS_ID);
			pst.setInt(1, classId);
			rs = pst.executeQuery();
			while (rs.next()) {
				result.add(
						Student.of()
						.withId(rs.getInt("st.id"))
						.withName(rs.getString("st.name"))
						.withGender(rs.getString("st.gender")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		
		return result;
	
	}

}

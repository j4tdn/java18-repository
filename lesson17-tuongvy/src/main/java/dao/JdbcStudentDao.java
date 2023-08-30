package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import bean.Student;
import connection.DbConnection;
import utils.SqlUtils;

public class JdbcStudentDao implements StudentDao{
	
	private static final String Q_GET_STUDENTS_BY_ClASS_IDS = ""
			+ "SELECT *\n"
			+ "  FROM STUDENT st\n"
			+ " WHERE st.CLASS_ID IN (%s)";
	
	private static final String Q_GET_STUDENTS_BY_SCORE = ""
			+ "SELECT *\n"
			+ "  FROM STUDENT st\n"
			+ " WHERE st.CLASS_ID IN ('Toan') AND SCORE > 8\n"
			+ "";
	
	
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public JdbcStudentDao() {
		connection = DbConnection.getConnection();
	}
	
	@Override
	public List<Student> getStudents(int classIds) {
		List<Student> result = new ArrayList<>();
			try {
				pst = connection.prepareStatement(Q_GET_STUDENTS_BY_ClASS_IDS);
				pst.setInt(1, classIds);
				rs = pst.executeQuery();
				while (rs.next()) {
					Student student = Student.of()
							.withId(rs.getInt("st.ID"))
							.withName(rs.getString("st.NAME"))
							.withGender(rs.getBoolean("st.GENDER"))
							.withClass_id(rs.getInt("st.CLASS_ID"));
					
					result.add(student);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				SqlUtils.close(rs, pst);
			}
			
			return result;
	}

}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Class;
import bean.Student;
import connection.DbConnection;
import utils.SqlUtils;

public class JdbcStudentDao implements StudentDao {
	
	private static final String Q_GET_STUDENTS_BY_CLASS_ID = ""
			+ "SELECT * FROM STUDENT\n"
			+ "  WHERE CLASS_ID = ?\n";
	
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public JdbcStudentDao() {
		connection = DbConnection.getConnection();
	}

	@Override
	public List<Student> getStudentsByClassId(int classId) {
		List<Student> result = new ArrayList<>();	
		try {
			pst = connection.prepareStatement(Q_GET_STUDENTS_BY_CLASS_ID);
			pst.setInt(1, classId);
			rs = pst.executeQuery();
			while (rs.next()) {
				result.add(
						Student.of()
						.withId(rs.getInt("StudentId"))
						.withName(rs.getString("NAME"))
						.withGender(rs.getString("GENDER"))
						.withClassInfo(Class.of().withId(rs.getInt("ID")))
						);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}  finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}

}

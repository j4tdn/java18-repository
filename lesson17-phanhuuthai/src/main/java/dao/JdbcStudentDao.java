package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Student;
import connection.DbConnection;

public class JdbcStudentDao implements StudentDao{

	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;
	
	private static final String Q_GET_STUDENT_BY_CLASS_ID = ""
			+ "SELECT * FROM STUDENT\n"
			+ "WHERE class_id = ?";
	
	private static final String Q_GET_AMOUNT_OF_STUDENT_BY_CLASS = ""
			+ "SELECT COUNT(`NAME`) COUNT\n"
			+ "FROM STUDENT\r\n"
			+ "GROUP BY class_id\n"
			+ "HAVING class_id = ?";
	
	public JdbcStudentDao() {
		connection = DbConnection.getConnection();
	}
	
	@Override
	public List<Student> getStudentByClassId(int id) {
		List<Student> result = new ArrayList<>();
		try {
			pst = connection.prepareStatement(Q_GET_STUDENT_BY_CLASS_ID);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			while (rs.next()) {
				Student student = new Student(rs.getInt("ID"), rs.getString("NAME"), rs.getString("GENDER"), rs.getInt("class_id"));
				
				result.add(student);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
	
	@Override
	public Integer amountOfStudent(int id) {
		int result = 0;
		try {
			pst = connection.prepareStatement(Q_GET_STUDENT_BY_CLASS_ID);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			while (rs.next()) {
				result = rs.getInt("COUNT");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
}

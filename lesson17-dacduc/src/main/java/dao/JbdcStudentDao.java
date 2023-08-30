package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.student;
import connection.DbConnection;

public class JbdcStudentDao implements StudentDao {
	private static final String GET_ALL_STUDENT = ""
			+ "SELECT * FROM student = ?";
	private static final String AMOUNT_OF_STUDENTS = "Select count(id) from student s where s.class_id = ?";
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;

	public JbdcStudentDao() {
		connection = DbConnection.getConnection();
	}

	public List<student> getAll(int id) {
		// TODO Auto-generated method stub
		List<student> result = new ArrayList<student>();
		
		try {
			pst = connection.prepareStatement(GET_ALL_STUDENT);
			pst.setInt(1, id);
			while (rs.next()) {
				int ids = rs.getInt("ID");
				String name = rs.getString("NAME");
				String gender = rs.getString("GENDER");
				int class_id = rs.getInt("CLASS_ID");
				result.add(new student(null, name, gender, class_id));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pst.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return result;
	}

	public Integer AmoutOfStudent(int id) {
		int value = 0;
		try {
			pst = connection.prepareStatement(AMOUNT_OF_STUDENTS);
			pst.setInt(1, id);
			 value = pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pst.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return value;
	}

}

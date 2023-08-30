package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Student;
import connection.DbConnection;

public class JdbcStudentDao implements StudentDao {
	
	private static final String Q_GET_STUDENTS_BY_CLASS_ID = ""
			+ "SELECT * "
			+ "FROM (class cls JOIN student std ON cls.id = std.class_id) "
			+ "WHERE cls.id = ?";
	
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
			pst.setInt(1,  classId);
			rs = pst.executeQuery();
			
			while (rs.next()) {
				Student std = new Student(rs.getInt("std.id"), rs.getString("std.name"), rs.getString("std.gender"), rs.getInt("std.class_id"));
				result.add(std);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
	
}

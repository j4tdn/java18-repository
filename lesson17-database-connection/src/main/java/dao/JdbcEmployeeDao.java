package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Employee;
import bean.ItemGroup;
import connection.DbConnection;
import utils.DateUtils;
import utils.SqlUtils;

public class JdbcEmployeeDao implements EmployeeDao{

	private static final int DEFAULT_DEPARTMENT_ID = 1;
	
	private static final String Q_REGISTER_NEW_ACCOUNT =""
			+ "INSERT INTO employee(EMAIL, PASSWORD, DEPARTMENT_ID)\n"
			+ "VALUE(?, ?, ?);";
	
	private static final String Q_GET_EMPLOYEE_BY_ID =""
			+ "SELECT *\n"
			+ "  FROM employee\n"
			+ " WHERE email = ? AND password = ?";
			
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public JdbcEmployeeDao() {
		connection = DbConnection.getConnection();
	}
	
	@Override
	public boolean register(String username, String password) {
		try {
			pst = connection.prepareStatement(Q_REGISTER_NEW_ACCOUNT);
			pst.setString(1, username);
			pst.setString(2, SqlUtils.md5(password));
			pst.setInt(3, DEFAULT_DEPARTMENT_ID);
			return pst.executeUpdate()>0;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	@Override
	public Employee login(String email, String password) {
		Employee result = new Employee();
		
		try {
			pst = connection.prepareStatement(Q_GET_EMPLOYEE_BY_ID);
			pst.setString(1, email);
			pst.setString(2, SqlUtils.md5(password));
			rs = pst.executeQuery();
			if (rs.next()) {
				int id = rs.getInt("ID");
				result = new Employee(email, SqlUtils.md5(password));
				result.setId(id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		
		return result;
	}
}

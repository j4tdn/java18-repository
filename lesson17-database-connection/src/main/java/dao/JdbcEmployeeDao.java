package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import bean.Employee;
import bean.ItemGroup;
import utils.SqlUtils;

public class JdbcEmployeeDao implements EmployeeDao {
	private static int DEFAULT_DEPARTMENT_ID = 1; 
	private static final String Q_REGISTER_NEW_ACCOUNT=""
			+"INSERT INTO EMPLOYEE(EMAIL,PASSWORD,DEPARTMENT_ID)\n"
			+"VALUES(?,?,?)";
	private static final String Q_LOGIN_NEW_ACCOUNT=""
			+ "SELECT *\n"
			+ "  FROM employee\n"
			+ " WHERE email = ? AND password = ?";
	private static PreparedStatement pst ;
	private ResultSet rs;
	private Connection connection;
	@Override
	public boolean register(String email, String password) {
		try {
			pst = connection.prepareStatement(Q_REGISTER_NEW_ACCOUNT);
			pst.setString(1, email);
			pst.setString(2, SqlUtils.md5(password));
			pst.setInt(3, DEFAULT_DEPARTMENT_ID);
			return pst.executeUpdate() >0;
		
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			SqlUtils.close(pst);
		}
		return false;
	}
	@Override
	public Employee login(String email, String password) {
		Employee result = null;
		
		try {
			pst = connection.prepareStatement(Q_LOGIN_NEW_ACCOUNT);
			pst.setString(1, email);
			pst.setString(2,SqlUtils.md5(password));
			rs = pst.executeQuery();
			if (rs.next()) {
				int id = rs.getInt("ID");
				String name = rs.getString("NAME");
				result = new Employee(email, SqlUtils.md5(password));
				result.withId(id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		
		return result;
	}

}

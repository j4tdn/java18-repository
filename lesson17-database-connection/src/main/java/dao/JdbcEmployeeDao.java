package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Employee;
import bean.ItemGroup;
import utils.SqlUtils;

public class JdbcEmployeeDao implements EmployeeDao {

	private static final String Q_REGISTER_NEW_ACCOUNT = "" 
			+ "INSERT INTO EMPLOYEE(EMAIL,PASSWORD,DEPARTMENT_ID)\n"
			+ "VALUES(?,?,?)";
	
	private static final String Q_GET_EMPLOYEE_BY_ID =""
			+ "SELECT *\n"
			+ "  FROM employee\n"
			+ " WHERE email = ? AND password = ?";

	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;
	private int DEFAULT_DEPARTMENT_ID = 1;

	@Override
	public boolean register(String email, String passWord) {
		try {
			pst = connection.prepareStatement(Q_REGISTER_NEW_ACCOUNT);
			pst.setString(1, email);
			pst.setString(2, passWord);
			pst.setInt(3, DEFAULT_DEPARTMENT_ID);
			return pst.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Employee login(String email, String passWord) {
		Employee result = null;
		
		String encryptedPassWord = SqlUtils.md5(passWord);
		
		try {
			pst = connection.prepareStatement(Q_GET_EMPLOYEE_BY_ID);
			pst.setString(1, email);
			pst.setString(2, encryptedPassWord);
			
			rs = pst.executeQuery();
			if (rs.next()) {
				int id = rs.getInt("ID");
				result = new Employee(email, encryptedPassWord);
				result.WithId(id);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
		return result;
	}
}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.StudentOnClass;
import connection.DbConnection;

public class JdbcStudentOnClass implements StudentOnClassWork{
	private static final String Q_GET_ALL = ""
			+ "SELECT cl.`name` ,COUNT(*) AS numberOfStuden\r\n"
			+ "  FROM STUDENT st\r\n"
			+ "  JOIN class cl\r\n"
			+ "    ON cl.ID = st.CLASS_ID\r\n"
			+ "GROUP BY st.CLASS_ID;";

	private Connection connection;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;

	public JdbcStudentOnClass() {
		connection = DbConnection.getConnection();
	}
	
	@Override
	public List<StudentOnClass> getAll() {
		List<StudentOnClass> result = new ArrayList<>();
		try {
			st = connection.createStatement();
			rs = st.executeQuery(Q_GET_ALL);
			while(rs.next()) {
				String name = rs.getString("NAME");
				int count = rs.getInt("numberOfStuden");
				result.add(new StudentOnClass(name, count));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}

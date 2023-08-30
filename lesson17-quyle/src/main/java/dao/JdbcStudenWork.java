package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Student;
import connection.DbConnection;

public class JdbcStudenWork implements StudentWork {
	private static final String Q_GET_STUDENT_WITH_ID_CLASS = "" + "SELECT *\r\n" + "  FROM student st\r\n"
			+ " WHERE st.CLASS_ID = ?";
	
	private static final String Q_GET_STUDENT_ON_CLASS = ""
			+ "SELECT cl.`name` ,COUNT(*) AS numberOfStuden\r\n"
			+ "  FROM STUDENT st\r\n"
			+ "  JOIN class cl\r\n"
			+ "    ON cl.ID = st.CLASS_ID\r\n"
			+ "GROUP BY st.CLASS_ID";
	
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;

	public JdbcStudenWork() {
		connection = DbConnection.getConnection();
	}

	@Override
	public List<Student> get(int id) {
		List<Student> result = new ArrayList<>();
		try {
			pst = connection.prepareStatement(Q_GET_STUDENT_WITH_ID_CLASS);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			while (rs.next()) {
				int ids = rs.getInt("ID");
				String name = rs.getString("NAME");
				String gender = rs.getString("GENDER");
				int class_id = rs.getInt("CLASS_ID");
				result.add(new Student(ids, name, gender, class_id));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}

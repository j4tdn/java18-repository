package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.GoodStudent;
import connection.DbConnection;

public class JdbcGoodStudentWork implements GoodStudentWork {
	private static final String Q_GET_ALL = "" 
			+ "SELECT st.`NAME`,\r\n" 
			+ "		re.`subject`,\r\n"
			+ "        re.SCORE\r\n" 
			+ "  FROM class cl\r\n" 
			+ "  JOIN student st\r\n"
			+ "    ON cl.ID = st.CLASS_ID\r\n" 
			+ "  JOIN result re\r\n" 
			+ "	ON re.STUDENT_ID = st.ID\r\n"
			+ " WHERE (re.`SUBJECT` = 'Math' AND re.SCORE >= 8) "
			+ "OR  (re.`SUBJECT` = 'Literature' AND re.SCORE >= 8);";
	private static final String Q_GET_ON_8_2 = ""
			+ "SELECT st.`NAME`,\r\n"
			+ "		re.`subject`,\r\n"
			+ "        re.SCORE\r\n"
			+ "  FROM class cl\r\n"
			+ "  JOIN student st\r\n"
			+ "    ON cl.ID = st.CLASS_ID\r\n"
			+ "  JOIN result re\r\n"
			+ "	ON re.STUDENT_ID = st.ID\r\n"
			+ " WHERE re.SCORE >= 8.2";
	private static final String Q_GET_THEBEST = ""
			+ "SELECT st.`NAME`,\r\n"
			+ "		re.`subject`,\r\n"
			+ "        re.SCORE\r\n"
			+ "  FROM class cl\r\n"
			+ "  JOIN student st\r\n"
			+ "    ON cl.ID = st.CLASS_ID\r\n"
			+ "  JOIN result re\r\n"
			+ "	ON re.STUDENT_ID = st.ID\r\n"
			+ " WHERE re.SCORE = (SELECT max(SCORE) FROM result)";
	
	private Connection connection;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;

	public JdbcGoodStudentWork() {
		connection = DbConnection.getConnection();
	}

	@Override
	public List<GoodStudent> getAll() {
		List<GoodStudent> result = new ArrayList<>();
		try {
			st = connection.createStatement();
			rs = st.executeQuery(Q_GET_ALL);
			while (rs.next()) {
				String name = rs.getString("NAME");
				String subject = rs.getString("subject");
				float score = rs.getFloat("SCORE");
				result.add(new GoodStudent(name, subject, score));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	@Override
	public List<GoodStudent> getAllOut82() {
		List<GoodStudent> result = new ArrayList<>();
		try {
			st = connection.createStatement();
			rs = st.executeQuery(Q_GET_ON_8_2);
			while (rs.next()) {
				String name = rs.getString("NAME");
				String subject = rs.getString("subject");
				float score = rs.getFloat("SCORE");
				result.add(new GoodStudent(name, subject, score));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	@Override
	public GoodStudent GetTheBestStudent() {
		GoodStudent result = null;
		try {
			st = connection.createStatement();
			rs = st.executeQuery(Q_GET_THEBEST);
			while (rs.next()) {
				String name = rs.getString("NAME");
				String subject = rs.getString("subject");
				float score = rs.getFloat("SCORE");
				result = new GoodStudent(name, subject, score);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}

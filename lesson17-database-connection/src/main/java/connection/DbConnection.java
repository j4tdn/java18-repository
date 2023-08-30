package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class DbConnection {
	private static Connection conn = null;

	private DbConnection() {

	}

	public static Connection getConnection() {
		Properties props = DbProvider.getDbConfigs();
		if (conn == null) {
			try {
				// driver -->khai báo sử dụng/kết nối đến HQT CSDL nào
				Class.forName(props.getProperty("jdbc.driver"));
				// driver manage --> khai báo thông tin CSDL cần kết nối đến
				conn = DriverManager.getConnection(props.getProperty("db.url"), props.getProperty("db.user"), props.getProperty("db.password"));
				System.out.println(conn);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}

		}
		return conn;
	}
}

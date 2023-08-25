package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
	// Singparent

	private static Connection connection = null;

	private DbConnection() {

	}

	public static Connection getConnection() {
		Properties props = DbProvider.getDbConfig();
		
		if (connection == null) {
			// connection
			try {
				// Driver
				// khai báo sử dụng/ kết nối đến HQT CSDL nào
				Class.forName(props.getProperty("jdbc.driver"));

				// driver manager
				// Khai báo thoong tin CSDL kết nối đến
				
				connection = DriverManager.getConnection(
						props.getProperty("db.url"),
						props.getProperty("db.user"),
						props.getProperty("db.password"));
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return connection;
	}
}

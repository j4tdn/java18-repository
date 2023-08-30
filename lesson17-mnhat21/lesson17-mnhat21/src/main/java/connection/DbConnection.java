package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {

	private static Connection connection = null;

	private DbConnection() {
	}

	public static Connection getConnection() {
		Properties props = DbProvider.getDbConfig();
		
		System.out.println(props);

		if (connection == null) {
			try {
				// driver --> Khai báo sử dụng/ kết nối đến HQT CSDL nào
				Class.forName(props.getProperty("jdbc.driver"));

				// driver manager --> Khai báo thông tin CSDL cần kết nối đến
				connection = DriverManager.getConnection(props.getProperty("db.url"), props.getProperty("db.user"),
						props.getProperty("db.password"));

				System.out.println("connection --> " + connection);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
}

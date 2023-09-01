package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class DBConnection {
	private static Connection connection = null;

	private DBConnection() {
		// TODO Auto-generated constructor stub
	}

	public static Connection getConnection() {
		Properties props = DBProvider.getDbConfigs();
		if (connection == null) {
			try {
				Class.forName(Driver.class.getName());
				connection = DriverManager.getConnection(props.getProperty("db.url"), props.getProperty("db.user"),
						props.getProperty("db.password"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return connection;
	}

}

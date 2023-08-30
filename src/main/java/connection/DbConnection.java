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
		Properties props = DbProvider.getDbConfigs();
		if (connection == null) {
			try {
				Class.forName(props.getProperty("jdbc.driver"));
				connection = DriverManager.getConnection(props.getProperty("db.url"), props.getProperty("db.user"),
						props.getProperty("db.password"));

			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;

	}

}

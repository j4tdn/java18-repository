package connection;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBProvider {

	private static final String DB_CONFIG_PATH = "config.properties";

	public DBProvider() {
		// TODO Auto-generated constructor stub
	}

	public static Properties getDbConfigs() {
		Properties props = new Properties();

		try {
			InputStream stream = DBProvider.class.getClassLoader().getResourceAsStream(DB_CONFIG_PATH);
			props.load(stream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return props;
	}
}

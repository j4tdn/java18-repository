package connection;

import java.io.InputStream;
import java.util.Properties;

public class DbProvider {
	private static final String DB_CONFIG_PATH = "config.properties";

	private DbProvider() {

	}

	public static Properties getDbConfig() {
		Properties props = new Properties();

		try {
			// read File from project path
			// File file = new File(DB_CONFIG_PATH);
			// InputStream stream = new FileInputStream(file);

			// read File from class path
			InputStream stream = DbProvider.class.getClassLoader()
					.getResourceAsStream(DB_CONFIG_PATH);

			props.load(stream);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return props;
	}
}

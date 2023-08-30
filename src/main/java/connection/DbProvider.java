package connection;

import java.io.InputStream;
import java.util.Properties;

public class DbProvider {

	private static final String DB_CONFIG_PATH = "config.properties";

	private DbProvider() {

	}

	public static Properties getDbConfigs() {
		Properties props = new Properties();
		try {
			InputStream stream = DbProvider.class.getClassLoader().getResourceAsStream(DB_CONFIG_PATH);
			props.load(stream);
		} catch (Exception e) {
			// TODO: handle exception
		}

		return props;
	}

}

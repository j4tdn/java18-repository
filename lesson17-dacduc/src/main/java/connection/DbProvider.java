package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DbProvider {
	private static final String DB_CONFIG_PATH = "config.properties";

	private DbProvider() {

	}

	public static Properties getDbConfigs() {
		Properties props = new Properties();
		try {
			//read file from project path
//			File file = new File(DB_CONFIG_PATH);
			InputStream stream = DbProvider.class.getClassLoader().getResourceAsStream(DB_CONFIG_PATH);
			System.out.println(1);
			
			props.load(stream);
			System.out.println(2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(props);
		return props;
	}
}
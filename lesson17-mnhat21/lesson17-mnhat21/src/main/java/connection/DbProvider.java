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
	
	public static Properties getDbConfig() {
		Properties prop = new Properties();
		
		try {	
			InputStream stream = DbProvider.class.getClassLoader()
					.getResourceAsStream(DB_CONFIG_PATH);
			prop.load(stream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
	}
}

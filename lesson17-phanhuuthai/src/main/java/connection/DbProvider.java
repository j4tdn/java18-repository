package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DbProvider {
	
	public static final String DB_CONFIG_PATH = "config.properties";
	
	private DbProvider() {
		
	}
	
	public static Properties getDbConfigs() {
		Properties props = new Properties();
		
		
		try {
			
			// read fule from project path
			//File file = new File(DB_CONFIG_PATH);
			
			// read file from class pass
			ClassLoader classLoader = DbProvider.class.getClassLoader();
			
			InputStream stream = classLoader.getResourceAsStream(DB_CONFIG_PATH);
		
			props.load(stream);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return props;
	}
}
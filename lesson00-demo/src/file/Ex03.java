package file;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex03 {
	
	private static final String a = String.join(File.separator, "data","qwer","test.txt");
	
	private static final String b = String.join(File.separator, "data","bncm");
	
	
	public static void main(String[] args) {
		File file = new File(a);
		if(file.exists()) {
			File bb = new File(b);
			bb.mkdirs();
			
			Path filea = file.toPath();
			Path fileb = bb.toPath();
			
			//Files.copy(filea, fileb.resolve(fileb), )
		}
	}
}

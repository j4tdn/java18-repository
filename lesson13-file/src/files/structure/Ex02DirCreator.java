package files.structure;

import java.io.File;

// dir --> directory
public class Ex02DirCreator {
	
	private static final String dirPath = "data" + File.separator + "storage";
	
	public static void main(String[] args) {
		File dir = new File(dirPath);
		if(!dir.exists()) {
			boolean isSuccess = dir.mkdirs();
			System.out.println("Dir " + dir.getName() + " is created success --> " + isSuccess);
		}
	}
}

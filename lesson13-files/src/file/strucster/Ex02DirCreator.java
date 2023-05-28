package file.strucster;

import java.io.File;

// dir ---> directory
public class Ex02DirCreator {
	
	private static final String dirPath = "data" + File.separator + "storage";
	
	public static void main(String[] args) {
		System.out.println("*** __ Start Main __ ***");
		File dir = new File(dirPath);
		if (!dir.exists()) {
			boolean isSuccess = dir.mkdirs();
			System.out.println("Dir " + dir.getAbsolutePath() + "is created successful --> " + isSuccess);
			
		}else {
		System.out.println("*** __ Stop Main __ ***");
		}
	}
}
  
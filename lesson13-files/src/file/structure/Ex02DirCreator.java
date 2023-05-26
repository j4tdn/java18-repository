package file.structure;

import java.io.File;

// dir --> directory
public class Ex02DirCreator {
	
	private static final String dirPath = "data" + File.separator + "storage";
	
	public static void main(String[] args) {
		System.out.println("*** ___ Start Main ___ ***\n");
		
		File dir = new File(dirPath);
		if (!dir.exists()) {
			boolean isSuccess = dir.mkdirs();
			System.out.println("Dir " + dir.getAbsolutePath() + " is created successful --> " + isSuccess);
		}
		System.out.println("\n*** ___ Stop Main ___ ***");
	}
}

package files.structure;

import java.io.File;

public class Ex02DirCreator {
	
	private static final String dirPath = "data" + File.separator + "storage";
	
	public static void main(String[] args) {
		System.out.println("\n***____   Start Main   ___***\n");
		File dir = new File(dirPath);
		if(!dir.exists()) {
				boolean isSuccess = dir.mkdirs();
				System.out.println("Directory " + dir.getName() + " is created successful --> " + isSuccess);
		}
		
		System.out.println("\n***____   End Main   ___***\n");
	}

}

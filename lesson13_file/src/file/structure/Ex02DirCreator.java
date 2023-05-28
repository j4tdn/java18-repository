package file.structure;

import java.io.File;

public class Ex02DirCreator {
	private static final String dirpath = "data" + File.separator + "storage";
	public static void main(String[] args) {
		System.out.println("________________Start Maain___________");
		File dir = new File(dirpath);
		if (!dir.exists()) {
			//lay duong dan root folder --> 
			boolean isSuccess = dir.mkdirs();
			System.out.println("Dir " + dir.getAbsolutePath() + " iscreated successful --> " + isSuccess);
		}
		
		System.out.println("________________Stop Maain___________");
	}

}

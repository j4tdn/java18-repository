package files.structure;

import utils.FileUtils;

public class Ex01FileCreator {
	
	//absolute path --> D:\\music\\song.mp3
	// path			-->		music\\song.mp3
	private static final String pathname = "data\\image\\avt.png";
	
	public static void main(String[] args) {
		System.out.println("\n***____   Start Main   ___***\n");
		
		FileUtils.createFile(pathname);
		
		System.out.println("\n***____   End Main   ___***\n");
	}

}

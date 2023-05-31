package files.structure;

import java.io.File;
import java.io.IOException;

import utils.FileUtils;

public class Ex01FileCreator {
	
	// absolute path --> D:\\music\\song.mp3
	// path          -->     music\\song.mp3 --> ...lesson13-files\\music\\song.mp3
	private static final String pathname = "data\\image\\avatar.png";

	// when creating file from folder, require folder must exist already
	// unless --> throw error
	
	public static void main(String[] args) {
		System.out.println("*** ___ Start Main __ ***\n");
		
		File file = FileUtils.createFile(pathname);
		
		System.out.println("file --> " + file);
		
		System.out.println("\n*** ___ Stop Main __ ***");
	}
}

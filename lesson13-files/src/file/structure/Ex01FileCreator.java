package file.structure;

import java.io.File;

import utils.FileUtils;

public class Ex01FileCreator {

	// absolute path --> đường dẫn tương đối --> D:\\music\\song.mp3
	// path --> đường dần tuyệt đối --> music\\song.mp3 -->
	// lesson13-files\\music\\song.mp3
	private static final String pathname = "data" + File.separator + "image" + File.separator + "avatar.png";

	// when creating file from folder, require folder must exist already
	// unless --> throw error

	public static void main(String[] args) {
		System.out.println("*** ___ Start Main ___ ***\n");

		File file = FileUtils.createFile(pathname);
		
		System.out.println("file --> " + file);
		
		System.out.println("\n*** ___ Stop Main ___ ***");
	}
}

package files.structure;

import java.io.File;
import java.io.IOException;

import utils.FileUtils;

public class Ex01FileCreator {
	// absolute path --> D:\\music\\song.mp3
	// path
	private static final String pathname = "data\\image\\avatar.png";
	

	public static void main(String[] args) {
		System.out.println("*__Start Main__*");
		File file = FileUtils.createFile(pathname);
	}

}
package files.structure;

import java.io.File;
import java.io.IOException;

import utils.FileUtils;

public class Ex01FileCreator {
	// absolute path --> D:\\music\\song.mp3
	// path:         -->     music\\song.mp3 --> lesson13-flies\\music\\song.mp3
	private static final String pathname = "data\\image\\avatar.png";
	
	//when creating file from folder , require folder must exist already
	
	public static void main(String[] args) {
		System.out.println("\n**** start main ****");
		//int last = pathname.lastIndexOf("\\");
		//System.out.println("sub String --> " + pathname.substring(0,last));
		
		File file = FileUtils.createFile(pathname);
		
		System.out.println("\n**** stop main ****");
	}
	
}

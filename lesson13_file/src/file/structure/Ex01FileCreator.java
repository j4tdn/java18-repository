package file.structure;

import java.io.File;

import utils.FileUtils;

public class Ex01FileCreator {
	
	private static final String pathname = "data\\images\\avatar.png";
	
	//when creating file from folder, requite folder must exist already
	
	public static void main(String[] args) {
		System.out.println("________________Start Maain___________");
		
		File file = FileUtils.createFile(pathname);
		System.out.println("file --> " + file);
		
		System.out.println("________________Stop Maain___________");
	}

}

package files.structure;

import java.io.File;
import java.io.IOException;

import static utils.FileUtils.*;

public class Ex01FileCreator {
	//a
//	private static final String pathname ="data\\storage\\content.txt";
	private static final String pathname ="data\\image\\avatar.png";
	public static void main(String[] args) {
		System.out.println("***___Stop Main___***");
		
		createFile(pathname);
		
		System.out.println("***___Stop Main___***");
	}
}

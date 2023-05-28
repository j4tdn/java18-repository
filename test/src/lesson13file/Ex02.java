package lesson13file;

import java.io.File;
import java.io.IOException;

public class Ex02 {
	
	private static final String path = "../data/readme.txt";
	
	public static void main(String[] args) throws IOException {
		File file = new File(path);
		
		String path = file.getPath();
		String absolute = file.getAbsolutePath();
		String canonicalPath = file.getCanonicalPath();
		
		System.out.println("path: " + path);
		System.out.println("absolute: " + absolute);
		System.out.println("canonicalPath: " + canonicalPath);
		
	}
}

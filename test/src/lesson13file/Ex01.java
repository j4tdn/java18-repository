package lesson13file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import common.Ectension;
import youtiu.Fileyoutiu;

public class Ex01 {
	
	private static final String path = "data/readme.txt";
	private static final String dirPath = "data/random";
	
	public static void main(String[] args) {
		File file = Fileyoutiu.create(path);
		System.out.println("is success : " + (file!=null));
		
		
//		Path pat = Paths.get("data","markup.txt");
//		Path pr =null;
//		try {
//			pr = Files.createFile(pat);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("pr " + pr);
		int nof = 20;
		boolean[] files = Fileyoutiu.create(dirPath,20,Ectension.values());
		
		File file2 = new File(dirPath);
		File[] listFile = file2.listFiles(a -> a.isFile() && a.getName().endsWith(Ectension.txt.val()));
		
		Fileyoutiu.printf(listFile);
		//System.out.println(files);
	}
}

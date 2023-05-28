package files.structure;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Ex04FileFilter {
	private static final String dirPath = "data" + File.separator + "upload";
	public static void main(String[] args) {
		File dir = new File(dirPath);
		File[] files = dir.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				return file.isFile() && file.getName().startsWith("RN");
			}
		});
		Arrays.stream(files).forEach(file -> System.out.println(file.getName()));
		
	}
}

package files.structure;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Ex04FileFilter {
	private static final String dirPath =String.join(File.separator,"data","upload");
	public static void main(String[] args) {
		File dir = new File(dirPath);
		File[] files = dir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isFile() && pathname.getName().startsWith("RN");
			}
		});
		Arrays.stream(files).forEach(e->System.out.println(e.getAbsoluteFile()) );
		
	}
}

package files.structure;

import java.io.File;
import java.io.IOException;

public class Ex02DirCreator {
	private static final String dirPath = "data" + File.separator + "storage";

	public static void main(String[] args) {
		System.out.println("***___Start Main___***");
		File dir = new File(dirPath);
		if (!dir.exists()) {

			boolean isSuccess = dir.mkdirs();
			System.out.println("Directory " + dir.getParent() + " is created successful --> " + isSuccess);

		}
		System.out.println("***___Stop Main___***");

	}
}

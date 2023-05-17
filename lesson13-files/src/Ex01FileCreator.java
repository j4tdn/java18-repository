import java.io.File;

import utils.FileUtils;

public class Ex01FileCreator {
	private static final String pathname = "data\\storage\\content.txt";

	public static void main(String[] args) {
		File file = FileUtils.createFile(pathname);
		System.out.println("\n file: "+file);
	}
}

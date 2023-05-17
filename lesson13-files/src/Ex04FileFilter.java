import java.io.File;
import java.util.Arrays;

public class Ex04FileFilter {

	private static final String dirPath = "data" + File.separator + "upload";

	public static void main(String[] args) {
		File dir = new File(dirPath);
		File[] files = dir.listFiles(file -> file.isFile()&&file.getName().startsWith("UP"));
		Arrays.stream(files).forEach(file->System.out.println(file.getName()));
;	}
}

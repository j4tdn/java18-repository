import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import utils.FileUtils;

public class Ex03FIleUpload {
	private static final String sourcePath = String.join(File.separator, "data", "images", "avatar.png");
	private static final String targetPath = String.join(File.separator, "data", "upload");

	public static void main(String[] args) {
		File sourceFile = new File(sourcePath);

		if (sourceFile.exists()) {
			File targetFile = FileUtils.createDir(targetPath);

			Path source = sourceFile.toPath();
			Path target = targetFile.toPath();
			Path result = null;

			// Copy file từ source qua targer, nếu đã có file thì replace file
			try {
				result = Files.copy(source, target.resolve(renameTo(source.getFileName())),
						StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("path --> " + result);
		} else {

		}
	}

	public static Path renameTo(Path path) {
		String name = path.toString(); // avatar.png
		String fileName = name.substring(0, name.lastIndexOf(".")); // avatar
		String extension = name.substring(name.lastIndexOf(".")); // .png
		String newName = "UP-" + fileName + System.currentTimeMillis() + extension;
		return Paths.get(newName);
	}
}

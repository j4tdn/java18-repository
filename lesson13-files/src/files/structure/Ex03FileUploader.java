package files.structure;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import utils.FileUtils;

public class Ex03FileUploader {
	// upload/copy file image/avatar.png to folder upload
	
	private static final String sourcePath = String.join(File.separator, 
			"data", "image", "human.png");
	
	private static final String targetPath = String.join(File.separator,
			"data", "upload");
	
	public static void main(String[] args) {
		File sourceFile = new File(sourcePath);
		
		if (sourceFile.exists()) {
			File targetFile = FileUtils.createDir(targetPath);
			
			Path source = sourceFile.toPath();
			Path target = targetFile.toPath();
			try {
				Files.copy(
						source,
						target.resolve(renameTo(source.getFileName())),
						StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n*** ___ STOP MAIN ___ ***");
	}
	
	public static Path renameTo(Path path) {
		String name = path.toString(); // human.png
		String filename = name.substring(0, name.lastIndexOf(".")); // human
		String extension = name.substring(name.lastIndexOf(".")); // .png
		String newName = "RN-" + filename + System.currentTimeMillis() + extension; 
		return Paths.get(newName); // new File(newName).toPath;
	}
}

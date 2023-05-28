package file.structure;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import utils.FileUtils;


public class Ex03FileUploader {
	
	private static final String sourcePath = String.join(File.separator, "data", "images", "avatar.png");
	
	private static final String targetPath = String.join(File.separator, "data", "upload"); 
	
	public static void main(String[] args) {
		File sourceFile = new File(sourcePath);
		
		if (sourceFile.exists()) {
			File targetFile = FileUtils.createDir(targetPath);
			
			Path source = sourceFile.toPath();
			Path target = targetFile.toPath();
			try {
				Files.copy(source, target.resolve(renameTo(source.getFileName())), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("________________Stop Maain___________");

	}
	
	public static Path renameTo(Path path) {
		String name = path.toString();
		String fileName = name.substring(0,name.lastIndexOf("."));
		String extension = name.substring(name.lastIndexOf("."));
		String newName = "RN-" + fileName + System.currentTimeMillis() + extension;
		return Paths.get(newName);
	}

}

package files.structure;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.time.LocalDateTime;

import utils.FileUtils;

public class Ex03FileUploader {
	
	// upload/copy file image/avatar.pnd to folder upload
	
	private static final String sourcePath = String.join(File.separator, 
			"data", "image", "avatar.png");
	
	private static final String targetPath = String.join(File.separator,
			"data", "upload");
	
	public static void main(String[] args) {
		File sourceFile = new File(sourcePath);
	
		if(sourceFile.exists()) {
			File targetFile = FileUtils.createDir(targetPath);
			
			Path source = sourceFile.toPath();
			Path target = targetFile.toPath();
			Path result = null;
			
			try {
				result = Files.copy(source, target.resolve(renameTo(source.getFileName())), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("path --> " + result);
		}
		
		
		System.out.println("*** __ Stop Main __\n");
	}
	
	public static Path renameTo(Path path) {
		String name = path.toString();
		String filename = name.substring(0,name.lastIndexOf("."));
		String extension = name.substring(name.lastIndexOf("."));
		String result = "RN-" + filename + System.currentTimeMillis() + extension;
		return Paths.get(result);
	}
}

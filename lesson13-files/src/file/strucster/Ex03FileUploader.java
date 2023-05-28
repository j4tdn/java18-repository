package file.strucster;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import utils.FileUtils;

public class Ex03FileUploader {
	// upload/copy file image/avatar.png to foder upload
	private static final String sourcePath = String.join(File.separator, 
					"data","image", "avatar.png");
	
	private static final String tagertPath = String.join(File.separator, 
			"data","upload");
	
	public static void main(String[] args) {
		System.out.println(sourcePath);
		
		File sourceFile = new File(sourcePath);
		if(sourceFile.exists()) {
			File tagetFie = FileUtils.createDir(tagertPath);
			
			Path source = sourceFile.toPath();
			Path taget = tagetFie.toPath();
			try {
				Files.copy(
						source, 
						taget.resolve(renameTo(source.getFileName())), 
						StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("\n ****** ___ END ____ ********");
	}
	
	public static Path renameTo( Path path) {
		
		String name = path.toString();
		String filename = name.substring(0, name.lastIndexOf("."));
		String extension = name.substring(name.lastIndexOf("."));
		String newName = "RN-" + filename + System.currentTimeMillis() + extension;
		return Paths.get(newName);
	}
}

package files.structure;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import utils.FileUtils;

public class Ex03FileUploader {
	private static final String sourcePath =String.join(File.separator,"data","image","avatar.png");
	private static final String targerPath =String.join(File.separator,"data","upload");
			//upload/copy file image/avata.png to folder upload
	//upload/copy file image/avata.png to folder upload
	public static void main(String[] args) {
		System.out.println(sourcePath);
		System.out.println(targerPath);
		File sourceFile = new File(sourcePath);
		if(sourceFile.exists()) {
			File targetFile = FileUtils.createDir(targerPath);
			Path source = sourceFile.toPath();
			Path target = targetFile.toPath();
			Path result = null; 
			try {
				result=Files.copy(source, target.resolve(renameTo(source.getFileName())), StandardCopyOption.REPLACE_EXISTING);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("path --> "+result);
		}
		
		System.out.println("***___Stop Main___***");
	}
	public static Path renameTo(Path path) {
		String name = path.toString();
		String fileName = name.substring(0,name.indexOf("."));
		String extension = name.substring(name.lastIndexOf("."));
		String newName = "RN-"+fileName+System.currentTimeMillis()+extension;
		return Paths.get(newName);
	}
}

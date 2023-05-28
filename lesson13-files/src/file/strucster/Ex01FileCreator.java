package file.strucster;

import java.io.File;
import java.io.IOException;

public class Ex01FileCreator {
	
	// absolute --> D:\\music\\song.mp3
	// path     --> 	\\music\\song.mp3 --> lesson13-files\\music\\song.mp3
	private static final String pathname = "data\\storage\\text.txt";
	public static void main(String[] args) {
		System.out.println("*** __ Start Main __ ***");
		
		File file = new File(pathname);
		if (!file.exists()) {
			// Lấy đường dẫn root forder data\\storeage
			// Tạo dir từ dirPath đó
			
			File root  = file.getParentFile();
			if (!root.exists()) {
				boolean isSuccess = root.mkdirs();
				if(isSuccess) {
					System.out.println("Dir " + root.getAbsolutePath() 
					+ "is created successful --> " + isSuccess);
				}
			}
			try {
				boolean isSuccess = file.createNewFile();
				System.out.println("File " + file.getName()
										+ " is created successful --> " + isSuccess);
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
		
		System.out.println("*** __ Stop Main __ ***");
		
	}
}

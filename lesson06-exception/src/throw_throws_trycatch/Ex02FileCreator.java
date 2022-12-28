package throw_throws_trycatch;

import java.io.File;
import java.io.IOException;

public class Ex02FileCreator {
	public static void main(String[] args) {
		try {
			File file = createFile("data.txt");
			System.out.println("file --> " + file.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// hàm có sẵn của JAVA: createNewFile có throws ra 1 compile-exception
	// nên khi gọi hàm, ta bắt buộc phải lí xử (try/catch)
	// data.txt --> ../current_project_path/data.txt
	// .../..data.txt
	private static File createFile(String pathname) throws IOException{
		File file =  new File(pathname);
		if(!file.exists()) {
			file.createNewFile(); // throws compile-exception
		}
		return file;
	}
}

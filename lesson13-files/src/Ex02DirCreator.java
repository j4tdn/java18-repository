import java.io.File;

public class Ex02DirCreator {

	private static final String dirPath = "data" + File.separator + "storage";

	public static void main(String[] args) {
		File dir = new File(dirPath);
		System.out.println("Start");
		// Tạo folder cho file
		if (!dir.exists()) {
			boolean isSuccess = dir.mkdirs();
			System.out.println(isSuccess ? "Create file successfully" : "Fail to create file");
		}
		else {
			System.out.println("This dir is available");
		}
		System.out.println("finish");
	}
}

package demo;

public class Ex02StringDemoV2 {
	private static String[] extensions = { "jpg", "jpeg", "png", "gif" };

	public static void main(String[] args) {
		// 1. Kiểm tra loại sách là SGK, STK
		System.out.println("1 --> Sách tham khảo STK123: " + ("STK123".startsWith("STK")));
		System.out.println("1 --> Sách tham khảo STA123: " + ("STA123".startsWith("STK")));
		// 2. Kiểm tra định dạng file có phải là hình ảnh hay ko
		String path = "C:\\download\\default.png";
		System.out.println("Hình ảnh " + isImage(path));
		// 3. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
		// replace

		// 4. Loại bỏ các khoảng trắng thừa của chuỗi s3
		// replaceAll, trim, strip

		String s = "le van teo";
		// 5. Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
		System.out.println("Chuỗi con: " + s.substring(2));

		int start = path.lastIndexOf("\\") + 1;
		int end = path.lastIndexOf(".");
		System.out.println("Tên file: " + path.substring(start, end));

		// 6. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		System.out.println("Tồn tại --> " + path.contains("def"));
	}

	private static boolean isImage(String path) {
		for (String imgExt : extensions) {
			if (path.toLowerCase().endsWith(imgExt)) {
				return true;
			}
		}
		return false;
	}
}

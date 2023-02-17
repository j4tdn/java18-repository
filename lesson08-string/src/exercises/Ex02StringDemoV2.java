package exercises;

/**
 * 1. Kiểm tra kí tự, chuỗi bắt đầu, kết thúc trong chuỗi s có phải là s1 không
 * 2. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s 
 * 3. Loại bỏ các khoảng trắng thừa của chuỗi s3
 * 4. Tạo chuỗi con từ chuỗi s bắt đầu từ vị trí số 2
 * --> substring(): cắt chuỗi
 * 5. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
 * --> contains()
 */

public class Ex02StringDemoV2 {
	
	private static String[] extensions = {"jpg", "jpeg", "png", "gif"};
	
	public static void main(String[] args) {
		// 1. Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu/kết thúc trong chuỗi s
		// 1.1 Kiểm tra loại sách là SGK, STK
		System.out.println("1. Sách tham khảo: " + ("STK123".startsWith("STK")));
		System.out.println("1. Sách tham khảo: " + ("STA123".startsWith("STK")));
		
		// 1.2 Kiểm tra định dạng file có phải là hình ảnh hay không
		String path = "C:\\download\\default.png";
		System.out.println("Hình ảnh: " + isImage(path));
		
		// 2. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s 
		String s = "STK123STK";
		String s1 = "STK";
		String s2 = "SGK";
		String s3 = "    Welcome     to     our class   ";
		
		System.out.println("After replacing: " + s.replace(s1, s2));
		
		// 3. Loại bỏ các khoảng trắng thừa của chuỗi s3
		System.out.println("Remove extra space: " + s3.trim().replaceAll("[\\s]+", " "));
		
		// 4. Tạo chuỗi con từ chuỗi s bắt đầu từ vị trí số 2
		String str = "le van teo";
		System.out.println("Chuỗi con: " + str.substring(2));
		
		// 4.1 Lấy tên hình ảnh
		int start = path.lastIndexOf("\\") + 1;
		int end = path.lastIndexOf(".");
		System.out.println("Tên hình ảnh: " + path.substring(start, end));
		
		// 5. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
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

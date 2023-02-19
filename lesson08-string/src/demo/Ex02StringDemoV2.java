package demo;

import java.lang.reflect.Array;

import bean.A;

public class Ex02StringDemoV2 {
private static String[] extensions = {"jpg", "jpeg", "png", "gif"};
	
	public static void main(String[] args) {
		A a1 = new A(4);
		A a2 = new A(8);
		A[] ar1 = {a1, a2, null, null};
		A[] ar2 = Array.copyOfRange(ar1, 0, 2);
		// ar2[0].setP(99999);
		ar2[0] = new A(9999);
		System.out.println("ar1 --> " + Arrays.toString(ar1));
		
		// regex OR
		// a|à|á
		// [aàá]
		
		// Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
		
		// 1. Kiểm tra loại sách là SGK, STK
		// 2. Kiểm tra định dạng file có phải là hình ảnh hay ko
		System.out.println("1 --> Sách tham khảo STK123: " +  ("STK123".startsWith("STK")));
		System.out.println("1 --> Sách tham khảo STA123: " +  ("STA123".startsWith("STK")));
		
		String path = "C:\\download\\default.png";
		System.out.println("Hình ảnh " + isImage(path));
		
		// Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
		// replace
		
		// Loại bỏ các khoảng trắng thừa của chuỗi s3
		// replaceAll, trim, strip
		
		String s = "le van teo";
		// Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
		System.out.println("Chuỗi con: " + s.substring(2));
		
		int start = path.lastIndexOf("\\") + 1;
		int end = path.lastIndexOf(".");
		System.out.println("Tên file: " + path.substring(start, end));
		
		// Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		System.out.println("Tồn tại --> " + path.contains("def"));
	}
	
	private static boolean isImage(String path) {
		for (String imgExt: extensions) {
			if (path.toLowerCase().endsWith(imgExt)) {
				return true;
			}
		}
		return false;
	}
}

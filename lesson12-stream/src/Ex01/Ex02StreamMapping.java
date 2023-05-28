package Ex01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import utils.PrintUtils;

public class Ex02StreamMapping {
	public static void main(String[] args) {
		String fullname = "Le Van Teo";
		
		//yêu cầu : lấy kí tự đầu tiên của mỗi từ và nối lại --> LVT
		
		String[] words = fullname.split("\\s");
		
		//collection(List,Set) --> Stream --> .stream
		//Array --> Stream --> Array.stream(...)
		
		String defAvt = Arrays.stream(words).map(w -> String.valueOf(w.charAt(0))).collect(Collectors.joining());
		
		System.out.println(fullname + "--> " + defAvt);
		
		// thực hành với flatmap
		
		List<List<String>> playres = List.of(
				List.of("2 rô","3 chuồn"),
				List.of("7 rô","8 bích"),
				List.of("5 cơ","9 bích")
				);
		// yêu cầu : Tìm những quân bài là 2
		PrintUtils.Print("Tìm những quân bài là 2", playres.stream().flatMap(l -> l.stream()).filter(card -> card.startsWith("2")).collect(Collectors.toList()));
	}
}

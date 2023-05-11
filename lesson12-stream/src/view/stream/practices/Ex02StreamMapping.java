package view.stream.practices;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import utils.PrintUtils;

public class Ex02StreamMapping {
	public static void main(String[] args) {
		String fullname = "Le Van Teo";
		
		// Yêu cầu: lấy ký tự đầu tiên trong mỗi từ và nối lại
		String[] words = fullname.split("\\s+");
		
		// Collection(List, Set) --> Stream --> .stream
		// Array --> Stream --> Arrays.stream(...)
		
		String defAvt = Arrays.stream(words) // Stream<String>
		      .map(w -> String.valueOf( w.charAt(0))) // Stream<String>
		      .collect(Collectors.joining("-")); // cách nhau bởi dấu gạch ngang. Ko muốn như thế thì .joining() ko truyền gì vào
		
		System.out.println(fullname + " --> " + defAvt);
		
		/*
		 * compile() --> hỗ trợ cho việc split theo regex gì 
		 * splitAsStream() --> split theo regex ở trên rồi trả về Stream
		 * (cách ngắn gọn hơn ở trên, vì mục đích chung là sau khi split xong muốn chuyển về Stream)
		 */
		
		String defLinkedAvt = Pattern.compile("\\s")
				.splitAsStream(fullname)
				.map(w -> String.valueOf( w.charAt(0))) 
			    .collect(Collectors.joining());
		
		System.out.println(fullname + " --> " + defLinkedAvt);
				
		// IntStream, DoubleStream, LongStream 
		
		
		// Thực hành với flatMap
		List<List<String>> players = List.of(
				List.of("2 rô", "3 chuồn"),
				List.of("7 cơ", "8 bích"),
				List.of("5 cơ", "9 bích")
				
				);
		PrintUtils.print("Yêu cầu: tìm những quân bài là 2 còn lại trong người chơi", 
		players.stream() // Stream<List<String>>
		       .flatMap(Collection::stream) // Stream<String> // list -> list.stream()
		       .filter(card -> card.startsWith("2"))
		       .collect(Collectors.toList()));
		 
		
	}
}

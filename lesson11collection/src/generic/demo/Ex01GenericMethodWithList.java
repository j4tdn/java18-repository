package generic.demo;
import java.util.List;
public class Ex01GenericMethodWithList {
	
	//viết 1 phương thức dùng để in danh sách các phần tử trong mảng 1 chiều
	//Mảng: số nguyên,số thực,chuỗi,đối tượng
	
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4 ,5);
		List<String> sequences = List.of("A", "B", "C", "D");
		List<Double> points = List.of(7.8d, 2.2d, 6.4d);
		printf("number", numbers);
		printf("sequences", sequences);
		printf("points", points);
	}
	//List<E> --> E là generictype, tham số mà người dùng phải truyền KDL đối tượng vào
	private static <E> void printf(String title,List<E> elements) {
		System.out.println(title+" ---> ");
		for(E element: elements) {
			System.out.println(element+" ");
		}
		System.out.println();
	}
}

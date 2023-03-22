package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawTypeIdea {
	public static void main(String[] args) {
		// before jdk 1.4
		//Raw Type: KDL thô vì chứa khai báo KDL của phần tử bên trong List
		// Tương tự với danh sách đối tượng --> Object
		// có thể chứa bất kì KDL gì
				
		List list = new ArrayList<>();
		list.add(1);
		list.add(22);
		// list.add("a");
		
		for (Object o : list) {
			System.out.println(Integer.parseInt(o.toString()));
		}
		
		List< Integer> numbers = new ArrayList<>();
		numbers.add(25);
		numbers.add(38);
		// after jdk 1.5
		//			 1.7
		
		
		for (Integer number : numbers) {
			System.out.println(number * 2);
		}
	}

}

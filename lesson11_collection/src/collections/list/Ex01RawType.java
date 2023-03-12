package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawType {
	public static void main(String[] args) {
		//Before jdk1.4
		List lists = new ArrayList();
		
		
		//After jdk1.5
		List<Integer> list = new ArrayList<>();
		list.add(2);
	}
}

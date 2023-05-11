package view.stream;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;
import utils.PrintUtils;

public class Ex03StreamOperations {
	public static void main(String[] args) {
		/*
		 Stream Operation --> hàm/thao tác trong stream có 2 loại 
		 + Intermediate operation: 
		   -> thao tác trung gian
		   -> gọi xong luôn trả về stream 
		   --> hình thành stream pipeline 
		   --> lazy operation, không thực hiện gì cho đến khi terminal operation được gọi
		   --> VD: filter, map, limit,...
		   
		 + Terminal operation:
		   -> thao tác  dùng để thực thi stream pipeline
		   -> gọi xong kết quả chuyển đổi từ stream sang CTDL khác (String, Array, List, Set,...)
		   --> VD: collect, forEach, count,...
		 */
		
		// Liệt kê tên của 3 đĩa thức ăn (đầu tiên trong danh sách) có lượng calo lớn hơn 300
		Set<String> result = DataModel.getDishes().stream() // Stream<Dish>
		    .filter(d -> d.getCalories() > 300) // Stream<Dish>
		    .map(Dish::getName) // Stream<String>
		    .limit(3) // Stream<String>
		    .collect(Collectors.toCollection(LinkedHashSet::new)); // Set<String>
		PrintUtils.print("Liệt kê tên của 3 đĩa thức ăn (đầu tiên trong danh sách) có lượng calo lớn hơn 300", result);
		
		// return String[]
		String[] resultString = DataModel.getDishes().stream() // Stream<Dish>
			    .filter(d -> d.getCalories() > 300) // Stream<Dish>
			    .map(Dish::getName) // Stream<String>
			    .limit(3) // Stream<String>
			    .toArray(String[]::new);
		System.out.println(Arrays.toString(resultString));
		
		// just for testing about lazy operation
		Set<String> testing = DataModel.getDishes().stream() 
			    .filter(d -> {
			    	System.out.println("filtering --> " + d.getName());
			    	return d.getCalories() > 300;
			    }) 
			    .map(d -> {
			    	System.out.println("mapping --> " + d.getName());
			    	return d.getName();
			    }) 
			    .limit(3) 
			    .collect(Collectors.toCollection(LinkedHashSet::new));
	}
}
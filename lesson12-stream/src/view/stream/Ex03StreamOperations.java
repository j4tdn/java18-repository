package view.stream;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;
import util.PrintUtils;

public class Ex03StreamOperations {
	public static void main(String[] args) {
		/*
		 
		 Stream Operation --> hàm/thao tác trong stream chỉ có 2 loại
		 + intermediate operation
		   -> thao tác trung gian
		   -> gọi xong trả về luôn stream
		   --> hình thành stream pipeline
		   --> lazy operation, ko thực hiện gì cho đén khi terminal operation được gọi
		   		. only computed if needed
		   -> VDL filter, map, limit ...
		   
		 + terminal operation:
		   -> thao tác dùng để thực thi stream pipeline
		   -> gọi xong kq chuyển đổi từ stream sang ctdl khác(string, array, list, set ...)
		   --> VD: collect, forEach, count ...
		 */
		
		// Liệt kê tên của 3 đĩa thức ăn có lượng calo lớn hơn 300
		Set<String> result = DataModel.getDishes().stream()
			.filter(d -> d.getCalories() > 400)
			.map(Dish::getName)
			.limit(3)
			.collect(Collectors.toCollection(LinkedHashSet::new));
		
		PrintUtils.print("Liệt kê tên của 3 đĩa thức ăn có lượng calo lớn hơn 300", result);
		
	}
}

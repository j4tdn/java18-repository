package view.stream;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;
import utils.PrintUtils;

public class Ex03StreamOperation {
	public static void main(String[] args) {
		/*
		 * 
		 * Stream Operation --> hàm/thao tác trong stream có 2 loại +intermediate
		 * operation --> thao tác trung gian --> gọi xong luôn trả về stream --> lazy
		 * operation: không thực hiện gì cho đến khi terminal operation được gọi .only
		 * conputed if needed VD:filter,map,limit ...
		 * 
		 * +terminal operation: --> thao tác dùng để thực thi stream pipeline --> gọi
		 * xong kq chuyển đỏi từ stream sang cấu trúc dữ liệu
		 * khác(String,array,list,set,...) --> VD: collect,forEach,count,...
		 */

		// Liệt kê tên của 3 đĩa thưc ăn có lượng calo lớn hơn 300k

		Set<String> result = DataModel.getDishes().stream().filter(d -> d.getCalories() > 400).map(Dish::getName)
				.limit(3).collect(Collectors.toCollection(LinkedHashSet::new));//Set<String>
		PrintUtils.print("Liệt kê tên của 3 đĩa thưc ăn có lượng calo lớn hơn 300", result);

	}
}

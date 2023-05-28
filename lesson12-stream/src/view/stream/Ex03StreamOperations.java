package view.stream;

import model.DataModel;

public class Ex03StreamOperations {
	public static void main(String[] args) {

		/*
		 Stream Operation --> hàm/thao tác trong stream có 2 loại
		 + intermediate operation
		   -> thao tác trung gian
		   -> gọi xong luôn trả về stream
		   -> hình thành stream pipeline
		   -> lazy operation, ko thực hiện gì cho đến khi terminal operation được gọi
		      . only computed if needed
		   -> VD: filter, map, limit ...
		   
		 + terminal operation:
		   -> thao tác dùng để thực thi stream pipeline
		   -> gọi xong kq chuyển đổi từ stream sang ctdl khác(string, array, list, set ..)
		   -> VD: collect, forEach, count, toArray ...
		 */
		
		DataModel.getDishes().stream() // Stream<Dish>
			.filter(d -> {
				System.out.println("filtering --> " + d.getName());
				return d.getCalories() > 400;
			}) // Stream<Dish>
			.map(d -> {
				System.out.println("mapping --> " + d.getName());
				return d.getName();
			}) // Stream<String>
			.limit(3)//; // Stream<String>
			.toArray(String[]::new);
			// .collect(Collectors.toCollection(LinkedHashSet::new)); // Set<String>
		
		// System.out.println("result set --> " + result.getClass());
		
		//PrintUtils.print("Liệt kê tên của 3 đĩa thức ăn có lượng calo lớn hơn 400 đầu tiên trong danh sách",
				//result);
	}
}

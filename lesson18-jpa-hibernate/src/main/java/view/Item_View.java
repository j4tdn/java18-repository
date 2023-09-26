package view;


import service.ItemService;
import service.ItemServiceImpl;
import utils.SqlUtils;

public class Item_View {

	private static ItemService itemService;

	static {
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {

		SqlUtils.generate(
				"Câu 2AB: Liệt kê toàn bộ các mặt hàng",
				itemService.getAll()
		);
		
		// System.out.println("items[2] --> "+ items.get(2).getItemGroup());
		
		var item = itemService.getItem(3);
		
		System.out.println(
				"Câu 3: Liệt kê mặt hàng theo mã mặt hàng \n\t"
			 +  item);
		
		var itemDetails = item.getItemDetails();
		
		SqlUtils.generate(
				"\nCâu 4: Liệt kê toàn bộ các mặt hàng chứa thông tin kích cỡ",
				itemDetails
		);
	}
}
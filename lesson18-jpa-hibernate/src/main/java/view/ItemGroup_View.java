package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.SqlUtils;

public class ItemGroup_View {
	private static ItemGroupService itemGroupService;

	static {
		itemGroupService = new ItemGroupServiceImpl();
	}

	public static void main(String[] args) {

		SqlUtils.generate(
				"Câu 1A: Liệt kê toàn bộ các loại hàng",
				itemGroupService.getAll()
		);
		
	}
}

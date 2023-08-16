package view;

import bean.ItemGroup;
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
		
		SqlUtils.generate(
				"Câu 1B: Liệt kê loại hàng theo mã loại",
				itemGroupService.get(5)
		);
		
		SqlUtils.generate(
				"Câu 1C: Thêm mới loại hàng",
				() -> itemGroupService.save(ItemGroup.of()
						.withId(12)
						.withName("Loại Hàng 12"))
		);
		
		

	}
}

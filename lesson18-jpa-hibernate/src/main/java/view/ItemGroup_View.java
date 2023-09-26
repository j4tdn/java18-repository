package view;


import java.util.Set;

import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.SqlUtils;

public class ItemGroup_View {

	private static ItemGroupService itemGroupService;

	static {
		itemGroupService = new ItemGroupServiceImpl();
	}

	public static void main(String[] args) {
		
		System.out.println("Câu 6: Thêm mới loại hàng");
		itemGroupService.save(new ItemGroup(20, "Item Group 20"));
		
		itemGroupService.addNewItemGroups(4);

		var itemGroups = itemGroupService.getAll();
		
		SqlUtils.generate(
				"Câu 1A: Liệt kê toàn bộ các loại hàng",
				itemGroups
		);
		
		System.out.println("itemGroups[2] --> " + itemGroups.get(2).getItems());
		
		SqlUtils.generate(
				"Câu 5: Đếm số lượng các mặt hàng theo từng loại hàng",
				itemGroupService.getItemGroupDetails(Set.of(1,2,3,4))
		);
	}
}

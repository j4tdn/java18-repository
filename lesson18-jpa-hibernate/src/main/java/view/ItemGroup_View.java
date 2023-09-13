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
		
		var itemGroups = itemGroupService.getAll();
		SqlUtils.generate(
				"Câu 1A: Liệt kê toàn bộ các loại hàng", 
				itemGroups
		);
		
		System.out.println("==========================");
		
		System.out.println("Liệt kê các items thuộc item_group");
		System.out.println("itemGroup[2] --> " + itemGroups.get(2).getItems());
		
	}

}

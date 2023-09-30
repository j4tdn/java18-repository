package view;

import java.util.List;
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

		// Câu 6: thêm mới loại hàng
		itemGroupService.save(new ItemGroup(17, "item group 17"));
		
		SqlUtils.generate(
				"CÃ¢u 1A: Liá»‡t kÃª toÃ n bá»™ cÃ¡c loáº¡i hÃ ng",
				itemGroupService.getAll()
		);
		
		SqlUtils.generate(
				"Câu 5: Đếm số lượng các mặt hàng theo từng loại hàng",
				itemGroupService.getItemGroupDetails(Set.of(1,2,3,4))
		);
		
	}
}
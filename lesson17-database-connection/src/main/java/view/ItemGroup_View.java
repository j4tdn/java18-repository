package view;

import java.util.List;
import java.util.Set;

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
		
		// Khi thêm mới 1 entry đã tồn tại trong dtbase
		// 1. bắt lỗi
		// 2. thực hiện update
		SqlUtils.generate(
				"Câu 1C: Thêm mới loại hàng",
				() -> itemGroupService.saveOrUpdate(ItemGroup.of()
						.withId(13)
						.withName("Loại Hàng 13"))
		);
		
		SqlUtils.generate(
				"Câu 1D: Thêm mới danh sách loại hàng",
				() -> itemGroupService.save(
						List.of(new ItemGroup(14, "Loại hàng 14"),
								new ItemGroup(15, "Loại hàng 15	"),
								new ItemGroup(16, "Loại hàng 16"))
						)
		);
		
		SqlUtils.generate(
				"Câu 1G: Liệt kê loại hàng theo mã loại (1,2,5)",
				itemGroupService.getItemGroupByIds(Set.of(1,2,5))
		);
		
		SqlUtils.generate(
				"Câu 2: Liệt kê itemGroup",
				itemGroupService.getItemGroupDetails()
		);
	}
}
	package view;

import java.util.List;

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
//		SqlUtils.generate("Câu 1A: Liệt kê toàn bộ các loại hàng", itemGroupService.getAll());
//
//		SqlUtils.generate("Câu 1B: Liệt kê loại hàng theo mã loại", itemGroupService.get(3));
//
//		SqlUtils.generate("Câu 1C: Thêm mới/cập nhật loại hàng",
//				() -> itemGroupService.saveOrUpdate(ItemGroup.of().withId(12).withName("Loại Hàng 1221")));
//
//		SqlUtils.generate("Câu 1D: Liệt kê loại hàng theo mã loại", itemGroupService.get("Áo"));
//
//		// khi thêm/cập nhật danh sách sử dụng jdbc addBatch, executeBatch
//		SqlUtils.generate("Câu 1E: Thêm mới danh sách loại hàng",
//				() -> itemGroupService.save(
//						List.of(new ItemGroup(17, "Loại Hàng 17"),
//								new ItemGroup(18, "Loại Hàng 18"), 
//								new ItemGroup(19, "Loại Hàng 19"))));
		SqlUtils.generate(
				" Câu 1F: Liệt kê loại hàng theo tên", 
				itemGroupService.get("Áo"));
	}

}

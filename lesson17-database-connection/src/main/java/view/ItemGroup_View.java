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
		
		// khi thêm mới 1 entry đã tồn tại trong database table
		// --> 1. bắt lỗi
		// --> 2. thực hiện cập nhật dữ liệu với điều kiện là PK
		SqlUtils.generate(
				"Câu 1C: Thêm mới/cập nhật loại hàng",
				() -> itemGroupService.saveOrUpdate(ItemGroup.of()
						.withId(13)
						.withName("Loại Hàng 13"))
		);
		
		// khi thêm/cập nhật danh sách sử dụng jdbc addBatch, executeBatch
		SqlUtils.generate(
				"Câu 1D: Thêm mới danh sách loại hàng",
				() -> itemGroupService.save(
						List.of(
								new ItemGroup(17, "Loại Hàng 17"),
								new ItemGroup(18, "Loại Hàng 18"),
								new ItemGroup(19, "Loại Hàng 19")
						)
				)
		);
		
		/*
		 tham số 'name' khi tìm kiếm sẽ do người dùng nhập vào
		 + nhập bình thường: áo, quần, mũ
		 + tech: nhập theo kiểu sql injection(text để câu lệnh sql luôn đúng, luôn trả về data) 
		         để lấy cắp data
		   --> SELECT *
		         FROM item_group
		        WHERE NAME = 'abcxyz' OR '1=1'  
		        
		        WHERE NAME = 'abcxyz'; DELETE ... '  
		*/
		String searchText = "abcxyz' OR '1=1";
		searchText = "Quần";
		SqlUtils.generate(
				"Câu 1E: Liệt kê loại hàng theo tên loại",
				itemGroupService.get(searchText)
		);
		
		System.out.println("------------------");
		
		SqlUtils.generate(
				"Câu 1G: Liệt kê loại hàng theo mã loại(1,2,5)",
				itemGroupService.getItemGroupsByIds(Set.of(1,2,5))
		);
		
		

	}
}

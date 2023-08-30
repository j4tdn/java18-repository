package view;

import java.util.List;

import bean.ItemGroup;
import dao.ItemGroupDao;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.SqlUtils;

public class ItemGroupView {
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	public static void main(String[] args) {
//		SqlUtils.generate(
//				"Câu 1A: Liệt kê toàn bộ các loại hàng",
//				itemGroupService.getAll()
//		);
		
//		SqlUtils.generate(
//				"Câu 1B: Liệt kê loại hàng theo mã loại",
//				itemGroupService.get(5)
//		);
//		
//		SqlUtils.generate(
//				"Câu 1C: Thêm mới/cập nhật loại hàng",
//				() -> itemGroupService.saveOrUpdate(ItemGroup.of()
//						.withId(13)
//						.withName("Loại Hàng 1333"))
//		);
//		SqlUtils.generate(
//				"Câu 1D: Thêm mới danh sasch  loại hàng",
//				() -> itemGroupService.save(
//						List.of(
//								new ItemGroup(14, "Loại hàng 14")
//								, new ItemGroup(15, "Loại hàng 15") 
//								, new ItemGroup(16, "Loại hàng 16"))
//		));
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
//		SqlUtils.generate(
//		"Câu 1E: Liệt kê tất cả mặt hàng theo mã loại",
//		itemGroupService.getItemsByItemGroupID(1)
//);
//		SqlUtils.generate(
//				"Câu 1F: Liệt kê tất cả các loại hàng(LoaiHang, Danh Sach MatHang) theo MaLH",
//				itemGroupService.getItemGroup_ItemByItemGroupID(1)
//		);
//		SqlUtils.generate(
//				"Câu 1G: Liệt kê các mặt hàng(MatHang) được bán trong ngày bất kì",
//				itemGroupService.getItemsByDate("2023-07-22")
//		);
		
	}
}

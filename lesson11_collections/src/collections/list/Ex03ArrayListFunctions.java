package collections.list;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static java.util.Comparator.*;
import bean.Store;

public class Ex03ArrayListFunctions {
	
	// string --> length()
	// array --> length
	// list --> .size()
	
	public static void main(String[] args) {
		// list, arraylist --> danhsach
		// add-addAll, remove-removeAll-removeIf, grt, set
		// contains
		// sorting
		Store s3 = new Store(5, "S1", LocalDate.of(2023, 03, 14), 101);
		List<Store> stores = new ArrayList<>();
		stores.add(new Store(1, "S1", LocalDate.of(2023, 03, 14), 101));
		stores.add(new Store(2, "S2", LocalDate.of(2023, 02, 14), 102));
		stores.add(s3);
		stores.add(new Store(3, "S3", LocalDate.of(2023, 01, 14), 103));
		stores.add(new Store(4, "S4", LocalDate.of(2023, 12, 14), 104));
		stores.add(new Store(5, "S5", LocalDate.of(2023, 11, 14), 105));
		stores.add(new Store(6, "S6", LocalDate.of(2023, 10, 14), 106));
		
		System.out.println("size --> " + stores.size());
		// (Item item) -> 
		// (Store store) -> System.out.println(store) --> System.out::println
		stores.forEach(System.out::println);
		
		// REMOVE
		
		System.out.println("\n =============== remove at index 4 =============\n");
		stores.remove(4);
		stores.forEach(System.out::println);
		
		
		System.out.println("\n =============== remove at object s3 =============\n");
		stores.remove(s3);
		stores.forEach(System.out::println);
		
		
		System.out.println("\n =============== remove at object s3 =============\n");
		stores.remove(new Store(2, "S2", LocalDate.of(2023, 02, 14), 102));
		stores.forEach(System.out::println);
		
		
		//for (Store )
		// list.remove(Object o)
		// Duyet tung phan tu trong bien list
		// Neu phan tu nao equals (mac dinh so sanh dia chi) voi phan tu can xoa (o) thi xoa phan tu do khoi list
		// Thuc te:
		// vd: CSDL luu tru 10 phan tu nam o 10 o khac nhau
		//	: khi nguoi dung muon xoa --> nhap phan tu muon xoa theo id
		// Muon xoa duoc --> thi phai duyrt tung pphan tu trong list, kiem tra
		// xem phan tu nao co id bang id can xoa --> lay doi tuong do ra
		// roi goi ham remove doi tuong do --> bad performance
		
		// Mong muon
		// Khi truyen phan tu can xoa vao, neu phan tu nao trong list
		// cung id voi phan tu can xoa --> xoa
		// Overide ham equals trong class Store theo thuoc tinh id
		
		
		// Duyet tung phan tu trong bien list
		// Neu phan tu nao equals (cung Store id) voi phan tu can xoa (o) thi xoa phan tu do khoi list
				
			
		/*
		 * Root Cause:
		 * Dang duyet phan tu thu i ma minh da truy cap duoc/ xo phan tu thu i + k
		 * Sau khi xoa duyet den phan tu thu i + k khong con nua
		 * Solving:
		 * Dang duyet phan tu i la chi duoc phep truy cap gia tri tai i
		 * khong duoc truy cap, xoa phan tu khac
		 * --> duyet tuan tu
		 * --> Interable
		 * 		+ iterator
		 */
		System.out.println("\n =============== remove if WarehouseId = 101 =============\n");
		stores.removeIf(store -> store.getWarehouseId() == 101);
		stores.forEach(System.out::println);
		
		// sorting where id desc
		System.out.println("\n =============== sorting where WarehouseId =============\n");
		stores.sort(comparing(Store::getWarehouseId, reverseOrder()).thenComparing(Store::getStartDate, reverseOrder()));
		stores.forEach(System.out::println);
	}

}

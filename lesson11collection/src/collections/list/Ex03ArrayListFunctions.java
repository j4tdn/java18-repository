package collections.list;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import bean.Store;
import static java.util.Comparator.*;

public class Ex03ArrayListFunctions {
	public static void main(String[] args) {
		//list,arraylist  ---> danh sách
		//add-addAll,remove-removeALL-removeIf,get,set,
		//contains
		//sorting
		
		//String -->.length()
		//array -->.length
		//list -->.size()
		
		
		Store s3 = new Store(3, "s3", LocalDate.of(2018, 2, 18), 102);
		
		List<Store> stores = new ArrayList<>();
		stores.add(new Store(1, "s1", LocalDate.of(2017, 3, 27), 101));
		stores.add(new Store(2, "s2", LocalDate.of(2017, 8, 12), 101));
		stores.add(s3);
		stores.add(new Store(4, "s4", LocalDate.of(2019, 6, 26), 102));
		stores.add(new Store(5, "s5", LocalDate.of(2020, 4, 29), 102));
		stores.add(new Store(6, "s6", LocalDate.of(2020, 9, 15), 103));
		
		System.out.println("size--> "+stores.size());
		//(Item item ) -> item.getSalePrice();-->Item::getSalePrice()
		stores.forEach(System.out::println);
//		stores.forEach(new Consumer<Store>() {
//
//			@Override
//			public void accept(Store t) {
//				System.out.println(t.toString());
//				
//			}
//		});
		
		stores.remove(4);
		System.out.println("\\n =============remove at 4 =========================");
		stores.forEach(System.out::println);
		
		System.out.println("\\n =============remove object at 3 =========================");
		stores.remove(s3);
		stores.forEach(System.out::println);
		
		
		//list.remove(Object 0)  ---> internal code
		//Duyệt từng phần tử trong biến list
		//nếu phầntuwr nào equals(mặc định ss địa chỉ) với phần tử cần xoá (0)
		//thì xoá phần tử đó ra khỏi list
		
		
		//Thực tế
		//VD: csdl lưu trữ 10 phần tử năm ở 10 ô nhớ khác nhau
		//	: khi người dùng muốn oá --> nhập phần từ muốn xoá theo id  
		
		
		//muốn xoá được --> hì phải uyệt từng phần từ trong lis,kiểm tra
		//xem phần tử nào có id = id cần xoá --> lấy đối tương đó ra
		//rồi gọi hàm remove đói tượng đó --> bad performance
		
		
		//mong muốn
		//Khi truyền phần tử cần xoá nếu phần tử nào lis cùng id với phần tử cần xoá
		//thì xoá
		//override hàm equals trong class Store theo thuộc tính id
		
		
		//Duyệt từng phần từ trong biến list
		//Nếu phần tử nào equals(cùng store id) với phần từ cần xoá(o)
		//thì xoá phần từ đó khỏi list
		
		
		System.out.println("\\n =============remove object s2 =========================");
		stores.remove(new Store(2, "s2", LocalDate.of(2017, 8, 12), 101));
		stores.forEach(System.out::println);
		
		
		
		//root cause :
			//Đang duyệt phần tử thứ i mà mình đã truy cập được /xoá phần tử thứ i +k
			//Sau khi xoá duyệt đến phần từ i + k không còn nữa
		
		//Solving: Đang duyệt phần từ i là chỉ được phép truy cập giá trị tại i
				  //không được truy câp, xoá phần tử khác
				  //-Duyệt tuần tự
				  //- Interabel
					//+iteraor
		
		     
//		Iterator<Store> storeIteraor = stores.iterator();
//		while (storeIteraor.hasNext()) {
//			Store currentStore  = storeIteraor.next();
//			if(currentStore.getStartedDate().isAfter(LocalDate.of(2018,2,2))) {
//				//xoa phan tu hien tai ma ierator dang dung2
//				storeIteraor.remove();
//			}
//			
//		}
		System.out.println("\\n =============remove if wID = 103 =========================");
		stores.removeIf(store->store.getWarahouseId() ==103);
		stores.forEach(System.out::println);
		
		
		
		//sorting with id desc
		System.out.println("\\n =============sorting with id desc =========================");
		stores.sort(comparing(Store::getWarahouseId,reverseOrder()).thenComparing(Store::getStartedDate,reverseOrder()));
		stores.forEach(System.out::println);
	}
}

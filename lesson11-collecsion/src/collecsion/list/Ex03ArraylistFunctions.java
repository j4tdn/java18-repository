package collecsion.list;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.store;

public class Ex03ArraylistFunctions {
	public static void main(String[] args) {
		List<store> stores = new ArrayList<>();
		stores.add(new store(1,"S1",LocalDate.of(2017, 3, 17),101));
		stores.add(new store(2,"S2",LocalDate.of(2017, 8, 22),101));
		stores.add(new store(3,"S3",LocalDate.of(2018, 2, 18),102));
		stores.add(new store(4,"S4",LocalDate.of(2019, 6, 26),102));
		stores.add(new store(5,"S5",LocalDate.of(2020, 4, 29),102));
		stores.add(new store(6,"S6",LocalDate.of(2020, 9, 15),103));
		store s3 = stores.get(2);
		//store s3 = new store(..);
		System.out.println("size --> " + stores.size());
		// (store store) - > Sysout(store) == System.out::println
		stores.forEach(System.out::println);
		System.out.println("------------remove index------------");
		stores.remove(4);
		stores.forEach(System.out::println);
		System.out.println("---------remove object 3--------");
		stores.remove(s3);
		stores.forEach(System.out::println);
		System.out.println("---------remove object 2--------");
		stores.remove(new store(2,"",LocalDate.of(2021, 2, 2),1));
		stores.forEach(System.out::println);
		stores.removeIf(new Predicate<store>() {

			@Override
			public boolean test(store t) {
				if(t.getWarehouseId()>=103) {
					return true;
				}else {
					return false;
				}
			}
		});
		System.out.println("---------remove if ------");
		stores.forEach(System.out::println);
	}
}

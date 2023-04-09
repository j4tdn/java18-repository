package collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import bean.Employee;

public class Ex03EmployeeDemo {
	public static void main(String[] args) {
		Map<Employee, List<Employee>> office = mockData();

		// how map checks duplicated keys
		Employee m1 = new Employee(1, "M1", 1000d, null);
		Employee e41 = new Employee(41, "E41", 400d, m1.getId());
		Employee e42 = new Employee(42, "E42", 400d, m1.getId());

		// Thông thường 1 đối tượng --> hashcode(Object) -> là địa chỉ mà JVM cấp phát
		// cho vùng nhớ heap
		// --> System.identityHashcode

		// Kiểm tra xem m1 đã 'tồn tại' trong map chưa

		// Duyệt từng phần tử(entry) trong map. Kiểm tra
		// Nếu có entry.getKey nào mà 'trùng' với m1.getKey --> m1 đã tồn tại

		// 'trùng' --> tồn tại 1 key mà equals vs m1 key
		// và key có hash code trùng vs m1 hashcode (mặc định là địa chỉ)

		// --> qua map, set --> overrided hashcode --> dãy số được hashing ra từ giá trị
		// của map entry

		// 2 phần tử employee có id bằng nhau --> thì trùng nhau trong map
		// --> override hàm equals theo id
		// --> override hàm hashcode để hashing employee theo id

		// Nếu chưa --> put vào
		// đã có --> ghi đè
		office.put(m1, List.of(e41, e42));

		System.out.println("office size ---> " + office.size());
		office.forEach((k, v) -> {
			StringBuilder vNames = new StringBuilder();
			v.forEach(e -> {
				vNames.append(e.getName() + " ");
			});
			System.out.println(k + " ---> " + vNames);
		});
	}

	private static Map<Employee, List<Employee>> mockData() {
		// manager(s)
		Employee m1 = new Employee(1, "M1", 1000d, null);
		Employee m2 = new Employee(2, "M2", 800d, m1.getId());
		Employee m3 = new Employee(3, "M3", 800d, m2.getId());

		// employee(s)
		Employee e11 = new Employee(11, "E11", 400d, m1.getId());
		Employee e12 = new Employee(12, "E12", 400d, m1.getId());
		Employee e13 = new Employee(13, "E13", 400d, m1.getId());

		Employee e21 = new Employee(21, "E21", 400d, m2.getId());
		Employee e22 = new Employee(22, "E22", 400d, m2.getId());

		Employee e31 = new Employee(31, "E31", 400d, m3.getId());
		Employee e32 = new Employee(32, "E32", 400d, m3.getId());

		Map<Employee, List<Employee>> result = new LinkedHashMap<>();
		result.put(m1, List.of(e11, e12, e13));
		result.put(m2, List.of(e21, e22));
		result.put(m3, List.of(e31, e32));
		return result;
	}
}
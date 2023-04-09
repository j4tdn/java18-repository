package collection.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Employee;

public class Ex03EmployeeDemo {
	public static void main(String[] args) {
		Map<Employee, List<Employee>> office = mockData();
		
		Employee m1 = new Employee(1, " M1", 10000d, null);
		Employee e41 = new Employee(41, "E41", 800d, m1.getId());
		Employee e42 = new Employee(42, "E42", 800d, m1.getId());
		office.put(m1, List.of(e41, e42));
		
		// thong thuong 1 doi tuong tuong --> hashcode -> la dia chi ma JVM cap phat cho vung dia ch
		// --> System.identityHashcode
		
		// kiem tra xem m1 da ton tai hay trong map chua
		
		// Duyet tung phan tu (entry) trong map. Kiem tra
		// Neu co entry.getKey nao ma 'trung' voi m1.getkey --> m1 da ton tai
		
		// 'trung' --> ton tai 1 key ma equals voi m1 key
		//					va key co hash code trung voi m1 hashcode( mac dinh la dia chi)
		
		// --> qua map, set --> overrided hashcode --> day so duoc hashing ra tu gia tri cua map entry
		
		// Neu chua --> put vao
		// da co    --> ghi de
		
		office.forEach((k, v) -> {
			StringBuilder vNames = new StringBuilder();
			v.forEach(e -> {
				vNames.append(e.getName() + " " );
			});
			System.out.println(k + " --> " + vNames);
		});
	}
	
	private static Map<Employee, List<Employee>> mockData(){
		Employee m1 = new Employee(1, " M1", 10000d, null);
		Employee m2 = new Employee(2, " M2", 8000d, m1.getId());
		Employee m3 = new Employee(3, " M3", 8000d, m2.getId());
		
		Employee e11 = new Employee(11, " E11", 400d, m1.getId());
		Employee e12 = new Employee(12, " E12", 400d, m1.getId());
		Employee e13 = new Employee(13, " E13", 400d, m1.getId());
		
		Employee e21 = new Employee(21, " E21", 400d, m2.getId());
		Employee e22 = new Employee(22, " E22", 400d, m2.getId());
		
		Employee e31 = new Employee(31, " E31", 400d, m3.getId());
		Employee e32 = new Employee(32, " E32", 400d, m3.getId());
		
		Map<Employee, List<Employee>> result = new HashMap<>();
		result.put(m1, List.of(e11, e12, e13));
		result.put(m2, List.of(e21, e22));
		result.put(m3, List.of(e31, e32));
		return result;
		
	}

}

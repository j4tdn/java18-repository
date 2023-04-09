package collection.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Employee;

public class Ex03EmployeeDemo {
	public static void main(String[] args) {
		Map<Employee, List<Employee>> office = mockData();
		
		Employee m1 = new Employee(1, "M1", 1000d, 1);
		Employee e41 = new Employee(41, "E41", 600d, m1.getId());
		Employee e42 = new Employee(42, "E42", 1500d, m1.getId());
		Employee e43 = new Employee(43, "E43", 460d, m1.getId());
		
		office.put(m1, List.of(e41,e42,e43));
		
		office.forEach((k,v) -> {
			StringBuilder vNames = new StringBuilder();
			v.forEach(e -> {
				vNames.append(e.getName() + " ");
			});
			System.out.println(k + " ---> " + vNames);
		});
	}
	
	private static Map<Employee, List<Employee>>mockData(){
		Employee m1 = new Employee(1, "M1", 1000d, null);
		Employee m2 = new Employee(2, "M2", 500d, m1.getId());
		Employee m3 = new Employee(3, "M3", 120d, m2.getId());
		
		Employee e1 = new Employee(11, "E11", 600d, m1.getId());
		Employee e2 = new Employee(12, "E12", 1500d, m1.getId());
		Employee e3 = new Employee(13, "E13", 460d, m1.getId());
		
		Employee e21 = new Employee(21, "E21", 600d, m2.getId());
		Employee e22 = new Employee(22, "E22", 1500d, m2.getId());
		Employee e23 = new Employee(23, "E23", 460d, m2.getId());
		
		Employee e31 = new Employee(31, "E31", 600d, m3.getId());
		Employee e32 = new Employee(32, "E32", 1500d, m3.getId());
		Employee e33 = new Employee(33, "E33", 460d, m3.getId());
		
		Map<Employee, List<Employee>> result = new HashMap<Employee, List<Employee>>();
		result.put(m1, List.of(e1,e2,e3));
		result.put(m2, List.of(e21,e22,e23));
		result.put(m3, List.of(e31,e32,e33));
		
		return result;
	}

}

package files.content;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import bean.Employee;
import utils.FileUtils;

public class Ex03FileWriterSerialize {
	private static final String pathname = String.join(File.separator, "data", "storage", "encrypt.txt");
	
	public static void main(String[] args) {
		System.out.println("\n***____   Start Main   ___***\n");
		
		File file = FileUtils.createFile(pathname);
		List<Employee> employees = mockData();
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(employees);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		System.out.println("\n***____   End Main   ___***\n");
		
	}
	
	private static List<Employee> mockData(){
		return List.of(
				new Employee(1, "E1", 100),
				new Employee(2, "E2", 200),
				new Employee(3, "E3", 300),
				new Employee(4, "E4", 400)
				);
	}

}

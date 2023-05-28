package files.content;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import bean.Employee;
import utils.FileUtils;

public class Ex03FileWriterSerialize {
	private static final String pathname =String.join(File.separator,"data","storage","encrypt.txt");
	public static void main(String[] args) {
		
		File file = FileUtils.createFile(pathname);
		if(file.exists()) {
			List<Employee> employees = mockData();
			FileOutputStream fos=null;
			ObjectOutputStream oos = null;
			try {
				fos= new FileOutputStream(file);
				oos = new ObjectOutputStream(fos);
				oos.writeObject(employees);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					oos.close();
					fos.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
		System.out.println("***___Stop Main___***");
	}
	public static List<Employee> mockData(){
		return List.of(
				new Employee(1, "E1", 100),
				new Employee(2, "E2", 100),
				new Employee(3, "E3", 100),
				new Employee(4, "E4", 100),
				new Employee(5, "E5", 100));
	}
}


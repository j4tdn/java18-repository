package content;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import bean.Employee;
import utils.FileUtils;

public class Ex03FileWriterSerialize {
	
	private static final String pathName = String.join(File.separator, "data","storage","encrypt.txt");
	
	
	public static void main(String[] args) {
		List<Employee> employees = mockData();
		
		//WRITE OBJECT --> data will be serialized
		File file = FileUtils.createFile(pathName);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		//MÃ HOÁ FILE
		if(file.exists()) {
			try {
				fos = new FileOutputStream(file);
				oos = new ObjectOutputStream(fos);
				oos.writeObject(employees);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					oos.close();
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	private static List<Employee> mockData(){
		return List.of(
				new Employee(1,"E1",100),
				new Employee(2,"E2",200),
				new Employee(3,"E3",300),
				new Employee(4,"E4",400),
				new Employee(5,"E5",500),	
				new Employee(6,"E6",600)
			);
	}
}

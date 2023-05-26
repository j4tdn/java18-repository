package file.content;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import bean.Employee;

public class Ex04FileReaderSerialize {
	
	private static final String pathname = String.join(File.separator, "data", "storage", "encrypt.txt");
	
	public static void main(String[] args) {
		File file = new File(pathname);

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			@SuppressWarnings("unchecked")
			List<Employee> employees = (List<Employee>)ois.readObject();
			
			System.out.println("==== >>> Data Result <<< ====");
			employees.forEach(System.out::println);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
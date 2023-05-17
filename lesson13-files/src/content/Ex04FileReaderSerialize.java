package content;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import bean.Employee;

public class Ex04FileReaderSerialize {

	private static final String pathName = String.join(File.separator, "data", "storage", "encrypt.txt");

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		File file = new File(pathName);
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
	

		// MÃ HOÁ FILE
		if (file.exists()) {
			try {
				fis = new FileInputStream(file);
				ois = new ObjectInputStream(fis);
				List<Employee> employees = (List<Employee>)ois.readObject();
				employees.forEach(System.out::println);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					ois.close();
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

package java18_traluong_java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileHandle {
	public static void main(String[] args) throws IOException {
		File file = new File("src/java18_traluong_java/input.txt");
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		List<Integer> numberStore = new ArrayList<>();
		try {
			String line = reader.readLine();

			while (line != null) {
				numberStore.addAll(extractNumbers(line));
				line = reader.readLine();
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Collections.sort(numberStore);
		numberStore.forEach(System.out::println);
		
		FileWriter writer = new FileWriter("src/java18_traluong_java/output.txt"); 
		
        try { 
        	for (int i : numberStore) {
        		writer.write(String.valueOf(i));
        		writer.write(System.getProperty("line.separator"));
        	}
        	writer.close(); 
        } 
        catch (Exception e) { 
            e.getStackTrace(); 
        } 
		
		
	}
	public static List<Integer> extractNumbers(String input) {
        String[] tokens = input.split("\\D+");
        List<Integer> numberStore = new ArrayList<>();
        int i = 0;
        for(String str : tokens) {
        	if (str.length() != 0) {
        		numberStore.add(Integer.parseInt(str));
        	i++;
        }
        }
        return numberStore;
    }
}


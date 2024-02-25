package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class main {
	public static void main(String[] args) {
		try {
			String directoryPath = "data/";
			BufferedReader reader = new BufferedReader(new FileReader(directoryPath+ "input.txt"));
			int n = Integer.parseInt(reader.readLine().trim());
			System.out.println(n);
			ArrayList<Integer> numbers = new ArrayList<>();
			String line;
            while ((line = reader.readLine()) != null) {
            	String[] tokens = line.split("\\D+");
                for (String token : tokens) {
                    if (!token.isEmpty()) {
                        numbers.add(Integer.parseInt(token));
                    }
                }
            }
            System.out.println(numbers);
            reader.close();

            Collections.sort(numbers);
            BufferedWriter writer = new BufferedWriter(new FileWriter(directoryPath + "output.txt"));
            for (Integer number : numbers) {
                writer.write(number + "\n");
            }
            writer.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}

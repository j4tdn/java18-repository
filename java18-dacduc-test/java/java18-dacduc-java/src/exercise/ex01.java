package exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("data/data.txt"));
		int n = Integer.parseInt(br.readLine());
		List<Integer> numbers = new ArrayList<>();
		String line;
		while ((line = br.readLine()) != null) {
			extracts(line, numbers);
		}
		br.close();

		Collections.sort(numbers);

		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("data/output.txt")));
		for (int num : numbers) {
			pw.println(num);
		}
		pw.close();
	}

	private static void extracts(String line, List<Integer> numbers) {
		StringBuilder numStr = new StringBuilder();
		for (char c : line.toCharArray()) {
			if (Character.isDigit(c)) {
				numStr.append(c);
			} else if (numStr.length() > 0) {
				numbers.add(Integer.parseInt(numStr.toString()));
				numStr.setLength(0);
			}
		}
		if (numStr.length() > 0) {
			numbers.add(Integer.parseInt(numStr.toString()));
		}
	}

}

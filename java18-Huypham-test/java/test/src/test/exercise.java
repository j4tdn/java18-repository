package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class exercise {
	public static void main(String[] args) {
        try {
            List<Integer> numbers = readNumbersFromFile("data/input.txt");
            Collections.sort(numbers);
            writeNumbersToFile(numbers, "data/output.txt");
            System.out.println("Sorted numbers have been written to output file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Integer> readNumbersFromFile(String filePath) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                extractNumbers(line, numbers);
            }
        }
        return numbers;
    }

    private static void extractNumbers(String s, List<Integer> numbers) {
        StringBuilder numStr = new StringBuilder();
        for (char c : s.toCharArray()) {
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

    private static void writeNumbersToFile(List<Integer> numbers, String filePath) throws IOException {
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filePath)))) {
            for (int num : numbers) {
                pw.println(num);
            }
        }
    }
}

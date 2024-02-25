package test;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        int n = Integer.parseInt(reader.readLine());
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = reader.readLine().trim();
            numbers.addAll(extractNumbers(line));
        }
        reader.close();
        Collections.sort(numbers);
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        for (int num : numbers) {
            writer.write(num + "\n");
        }
        writer.close();
    }

    private static List<Integer> extractNumbers(String s) {
        List<Integer> numbers = new ArrayList<>();
        StringBuilder currentNumber = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNumber.append(c);
            } else if (currentNumber.length() > 0) {
                numbers.add(Integer.parseInt(currentNumber.toString()));
                currentNumber.setLength(0); 
            }
        }
        if (currentNumber.length() > 0) {
            numbers.add(Integer.parseInt(currentNumber.toString()));
        }
        return numbers;
    }
}

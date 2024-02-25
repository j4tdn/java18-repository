import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new File("src/input.txt"));
            scanner.nextLine();
            List<Integer> results = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                StringBuilder currentNumber = new StringBuilder();
                for (int i = 0; i < line.length(); i++){
                    Character currentLetter = line.charAt(i);
                    if(currentLetter <= '9' && currentLetter >= '0'){
                        currentNumber.append(currentLetter);
                    } else {
                        if(!currentNumber.isEmpty()){
                            int parsedNumber = Integer.parseInt(currentNumber.toString());
                            results.add(parsedNumber);
                        }
                        currentNumber.delete(0, currentNumber.length());
                    }
                }
                if(!currentNumber.isEmpty()){
                    int parsedNumber = Integer.parseInt(currentNumber.toString());
                    results.add(parsedNumber);
                }
            }
            scanner.close();
            Collections.sort(results);
            results.forEach(System.out::println);

            PrintWriter writer = new PrintWriter("src/output.txt");
            for (int number : results) {
                writer.println(number);
            }
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại!");
        }
    }
}
package view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
	private static String inputFilePath = String.join(File.separator, "data", "input.txt");
    private static String outputFilePath = String.join(File.separator, "data", "output.txt");

    public static void main(String[] args) {
        Path inputPath = Paths.get(inputFilePath);
        File outputFile = new File(outputFilePath);

        List<String> inputLines = readFile(inputPath);
        List<Integer> extractedNumbers = new ArrayList<>();
        for (int i = 1; i <= Integer.parseInt(inputLines.get(0)); i++) {
            extractedNumbers.addAll(extractNumbers(inputLines.get(i)));
        }
        List<String> sortedNumbers = extractedNumbers.stream()
                .sorted(Comparator.comparing(Function.identity()))
                .map(String::valueOf)
                .collect(Collectors.toList());
        writeFile(outputFile, sortedNumbers);
    }

    public static List<Integer> extractNumbers(String input) {
        return Arrays.stream(input.split("\\D+"))
                .filter(s -> !s.isEmpty())
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public static List<String> readFile(Path filePath) {
        try {
            return Files.readAllLines(filePath);
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public static void writeFile(File file, List<String> lines) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            for (String line : lines) {
                writer.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

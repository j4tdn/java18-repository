package test;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Ex01IT {
	public static void main(String[] args) {
		
    /*
     * Complete the 'isHappyNumber' function below.
     *
     * The function is expected to return a BOOLEAN.
     * The function accepts INTEGER number as parameter.
     */

    public static boolean isHappyNumber(int number) {
    // write your code here
		Set<Integer> visitedNumbers = new HashSet<>();
    	while (number != 1) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        if (visitedNumbers.contains(sum)) { // if sum is already visited, it's a cycle
            return false;
        }
        visitedNumbers.add(sum);
        number = sum;
    }
    return true;
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int inputNumber = Integer.parseInt(bufferedReader.readLine().trim());

        boolean result = Ex01IT.isHappyNumber(inputNumber);

        bufferedWriter.write(String.valueOf(result ? 1 : 0));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

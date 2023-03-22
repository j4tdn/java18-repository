package exercise;

import java.util.Arrays;
import java.util.Comparator;

public class ex04 {
	public static void main(String[] args) {
        String[] arr = {"Special", "hello", "-5", "8", "java", "-10"};
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        Arrays.sort(arr, new StringComparator());
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

class StringComparator implements Comparator<String> {
    @Override
    public int compare(String x, String y) {
        if (x.equals("special") && y.equals("special")) {
            return 0;
        } else if (x.equals("special")) {
            return -1;
        } else if (y.equals("special")) {
            return 1;
        } else if (isNumeric(x) && isNumeric(y)) {
            int i = Integer.parseInt(x);
            int j = Integer.parseInt(y);
            return Integer.compare(i, j);
        } else if (isNumeric(x)) {
            return -1;
        } else if (isNumeric(y)) {
            return 1;
        } else {
            return x.compareToIgnoreCase(y);
        }
    }

    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
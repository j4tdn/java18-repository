package generic.demo;

import bean.Store;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Ex01GenericMethodWithArray {
    // Viết một phương thức ể in danh sách các phần tử trong mảng 1 chiều
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5};
        Double[] points = {5.0d, 6.5d, 8.0d, 9.0d};
        Arrays.sort(points);
        Store[] stores = { new Store(1, "S1", LocalDate.now(), 0),
                new Store(2, "S2", LocalDate.now(), 1)
        };


        // printf(numbers);
    }

    private static <T> void printf(T[] elements){
        for(T t : elements){
            System.out.print(t + " ");
        }
    }

    private static <E extends Comparable<E>> void sort(E[] elements){
        Arrays.sort(elements);
    }
}

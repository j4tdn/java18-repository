package generic.demo;

import java.util.List;

public class Ex02GenericMethodWithList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4);
        List<String> strings = List.of("A", "B", "C", "D");
        List<Double> points = List.of(5.0d, 6.5d, 8.0d, 9.0d);

        printfWildcard("strings", strings);

        // printf(numbers);
    }

    private static void printfWildcard(String title, List<? super String> elements){
        System.out.print(title + "--> ");
        for(Object e : elements){
            System.out.print(e + " ");
        }
    }

    private static <T> void printf(List<T> list){
        list.forEach(t -> System.out.print(t + " "));
    }
}

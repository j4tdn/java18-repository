package view.stream.practice;

import bean.Apple;
import utils.PrintUtils;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex01StreamFilteringAndSlicing {
    public static void main(String[] args) {
        /*
        * Cho danh sach so nguyen --> List<Integer>, int[]
        * */

        List<Integer> numbers = List.of(1,2,1,7,3,3,2,4);
        List<Integer> ex01 = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        PrintUtils.Print("ex01 --> ", ex01);

        // thuoc tinh group by --> key
        // nhung phan tu cung key --> dua vao nhom --> value --> List<Element>
        // 1 --> 1,1
        // 2 --> 2,2,2
        // 7 --> 7
        // 3 --> 3,3
        // 4 --> 4
        Map<Integer, List<Integer>> ex02 = numbers.stream()
                .collect(Collectors.groupingBy(integer -> integer));

        Set<Integer> ex022 = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().filter(e -> e.getValue() == 1L)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println(ex022);

        // Liệt kê danh sách các origin riêng biệt


    }
}

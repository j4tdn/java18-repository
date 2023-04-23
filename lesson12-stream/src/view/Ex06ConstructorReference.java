package view;

import bean.A;
import bean.Apple;
import functional.PentaFunction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Ex06ConstructorReference {
    public static void main(String[] args) {
        /*
        * lambda: () -> new T() --> T::new
        *
        * */
        Supplier<Apple> supplier = Apple::new;

        Apple apple = supplier.get();
        System.out.println("apple --> " + apple);

        // vi du : mapping luu tru danh sach bien so xe o viet nam
        // sap xep chung theo ten tinh than tang dan
        Map<Integer, String> modelMap = new HashMap<>();
        modelMap.put(43, "Da Nang");
        modelMap.put(92, "Quang Nam");
        modelMap.put(75, "Thua Thien Hue");
        modelMap.put(74, "Quang Tri");

        // su dung sorted trong KDL stream
        // Stream<T> --> ho tro them nhieu ham

        Map<Integer, String> streamSortedMap = modelMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
                        // dua tung phan tu tu stream qua map
                        // default : toMap -> HashMap || expect : linkedHashMap
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, new BinaryOperator<String>() {
                            @Override
                            public String apply(String v1, String v2) {
                                return v2;
                            }
                        }, new Supplier<Map<Integer, String>>() {
                            @Override
                            public Map<Integer, String> get() {
                                return new LinkedHashMap<>();
                            }
                        }));

        Map<Integer, String> streamSortedMap2 = modelMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
                // dua tung phan tu tu stream qua map
                // default : toMap -> HashMap || expect : linkedHashMap
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v2,
                        () -> new LinkedHashMap<>()));


        streamSortedMap.forEach((k, v) -> System.out.println(k + " --> " + v));

        //====================================================================

        List<Apple> convertedApple = readFile("lesson12-stream/data-apple.txt",
                line -> new Apple(line));
        convertedApple.forEach(System.out::println);

        // type interface
        Supplier<Apple> s1 = Apple::new;
        Function<String, Apple> f1 = Apple::new;
        PentaFunction<Integer, String, Double, String, Apple> p1 = Apple::new;
    }

    public static Apple lineToAplle(String line){
        return new Apple(line);
    }

    private static <R> List<R> readFile(String path, Function<String, R> func){
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<R> results = new ArrayList<>();
        if(lines != null && !lines.isEmpty()){
            // convert lines(List<String>) --> List<Apple>
            for(String line : lines){
                R converted = func.apply(line);
                results.add(converted);
            }
        }
        return results;
    }
}

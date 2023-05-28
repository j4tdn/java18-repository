package view.stream;

import bean.Apple;
import model.DataModel;

import java.util.List;
import java.util.stream.Stream;

public class TraversableOnlyOnce {
    public static void main(String[] args) {
        List<Apple> inventory = DataModel.getApples();

        Stream<Apple> stream = inventory.stream();

        // Duyet lan 1
        stream.forEach(System.out::println);

        // Duyet lan 2
        stream.forEach(System.out::println);



    }
}

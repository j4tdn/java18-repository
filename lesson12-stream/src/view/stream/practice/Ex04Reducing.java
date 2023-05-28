package view.stream.practice;

import bean.Dish;
import model.DataModel;
import utils.PrintUtils;

import javax.xml.crypto.Data;
import java.util.List;

public class Ex04Reducing {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,5,2,6,2,7);

        Integer sum = numbers.stream().reduce(0, (result, number) -> result + number);
        PrintUtils.Print("sum", sum);

        numbers.stream().reduce((max, number) -> max < number ? number : max).ifPresent(v -> System.out.println("2. Find max in numbers --> " + v));
        PrintUtils.Print("2. Find max in numbers",
                numbers.stream().reduce((max, number) -> max < number ? number : max));

        List<Dish> dishes = DataModel.getDishes();
        dishes.stream().reduce((min, dish) -> dish.getCalories() < min.getCalories() ? dish : min)
                .ifPresent(v -> System.out.println("min calories --> " + v.getName() + " : " + v.getCalories()));

    }
}

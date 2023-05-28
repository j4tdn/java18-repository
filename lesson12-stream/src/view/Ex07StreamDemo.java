package view;

import bean.Dish;
import model.DataModel;
import static utils.PrintUtils.*;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex07StreamDemo {
    public static void main(String[] args) {
        List<Dish> menu = DataModel.getDishes();

        // 1. Liet ke mon an co luong calo > 250 --> filter
        Set<Dish.Kind> kinds = menu.stream()
                .map(Dish::getKind)
                .collect(Collectors.toSet());

        // B1 : Chuyen doi tu CTDL nao do --> CTDL stream
        // Stream<Dish> streamingDish = menu.stream();

        // B2 : Su dung nhung ham co san trong stream de xu ly
        //    : KQ tra ve Stream<?> la 1 tap cac phan tu trong Stream
        //    : builder & strategy pattern
        // Stream<Dish> filterDish = streamingDish.filter(dish -> dish.getCalories() > 250);

        // B3 : Chuyen doi tu Streams<?> sang CTDL mong muon
        // --> list, set, map, array, String, int
        // List<Dish> rs = filterDish.collect(Collectors.toList());
        List<Dish> result = menu.stream()
                        .filter(dish -> dish.getCalories() > 400)
                                .collect(Collectors.toList());
        // Print("Ex01", result);
        Set<Dish.Kind> rsAsString = transformer(result, dish -> dish.getKind());
        Print("Ex01", kinds);

        Set<String> veggieDishes = menu.stream()
                .filter(dish -> Dish.Kind.VEGGIE.equals(dish.getKind()))
                .map(Dish::getName)
                .collect(Collectors.toSet());
    }

    public static <T> Set<T> transformer (List<Dish> dishes, Function<Dish, T> function){
        Set<T> result = new LinkedHashSet<>();
        dishes.forEach(dish -> result.add(function.apply(dish)));
        return result;
    }

    // Liet ke nhung dia thuc an chay

}

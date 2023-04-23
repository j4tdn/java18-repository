package view;

import bean.Apple;
import model.DataModel;

import java.util.Comparator;
import java.util.List;

public class Ex05MethodReferencesNonStatic {
    public static void main(String[] args) {
        List<Apple> inventory = DataModel.getApples();

        /*
        * non-static method reference
        * lambda: (T t) -> t.method()       ---> T::method
        * lambda: (T t) -> ...arg.method(t) ---> ...arg::method
        * */

        inventory.sort(Comparator.comparing(Apple::getWeight));

        inventory.forEach((Apple a) -> System.out.println(a));

    }
}

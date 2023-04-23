package view;

import bean.Apple;
import functional.AppleCondition;
import model.DataModel;

import java.util.ArrayList;
import java.util.List;

public class Ex04MethodReferencesStatic {
    public static void main(String[] args) {
        List<Apple> inventory = DataModel.getApples();

        // lambda expression
        // create a 'static method references' represent for override abstract method
        // + abitrary name
        // + abitrary place (class)
        // --> Required input and output

        List<Apple> greenAndHeavyApples = filterApples(inventory, Ex04MethodReferencesStatic::greenAndWeightApple);

        inventory.sort(Ex04MethodReferencesStatic::sort);
        System.out.println(inventory);

        // System.out.println(greenAndHeavyApples);

    }

    private static List<Apple> filterApples(List<Apple> inventory, AppleCondition ac){
        List<Apple> results = new ArrayList<>();
        for(Apple apple : inventory){
            if(ac.test(apple)){
                results.add(apple);
            }
        }
        return results;
    }

    // Static method reference
    private static boolean greenAndWeightApple(Apple apple){
        return apple.getColor().equals("green") && apple.getWeight() > 150;
    }

    private static int sort(Apple a1, Apple a2){
        int a1Id = a1.getId();
        int a2Id = a2.getId();
        if(a1Id != a2Id){
            return a2Id - a1Id;
        }

        return Double.compare(a1.getWeight(), a2.getWeight());
    }
}

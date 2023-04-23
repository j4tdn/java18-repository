package view;

import bean.Apple;
import functional.AppleCondition;
import functional.WeightHeavierAppleCondition;
import model.DataModel;

import java.util.ArrayList;
import java.util.List;

public class Ex02StrategyPattern {
    public static void main(String[] args) {
        List<Apple> inventory = DataModel.getApples();

        // Cach goi va truyen tham so
        // external/implementation class
        List<Apple> weightApples = filterApples(inventory, new WeightHeavierAppleCondition());
        System.out.println("=== WEIGHT > 150 ===");
        System.out.println(weightApples);

        // anonymous class
        List<Apple> reds = filterApples(inventory, new AppleCondition() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("red");
            }
        });
        System.out.println("=== REDS ===");
        System.out.println(reds);

        // lambda expression
        List<Apple> greenAndHeavyApples = filterApples(inventory, apple -> {
            return apple.getColor().equals("green") && apple.getWeight() > 150;
        });
        System.out.println(greenAndHeavyApples);
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
}

package view;

import bean.Apple;
import model.DataModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Ex01ProblemSolving {
    public static void main(String[] args) {
        List<Apple> inventory = DataModel.getApples();
        System.out.println(findAppleByColor(inventory, "red"));
    }

    //1t : find all green/red apple
    private static List<Apple> findAppleByColor(List<Apple> inventory, String color){
        Objects.requireNonNull(color, "color should not be null !");
        if(inventory.isEmpty()){
            return Collections.emptyList();
        }
        List<Apple> results = new ArrayList<>();
        for(Apple apple : inventory){
            if(color.equals(apple.getColor())){
                results.add(apple);
            }
        }
        return results;
    }

    // 3rd
    private static List<Apple> findAppleByWeight(List<Apple> inventory, Double weight){
        if(inventory.isEmpty()){
            return Collections.emptyList();
        }
        List<Apple> results = new ArrayList<>();
        for(Apple apple : inventory){
            if(apple.getWeight() > weight){
                results.add(apple);
            }
        }
        return results;
    }

    // 5th
    private static List<Apple> findAppleByWeightAndColor(List<Apple> inventory, String color, Double weight){
        if(inventory.isEmpty()){
            return Collections.emptyList();
        }
        List<Apple> results = new ArrayList<>();
        for(Apple apple : inventory){
            if(apple.getWeight() > weight && color.equals(apple.getColor())){
                results.add(apple);
            }
        }
        return results;
    }
}

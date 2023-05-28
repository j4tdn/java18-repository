package view.stream;

import bean.A;
import bean.Dish;
import model.DataModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex02ExternalVsInternalInteration {
    public static void main(String[] args) {
        // Lay ten dia thuc an trong menu
        List<Dish> menu = DataModel.getDishes();

        // External interation
        List<String> list = new ArrayList<>();
        for(Dish dish : menu){
            list.add(dish.getName());
        }

        // Internal interation
        List<String> data = menu.stream()
                .map(Dish::getName)
                .collect(Collectors.toList());
    }
}

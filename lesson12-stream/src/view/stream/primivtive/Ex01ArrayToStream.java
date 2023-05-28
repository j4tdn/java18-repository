package view.stream.primivtive;

import bean.Dish;
import model.DataModel;
import utils.PrintUtils;

import javax.xml.crypto.Data;
import java.util.Arrays;

public class Ex01ArrayToStream {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        int sum = Arrays.stream(numbers).sum();
        System.out.println(sum);

        // Tim tong calo cua cac dia thuc an
        DataModel.getDishes()
                .stream()
                .map(dish -> dish.getCalories())
                .reduce((double) 0, (result, dish) -> result + dish);

        Double rs = DataModel.getDishes()
                .stream()
                .mapToDouble(Dish::getCalories)
                .sum();
        PrintUtils.Print("Sum calories --> ", rs);
    }
}

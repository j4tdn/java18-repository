package view.stream;

import bean.Dish;
import model.DataModel;
import utils.PrintUtils;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex03StreanOperation {
    /*
    * Stream operation --> hàm thao tác trong stream có 2 loại
    *   + intermediate operation
    *       -> thao tác trung gian
    *       -> gọi xong trả về stream
    *       --> hình thành stream pipeline
    *       --> lazy operation, không thực hiện gì cho đến khi terminal operation được g
    *
    *   + terminal operation
    *       -> thao tác dùng để thực thi steam pipeline
    *       -> gọi xong kết quả chuyển đổi từ stream sang ctdl khác (string, array, list, set, ...)
    *       -> VD : collect, forEach, count ...
    *
    *
    * */

    public static void main(String[] args) {
        Set<String> result = DataModel.getDishes().stream()
                .filter(dish -> {
                    System.out.println("filtering " + dish.getName());
                    return dish.getCalories() > 300;
                })
                .map(dish -> {
                    System.out.println("mapping " + dish.getName());
                    return dish.getName();
                })
                .limit(3)
                .collect(Collectors.toSet());

        PrintUtils.Print("", result);
    }


}

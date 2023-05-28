package utils;

/*
* utils class --> chi chua nhung ham static
* --> chi phu thuoc vao tham so truyen vao, khong phu thuoc vao doi tuong
*
* --> tat ca deu ham static
* --> tao ra n doi tuong goi ham static thi KQ deu giong nhau
* --> ton memory
*
* --> private constructor --> cam tao ra doi tuong
* --> chi duoc phep lay class goi
* */

import java.util.Collections;
import java.util.List;

public class PrintUtils {

    private PrintUtils(){}

    public static <T> void Print(String prefix, T elements){
        System.out.println("\n" + prefix + elements);
    }

    public static <T> void Print(String prefix, Iterable<T> elements){
        System.out.println("\n" + prefix);
        System.out.println("//==========================//");
        elements.forEach(System.out::println);
        System.out.println("//==========================//");
    }
}

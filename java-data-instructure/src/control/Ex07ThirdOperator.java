package control;

import java.util.Random;

public class Ex07ThirdOperator {
    public static void main(String[] args) {
		//kiểm tra 1 số nguyên n là chẵn hay lẻ
    	Random rd= new Random();
    	int n =rd.nextInt(5);
    	System.out.println("n -->"+n);
        String result="";
        if(n%2==0) {
        	result="N is an even number";
        }else {
        	result="N is an odd number";
        }
        System.out.println(result);
    	//BTDK? su dung(if BTDK true) : sử dụng(if BTDK false)
        System.out.println(n%2==0?"N is an even number":"N is an odd number ");
	}
}

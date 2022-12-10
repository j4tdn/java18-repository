package exercises;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều cao của tam giác: ");
        n = scanner.nextInt();
        int x, output;
        
        // i là chiều cao
        for(int i = 0;i<= n; i++){
        	// j là chiều ngang
            for(int j = 0; j<= 2*n; j++){
                x = j-n;
                if(x < 0){
                    x *= -1;
                }
                output = i - x;
 
                if(output > 0){
                    System.out.printf("%3d", output);
                } else{
                    System.out.printf("");
                }
            }
            System.out.println();
        }
	}
}

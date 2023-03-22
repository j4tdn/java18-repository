package View;

import java.util.Arrays;

public class Exercises03 {
	public static void main(String[] args) {
		String[][] product = {
				{"itemId","nam","salePrice","storeId"},
				{"1", "A" ,"25" ,"101" },
				{"-2", "B" ,"90", "102" },
				{"3", "C" ,"88", "102" },
				{"-4", "D" ,"40" ,"101" },
				{"5", "E" ,"60" ,"102" },
				{"6", "F" ,"18" ,"101" }};
		int col =0;
		for( int i = 0; i < (product[1]).length;i++) {
			if(product[0][i].equals("salePrice")) {
				col = i;
			}
		}
		int row = 0;
		System.out.println("col: "+col);
		System.out.println("(product).length:"+(product).length);
		int max = Integer.parseInt(product[1][2]);
		for (int i = 1; i < (product).length; i++) {
			if(Integer.parseInt(product[i][col])> max) {
				max = Integer.parseInt(product[i][col]);
				row = i;
			}
		}
		System.out.println("row: "+row);
		System.out.println("mặt hàng có giá bán cao nhất: ");
		System.out.println(Arrays.toString(product[row]));
		;
		
		
	}
}

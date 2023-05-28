package demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex09 {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,3,4,10,6,14,23);
		System.out.println("==========tong===========");
		Integer Sum = number.stream().reduce(0, Integer::sum);
		System.out.println(Sum);
		System.out.println("==========hieu===========");
		Integer Sub = number.stream().reduce(0, Ex09::Sub);
		System.out.println(Sub);
		System.out.println("========tat ca chia het cho 4 hay ko===== ");
		boolean chiahetcho4 = number.stream().allMatch(t -> t%4==0);
		System.out.println(chiahetcho4);
		System.out.println("========it nhat 1 phan tu chia het cho 23====");
		boolean itnhatcho23 = number.stream().anyMatch(t -> t%23==0);
		System.out.println(itnhatcho23);
		System.out.println("========phan tu dau tien chia het cho 4======");
		Optional<Integer> a = number.stream().filter(t -> t%4==0).findAny();
		if(a.isPresent()) {
			System.out.println(a.get());
		}
		
	}
	
	private static Integer Sub(int a,int b) {
		return a-b;
	}
}

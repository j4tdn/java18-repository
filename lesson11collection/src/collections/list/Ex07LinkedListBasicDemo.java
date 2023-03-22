package collections.list;

import java.util.LinkedList;
import java.util.List;

public class Ex07LinkedListBasicDemo {
	public static void main(String[] args) {
		List<Double> averagePoints = new LinkedList<>();
		averagePoints.add(7.8d);
		averagePoints.add(8.3d);
		
		
		System.out.println("size : " +averagePoints.size());
	}
}

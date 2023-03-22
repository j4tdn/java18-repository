package collections.list;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class Ex06StackQueue {
	public static void main(String[] args) {
		// STACK : FILO
		Stack<String> tree = new Stack<>();
		tree.push("disk 1");
		tree.push("disk 2");
		tree.push("disk 3");
		System.out.println("size --> " + tree.size());
		
		System.out.println("pop1 --> " + tree.pop());
		System.out.println("size after pop: " + tree.size());
		
		System.out.println("===============QUEUE=================");
		
		Queue<String> line = new LinkedBlockingDeque<>();
		line.add("student 1");
		line.add("student 2");
		line.add("student 3");
		System.out.println("size --> " + line.size());
		System.out.println("peek1 --> " + line.peek());
		System.out.println("size after peek: " + line.size());
	}

}

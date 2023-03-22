package collections.list;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class Ex06StackQueue {
	public static void main(String[] args) {
		//STACK: FILO
		
		Stack<String> tree = new Stack<>();
		tree.push("disk 1");
		tree.push("disk 2");
		tree.push("disk 3");
		System.out.println("size: " + tree.size());
		
		System.out.println("pop1 --> " + tree.pop());
		System.out.println("pop2 --> " + tree.pop());
		System.out.println("size after pop: --> " + tree.pop());
		
		Queue<String> lines = new LinkedBlockingDeque<>();
		lines.add("Student 1");
		lines.add("Student 2");
		lines.add("Student 3");
		System.out.println("size: " + lines.size());
		System.out.println("peek1 --> " + lines.poll());
		System.out.println("size after peek: " + lines.size());
	}
}

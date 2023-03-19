package collections.list;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;
   
public class Ex06StackQueue {
	public static void main(String[] args) {
		// STACK: Firt in Last Out
		Stack<String> tree = new Stack<>();
		tree.push("disk1");
		tree.push("disk2");
		tree.push("disk3");
		System.out.println("size: " + tree.size());

		System.out.println("pop1 --> " + tree.pop());
		System.out.println("pop2 --> " + tree.pop());
		System.out.println("tree after pop: " + tree.size());

		Queue<String> line = new LinkedBlockingQueue<>();
		line.add("student 1");
		line.add("student 2");
		line.add("student 3");

		System.out.println("===================QUEUE===================");
		System.out.println("size: " + line.peek());
		System.out.println("tree after pop: " + line.size());
		System.out.println("size: " + line.poll());
		System.out.println("tree after pop: " + line.size());
	}
}

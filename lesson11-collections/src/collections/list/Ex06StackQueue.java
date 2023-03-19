package collections.list;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class Ex06StackQueue {
	 
	public static void main(String[] args) {
		/*
		 * Queue: Hàng đợi --> vào trước ra trước, vào sau ra sau
			      D C B A -> A vào trước ra trước
		          FIFO --> first in first out
		   Stack: Ngăn xếp --> Vào trước ra sau, vào sau ra trước
		          FILO --> first in last out
		          LIFO --> last in first out
		 */
		Stack<String> tree = new Stack<>();
		tree.push("disk1");
		tree.push("disk2");
		tree.push("disk3");
		
		System.out.println("size: " + tree.size());
		
		System.out.println("pop1 --> " + tree.pop());
		System.out.println("pop2 --> " + tree.pop());
		System.out.println("size after pop: " + tree.size());
		
		System.out.println("\n=======  QUEUE ========\n");
		
		Queue<String> line = new LinkedBlockingDeque<>();
		line.add("student 1");
		line.add("student 2");
		line.add("student 3");
		
		System.out.println("size: " + line.size());
		
		System.out.println("peek 1 --> " + line.poll());
		System.out.println("size after peek --> " + line.size());
		
	}
}

package collection.list;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class Ex06StackQueue {
	public static void main(String[] args) {
		//Stack: FIFO --> first in first out
		
		Stack<String> tree = new Stack<>();
		tree.push("disk 1");
		tree.push("disk 2");
		tree.push("disk 3");
		System.out.println("Size: " + tree.size());
		System.out.println("pop1 -->" + tree.pop());
		System.out.println("pop2 -->" + tree.pop());
		System.out.println("tree after pop " + tree.size());
		
		System.out.println("Queue");
		Queue<String> line = new LinkedBlockingDeque<>();
		
		line.add("Student 1");
		line.add("Student 2");
		line.add("Student 3");
		System.out.println("size: " + line.size());
		System.out.println("poll1 --> " + line.poll());
		// poll --> xoá phần tử đi sau khi lấy ra
		// peek --> không xoá phần tử sau khi lấy ra
		System.out.println("Size after poll: " + line.size());
	}
}

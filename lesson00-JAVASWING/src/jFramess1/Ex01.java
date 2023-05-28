package jFramess1;

import javax.swing.JFrame;

public class Ex01 {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("vi du jframe");
		jFrame.setSize(600,400);
		jFrame.setLocation(300, 300);
		//jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		
		jFrame.setVisible(true);
	}
}

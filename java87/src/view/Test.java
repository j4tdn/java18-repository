package view;

import javax.swing.JFrame;

public class Test extends JFrame{
	public Test() {
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		ViewDraw draw = new ViewDraw();
		
		this.add(draw);
		
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Test();
	}
}

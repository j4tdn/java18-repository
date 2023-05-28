package utility;

import javax.swing.JFrame;

public class MyWindow extends JFrame{
	public MyWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void showIt() {
		this.setVisible(true);
	}
	
	public void showIt(String title) {
		this.setTitle(title);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindow m1 = new MyWindow();
		MyWindow m2 = new MyWindow();
		//m1.showIt();
		m2.showIt();
		m1.showIt();
		//m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

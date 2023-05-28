package flowLayoutss2;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex01 {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("vi du");
		jFrame.setSize(400,500);
		jFrame.setLocationRelativeTo(null);
		//jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flowLayout = new FlowLayout();
		GridLayout gridLayout = new GridLayout();
		jFrame.setLayout(gridLayout);
		//jFrame.setLayout(flowLayout);
		JButton button_1= new JButton("1");
		JButton button_2= new JButton("2");
		JButton button_3= new JButton("3");
		jFrame.add(button_1);
		jFrame.add(button_2);
		jFrame.add(button_3);
		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
	}
}

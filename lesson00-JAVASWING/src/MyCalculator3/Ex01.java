package MyCalculator3;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ex01 {
	public Ex01() {
		JFrame jFrame = new JFrame("MyCalculator");
		jFrame.setSize(300, 300);
		jFrame.setLocationRelativeTo(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextField jTextField = new JTextField(50);
		JPanel jLabel_1 = new JPanel();
		jLabel_1.setLayout(new BorderLayout());
		jLabel_1.add(jTextField, BorderLayout.CENTER);

		JButton jButton0 = new JButton("0");
		JButton jButton1 = new JButton("1");
		JButton jButton2 = new JButton("2");
		JButton jButton3 = new JButton("3");
		JButton jButton4 = new JButton("4");
		JButton jButton5 = new JButton("5");
		JButton jButton6 = new JButton("6");
		JButton jButton7 = new JButton("7");
		JButton jButton8 = new JButton("8");
		JButton jButton9 = new JButton("9");
		JButton jButtonTotal = new JButton("+");
		JButton jButtonSub = new JButton("-");
		JButton jButtonMul = new JButton("*");
		JButton jButtonDiv = new JButton("/");
		JButton jButtonEqual = new JButton("=");

		JPanel jLabel_2 = new JPanel();
		jLabel_2.setLayout(new GridLayout(5, 3));
		// jLabel_2.setLayout(new GridLayout(4,4));
		// jLabel_2.add(jTextField);
		jLabel_2.add(jButton0);
		jLabel_2.add(jButton1);
		jLabel_2.add(jButton2);
		jLabel_2.add(jButton3);
		jLabel_2.add(jButton4);
		jLabel_2.add(jButton5);
		jLabel_2.add(jButton6);
		jLabel_2.add(jButton7);
		jLabel_2.add(jButton8);
		jLabel_2.add(jButton9);
		jLabel_2.add(jButtonTotal);
		jLabel_2.add(jButtonSub);
		jLabel_2.add(jButtonMul);
		jLabel_2.add(jButtonDiv);
		jLabel_2.add(jButtonEqual);
		//jLabel_2.setLayout(new GridLayout(5, 3));
		jFrame.setLayout(new BorderLayout());
		jFrame.add(jLabel_1, BorderLayout.NORTH);
		jFrame.add(jLabel_2, BorderLayout.CENTER);

		jFrame.setVisible(true);

	}
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			new Ex01();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

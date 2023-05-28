package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CouterView extends JFrame{
	public CouterView() {
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JTextArea area = new JTextArea(10,10);
		JScrollPane jScrollPane = new JScrollPane();
		jScrollPane.setViewportView(area);
		this.add(jScrollPane);
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new CouterView();
	}
}

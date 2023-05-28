package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ViewDraw extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.BLUE);
		g.drawLine(30, 30, 70, 90);
		
		g.setColor(Color.red);
		g.draw3DRect(40, 40, 40, 40, true);
	}
}

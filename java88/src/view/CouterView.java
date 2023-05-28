package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.ControllerMouseListener;
import model.CouterModel;

public class CouterView extends JFrame {
	private CouterModel couterModel;
	private JPanel jPanel_mouse;
	private JLabel jLabel_x;
	private JLabel jLabel_y;
	private JLabel jLabel_clicks;
	private JLabel jLabel_entre;

	public CouterView() {
		this.couterModel = new CouterModel();
		this.init();
		this.setVisible(true);
	}

	private void init() {
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		jPanel_mouse = new JPanel();
		jPanel_mouse.setBackground(Color.blue);
		JPanel jPanel_jlabel = new JPanel();
		
		ControllerMouseListener controllerMouseListener = new ControllerMouseListener(this);
		
		
		jPanel_mouse.addMouseListener(controllerMouseListener);
		jPanel_mouse.addMouseMotionListener(controllerMouseListener);
		JLabel jLabel_position = new JLabel("position : " );
		jLabel_x = new JLabel("x = " + this.couterModel.getX());
		jLabel_y = new JLabel("y = " + this.couterModel.getY());
		JLabel jLabel_count = new JLabel("number of click");
		jLabel_clicks = new JLabel(this.couterModel.getCount()+"");
		JLabel jLabel_null1 = new JLabel();
		JLabel jLabel_component = new JLabel("mouse is in component");
		jLabel_entre = new JLabel(this.couterModel.getS());
		jLabel_entre.addMouseListener(controllerMouseListener);
		JLabel jLabel_null2 = new JLabel();
		
		jPanel_jlabel.setLayout(new GridLayout(3,3));
		
		jPanel_jlabel.add(jLabel_position);
		jPanel_jlabel.add(jLabel_x);
		jPanel_jlabel.add(jLabel_y);
		jPanel_jlabel.add(jLabel_count);
		jPanel_jlabel.add(jLabel_clicks);
		jPanel_jlabel.add(jLabel_null1);
		jPanel_jlabel.add(jLabel_component);
		jPanel_jlabel.add(jLabel_entre);
		jPanel_jlabel.add(jLabel_null2);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel_mouse,BorderLayout.CENTER);
		this.add(jPanel_jlabel,BorderLayout.SOUTH);
		
	}
	
	public void click() {
		this.couterModel.addClick();
		this.jLabel_clicks.setText(this.couterModel.getCount()+"");
	}
	
	public void enterrr() {
		this.couterModel.enter();
		this.jLabel_entre.setText(this.couterModel.getS() + "");
	}
	
	public void exitttt() {
		this.couterModel.exit();;
		this.jLabel_entre.setText(this.couterModel.getS() + "");
	}

	public void update(int x, int y) {
		this.couterModel.setX(x);
		this.couterModel.setY(y);
		this.jLabel_x.setText(this.couterModel.getX()+"");
		this.jLabel_y.setText(this.couterModel.getY()+"");
		
		
	}
	
	
}

package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CouterListening;
import model.CouterModel;

public class CouterView extends JFrame{
	private CouterModel couterModel;
	private JButton jButton_up;
	private JButton jButton_down;
	private JLabel jLabel_value ;
	
	public CouterView() {
		this.couterModel = new CouterModel();
		this.init();
		this.setVisible(true);
	}
	public void init() {
		this.setTitle("cout");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CouterListening ac = new CouterListening(this);
		//this.setLocationRelativeTo(null);
		jButton_up = new JButton("up");
		jButton_up.addActionListener(ac);
		
		jButton_down = new JButton("down");
		jButton_down.addActionListener(ac);
		
		jLabel_value = new JLabel(this.couterModel.getValue()+"",JLabel.CENTER);
		
		//CouterListening ac = new CouterListening(this);
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());
		jPanel.add(jButton_down,BorderLayout.EAST);
		jPanel.add(jButton_up,BorderLayout.WEST);
		jPanel.add(jLabel_value,BorderLayout.CENTER);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel,BorderLayout.CENTER);
	}
	public void incre() {
		this.couterModel.increment();
		this.jLabel_value.setText(this.couterModel.getValue()+"");	
	}
	public void decre() {
		this.couterModel.decrement();;
		this.jLabel_value.setText(this.couterModel.getValue()+"");	
	}
}

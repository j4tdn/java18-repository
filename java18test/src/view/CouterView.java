package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CouterController;
import model.CouterModel;

public class CouterView extends JFrame{
	private CouterModel couterModel;
	private JButton jButton_1 ;
	private JButton jButton_2 ;
	private JButton jButton_3 ;
	private JButton jButton_4 ;
	private JPanel jPanel_buton;
	private JLabel jLabel;
	
	public CouterView() {
		this.couterModel = new CouterModel();
		this.Init();
		this.setVisible(true);
	}
	
	public void Init() {
		this.setTitle("Couter");
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		CouterController ac = new CouterController(this);
		
		jButton_1 = new JButton("1");
		jButton_1.addActionListener(ac);
		jButton_2 = new JButton("2");
		jButton_2.addActionListener(ac);
		jButton_3 = new JButton("3");
		jButton_3.addActionListener(ac);
		jButton_4 = new JButton("4");
		jButton_4.addActionListener(ac);
		
		jPanel_buton = new JPanel(new GridLayout(2, 2));
		jPanel_buton.add(jButton_1);
		jPanel_buton.add(jButton_2);
		jPanel_buton.add(jButton_3);
		jPanel_buton.add(jButton_4);
		
		jLabel = new JLabel("last button pushed was no ."+this.couterModel.getValue(),JLabel.CENTER);
		this.setLayout(new BorderLayout());
		this.add(jPanel_buton,BorderLayout.CENTER);
		this.add(jLabel,BorderLayout.SOUTH);
	}
	
	public void so(int a) {
		this.jLabel.setText("last button pushed was no ." + a);
	}
	
}

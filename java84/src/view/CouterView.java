package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CouterListener;
import model.CouterModel;

public class CouterView extends JFrame {
	private CouterModel couterModel;
	private JLabel jLabel_first;
	private JLabel jLabel_second;
	private JLabel jLabel_answer;
	private JTextField field_first;
	private JTextField field_second;
	private JLabel field_answer;

	public CouterView() {
		this.couterModel = new CouterModel();
		this.init();
		this.setVisible(true);
	}

	private void init() {
		this.setSize(300, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("MiniCalculate");
		JPanel jPanel_south = new JPanel();
		JPanel jPanel_nouth = new JPanel();
		jPanel_nouth.setLayout(new GridLayout(2, 3));
		jPanel_south.setLayout(new GridLayout(3, 2, 10, 10));
		CouterListener couterListener = new CouterListener(this);
		jLabel_first = new JLabel("first value");
		jLabel_second = new JLabel("second value");
		jLabel_answer = new JLabel("answer value");

		field_first = new JTextField(50);
		field_second = new JTextField(50);
		field_answer = new JLabel();

		jPanel_south.add(jLabel_first);
		jPanel_south.add(field_first);
		jPanel_south.add(jLabel_second);
		jPanel_south.add(field_second);
		jPanel_south.add(jLabel_answer);
		jPanel_south.add(field_answer);

		JButton jButton_sum = new JButton("+");
		jButton_sum.addActionListener(couterListener);
		JButton jButton_sub = new JButton("-");
		jButton_sub.addActionListener(couterListener);
		JButton jButton_div = new JButton("*");
		jButton_div.addActionListener(couterListener);
		JButton jButton_mul = new JButton("/");
		jButton_mul.addActionListener(couterListener);
		JButton jButton_exp = new JButton("^");
		jButton_exp.addActionListener(couterListener);
		JButton jButton_rem = new JButton("%");
		jButton_rem.addActionListener(couterListener);

		jPanel_nouth.add(jButton_sum);
		jPanel_nouth.add(jButton_sub);
		jPanel_nouth.add(jButton_mul);
		jPanel_nouth.add(jButton_div);
		jPanel_nouth.add(jButton_exp);
		jPanel_nouth.add(jButton_rem);

		this.setLayout(new BorderLayout());
		this.add(jPanel_south, BorderLayout.CENTER);
		this.add(jPanel_nouth, BorderLayout.SOUTH);

	}
	
	public void get(String src) {
		this.couterModel.setFirst_value(Integer.parseInt(field_first.getText()));
		this.couterModel.setSecond_value(Integer.parseInt(field_second.getText()));
		if(src.equals("+")) {
			this.couterModel.setAnswer_value(this.couterModel.getFirst_value()+this.couterModel.getSecond_value());
		}else if(src.equals("-")) {
			this.couterModel.setAnswer_value(this.couterModel.getFirst_value()-this.couterModel.getSecond_value());
		}else if(src.equals("*")) {
			this.couterModel.setAnswer_value(this.couterModel.getFirst_value()*this.couterModel.getSecond_value());
		}else if(src.equals("/")) {
			this.couterModel.setAnswer_value(this.couterModel.getFirst_value()/this.couterModel.getSecond_value());
		}else if(src.equals("^")) {
			this.couterModel.setAnswer_value(exp(this.couterModel.getFirst_value(), this.couterModel.getSecond_value()));
		}else if(src.equals("%")) {
			this.couterModel.setAnswer_value(this.couterModel.getFirst_value()%this.couterModel.getSecond_value());
		}
		
		//this.couterModel.setAnswer_value(this.couterModel.getFirst_value()+this.couterModel.getSecond_value());
		field_answer.setText(this.couterModel.getAnswer_value()+"");
	}
	
	public int exp(int a,int b) {
		int c=a;
		for(int i=0;i<b;i++) {
			a=a*c;
		}
		return a;
	}

}

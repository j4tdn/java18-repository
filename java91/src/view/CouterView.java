package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import controller.ControllerListener;

public class CouterView extends JFrame {
	private JLabel jLabel;
	public CouterView() {
		this.init();
		this.setVisible(true);
	}

	private void init() {
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		Font font = new Font("Arial",Font.BOLD , 50);
		
		JMenuBar jMenuBar = new JMenuBar();
		
		ControllerListener controller = new ControllerListener(this);
		
		JMenu jMenu1 = new JMenu("view");
		jMenu1.addSeparator();
		JMenu jMenu2 = new JMenu("controller");
		JMenu jMenu3 = new JMenu("view1");
		
		JMenuItem help = new JMenuItem("help",KeyEvent.VK_H);
		help.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,InputEvent.CTRL_DOWN_MASK));
		help.addActionListener(controller);
		JMenuItem clone = new JMenuItem("clone",KeyEvent.VK_C);
		clone.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.ALT_DOWN_MASK));
		clone.addActionListener(controller);
		JMenuItem clone1 = new JMenuItem("clone1");
		
		jMenu3.add(clone1);
		
		jMenu1.add(help);
		jMenu1.addSeparator();
		jMenu1.add(clone);
		jMenu1.add(jMenu3);
		
		jLabel = new JLabel();
		
		jMenuBar.add(jMenu1);
		jMenuBar.add(jMenu2);
		
		JToolBar jToolBar = new JToolBar();
		
		JButton jButton_row = new JButton("row");
		JButton jButton_new = new JButton("new");
		JButton jButton_answer = new JButton("answer");
		
		jToolBar.add(jButton_row);
		jToolBar.add(jButton_new);
		jToolBar.add(jButton_answer);
		
		
		this.setJMenuBar(jMenuBar);
		this.setLayout(new BorderLayout());
		this.add(jLabel,BorderLayout.CENTER);
		this.add(jToolBar,BorderLayout.NORTH);
		
	}
	public void sett (String string) {
		this.jLabel.setText(string);
	}
	
	
}

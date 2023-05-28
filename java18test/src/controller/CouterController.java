package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CouterView;

public class CouterController implements ActionListener{
	private CouterView ctv;

	public CouterController(CouterView ctv) {
		this.ctv = ctv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		int a = Integer.parseInt(src);
		this.ctv.so(a);
		
	}
}

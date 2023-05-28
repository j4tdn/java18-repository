package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CouterView;

public class CouterListening implements ActionListener {
	private CouterView ctv;
	
	public CouterListening(CouterView ctv) {
		this.ctv = ctv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		System.out.println("bạn đã nhấn nút " + src);
		
		if(src.equals("up")) {
			this.ctv.incre();
		}else if(src.equals("down")) {
			this.ctv.decre();
		}
		
	}

}

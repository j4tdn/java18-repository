package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CouterView;

public class ControllerListener implements ActionListener {
	private CouterView couterView;
	
	public ControllerListener(CouterView couterView) {
		this.couterView = couterView;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		
		if(src.equals("clone")) {
			this.couterView.sett("bạn đã nhấn clone");
		};
		if(src.equals("help")) {
			this.couterView.sett("bạn đã nhấn help");
		};

	}
}

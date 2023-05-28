package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CouterView;

public class CouterListener implements ActionListener{
	private CouterView couterView;
	public CouterListener(CouterView couterView) {
		this.couterView = couterView;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
//		if(src.equals("+")) {
//			System.out.println("bạn đã nhấn cộng");
//		}else if(src.equals("-")) {
//			System.out.println("bạn đã nhấn -");
//		}else if(src.equals("*")) {
//			System.out.println("bạn đã nhấn *");
//		}else if(src.equals("/")) {
//			System.out.println("bạn đã nhấn /");
//		}else if(src.equals("^")) {
//			System.out.println("bạn đã nhấn ^");
//		}else if(src.equals("%")) {
//			System.out.println("bạn đã nhấn %");
//		}
		this.couterView.get(src);
		
	}

}

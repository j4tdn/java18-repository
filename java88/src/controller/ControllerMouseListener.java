package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import view.CouterView;

public class ControllerMouseListener implements MouseListener,MouseMotionListener{
	private CouterView couterView;
	
	public ControllerMouseListener(CouterView couterView) {
		this.couterView = couterView;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		this.couterView.click();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.couterView.enterrr();
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		this.couterView.exitttt();
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		this.couterView.update(x,y);
		
	}

}

package eger_ugyes;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Klikk implements MouseListener{

	private boolean klikkelve;
	private int xx;
	private int yy;
	public boolean isKlikkelve() {
		return klikkelve;
	}

	public void setKlikkelve(boolean klikkelve) {
		this.klikkelve = klikkelve;
	}

	public int getXx() {
		return xx;
	}

	public void setXx(int xx) {
		this.xx = xx;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Klikkeltem!!!");
		klikkelve = true;
		xx = e.getX();
		yy = e.getY();
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

package eger_ugyes;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JPanel {
	private int alak = 0;
	private Klikk klikk;
	
	public View() {
		klikk = new Klikk();
		this.addMouseListener(klikk);
	}

	public int getAlak() {
		return alak;
	}

	public Klikk getKlikk() {
		return klikk;
	}

	public void setKlikk(Klikk klikk) {
		this.klikk = klikk;
	}

	public void setAlak(int alak) {
		this.alak = alak;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.red);
		g.fillOval(0, 300, 70, 70);
		g.setColor(Color.blue);
		g.fillRect(300, 300, 70, 70);
		g.setColor(Color.black);
		if (alak == 0)
		g.fillRect(600,300,70,70);
		else
			g.fillOval(600, 300, 70, 70);
	}

}
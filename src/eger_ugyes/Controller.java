package eger_ugyes;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JLabel;

public class Controller implements Runnable {

	private File f;
	private View v;
	private ArrayList<String> ll;
	private Listabol listas;
	private Random r;
	private int alak = 0;
	private JLabel label1, label2;
	private boolean pirosBenne = false;
	private boolean kekBenne = true;
	private int jo = 0;
	private MyFrame mf;
	private Klikk klikk;
	
	public Controller(File f, View v, JLabel label1, JLabel label2, MyFrame mf) {

		this.f = f;
		this.v = v;
		listas = new Listabol(f);
		this.label1 = label1;
		this.label2 = label2;
		ll = new ArrayList<String>();
		ll = listas.getLl();
		r = new Random();
		this.mf = mf;
		klikk = new Klikk();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String content1 = "piros";
		for (String s : ll) {
			label1.setText(s);
			if (s.contains(content1)) {
				pirosBenne = true;
				kekBenne = false;
			} else {
				pirosBenne = false;
				kekBenne = true;
			}
			alak = r.nextInt()%2;
			if (alak < 0)
				alak = -alak;
			label2.setText(Integer.toString(jo));
			v.setAlak(alak);
			v.repaint();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(v.getKlikk().isKlikkelve() == true) {
				System.out.println("erzekelte a control");
				if (alak == 1) {
					if (v.getKlikk().getXx() > 21 && v.getKlikk().getXx() < 93 && v.getKlikk().getYy() > 280 && v.getKlikk().getYy() < 395){
						jo++;
					}
				} else
					if(v.getKlikk().getXx() > 301 && v.getKlikk().getXx() < 404 && v.getKlikk().getYy() > 300 && v.getKlikk().getYy()<400) {
						jo++;
					}
				v.getKlikk().setKlikkelve(false);
			}
			
			
		}

	}


}

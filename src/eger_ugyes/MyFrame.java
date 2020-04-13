package eger_ugyes;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	private File f;
	private Controller c;
	private View v;
	private Container cp = getContentPane();
	private JLabel label1;
	private JLabel label2;
	private Klikk klikk;

	public MyFrame(File f) {
		this.f = f;
		
		//setLayout(new BorderLayout());
		label1 = new JLabel("ures");
		label2 = new JLabel("ures2");
		klikk = new Klikk();
		klikk.setKlikkelve(false);
		v = new View();
		
		add(label1,BorderLayout.NORTH);
		add(label2, BorderLayout.SOUTH);
		add(v);
		c = new Controller(f,v,label1,label2,this);
		Thread thread = new Thread(c);
		thread.start();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800,800);
		this.setVisible(true);
	}
}

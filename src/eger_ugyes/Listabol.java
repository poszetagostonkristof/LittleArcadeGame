package eger_ugyes;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Listabol {

	ArrayList<String> ll;
	BufferedReader br;

	public Listabol(File f) {
		String s;
		ll = new ArrayList<String>();
		try {
			this.br = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Nem talaltam a file-t");
			e.printStackTrace();
		}
		try {
			while ((s = br.readLine()) != null) {

				ll.add(s);
			
				// sTomb = s.split(" ");
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	}

	public ArrayList<String> getLl() {
		return ll;
	}

	public void setLl(ArrayList<String> ll) {
		this.ll = ll;
	}
}
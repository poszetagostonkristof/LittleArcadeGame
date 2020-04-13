package eger_ugyes;

import java.io.File;


public class Main {

	public static void main(String[] args) {

		if (args.length == 0) {
			File f = new File("vmi.txt");
			new MyFrame(f);
		} else {

			File f = new File(args[0]);

			if (f.exists() && !f.isDirectory()) {
				//new MyFrame(f);
				new MyFrame(f);
			} else {
				System.out.println("Nem letezik ez a file");
				File ff;
				ff = new File("vmi.txt");
				new MyFrame(ff);
			}
		}

	}

}

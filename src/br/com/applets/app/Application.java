package br.com.applets.app;

import javax.swing.JApplet;

public class Application extends JApplet implements Runnable {

	private static final long serialVersionUID = 1L;
	
	Thread thread; boolean exe = false; int x = 0;
	
	public void init() {
		thread = new Thread(this);
		showNotify();
	}
	
	public void showNotify() {
		thread.start();
		exe = true;
	}
	
	public void hideNotify() {
		thread = null;
		exe = false;
	}


	@Override
	public void run() {
		while(exe && x < 50) {
			System.out.println(x++ +"\n");
			try {
				Thread.sleep(100);
			} catch(Exception e) {};
		}
		
		while(exe) {
			System.out.println(x-- +"\n");
			if(x < 0) System.exit(1);
			try {
				Thread.sleep(100);
			} catch(Exception e) {};
		}
	}

}

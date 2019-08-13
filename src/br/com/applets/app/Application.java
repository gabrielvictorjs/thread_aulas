package br.com.applets.app;

import java.awt.Graphics;

import javax.swing.JApplet;

public class Application extends JApplet {

	private static final long serialVersionUID = 1L;
	
	
	public void paint(Graphics graph) {
		graph.drawLine(20, 20, 200, 200);
	}

}

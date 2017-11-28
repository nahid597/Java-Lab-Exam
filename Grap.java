package ru.ac.bd;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Graphics;

public class Grap extends JFrame{

	public Grap(int h, int w)
	{
		
		super.setTitle("Smile");
		super.setSize(h, w);
		super.setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setLocationRelativeTo(null);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Grap(350, 350);
		
	}
	public void paint(Graphics g)
	{
		//g.drawArc(100, 100, 200, 200, 0, 360);
		g.setColor(Color.YELLOW);
		g.fillArc(100, 100, 200, 200, 0, 360);
		g.setColor(Color.BLUE);
		g.fillArc(140, 150, 40, 40, 0, 360);
		g.fillArc(220, 150, 40, 40, 0, 360);
		g.setColor(Color.red);
		g.drawArc(160, 180, 80, 80, 200, 140);
	}
	
	

}

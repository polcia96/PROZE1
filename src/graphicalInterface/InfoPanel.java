package graphicalInterface;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import javafx.scene.text.Font;

public class InfoPanel extends JPanel{
	
	public static final int INFO_PANEL_HEIGHT=70;
	public static final int LIVE_NUMBERS=3;
	public static final int TIME_NUMBER=50;
	public static final int X_LIVE=100;
	public static final int Y_INFO=50;
	public static final int X_TIME=730;
	
	InfoPanel(int frameWidht){
		
		setSize(frameWidht, INFO_PANEL_HEIGHT);
		setBackground(Color.BLACK);
		setVisible(true);
	}
	
	
	public void paint(Graphics g) {

		super.paint(g);
		
		java.awt.Font font = new java.awt.Font ("Arial", 1, 17);
		g.setFont(font);
		g.setColor(Color.WHITE);
		g.drawString("LIVE:"+LIVE_NUMBERS,X_LIVE, Y_INFO);
		g.drawString("TIME:"+TIME_NUMBER+"s", X_TIME,Y_INFO);

	}
	

}

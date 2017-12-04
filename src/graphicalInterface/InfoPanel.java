package graphicalInterface;

import java.awt.Color;

import java.awt.Graphics;

import javax.swing.JPanel;

import javafx.scene.text.Font;

import constants.*
;public class InfoPanel extends JPanel{
	
	
	InfoPanel(int frameWidht){
		
		setSize(frameWidht, Constants.INFO_PANEL_HEIGHT);
		setBackground(Color.BLACK);
		setVisible(true);
	}
	
	
	public void paint(Graphics g) {

		super.paint(g);
		
		java.awt.Font font = new java.awt.Font ("Arial", 1, 17);
		g.setFont(font);
		g.setColor(Color.WHITE);
		g.drawString("LIVE:"+Constants.LIVE_NUMBERS,Constants.X_LIVE, Constants.Y_INFO);
		g.drawString("TIME:"+Constants.TIME_NUMBER+"s", Constants.X_TIME,Constants.Y_INFO);

	}
	

}

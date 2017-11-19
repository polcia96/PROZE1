package graphicalInterface;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

import board_elements.Brick;

public class Board extends JPanel{
	 /**
	 * 
	 */

	Brick bricks;
	
	public Board(){
		super();
		//bricks=new Brick();
		
	}
	
	/*public void drawRect(Graphics g) {
		//Rectangle rectangle=bricks.convertToRect();
		
			super.paint(g);
			Rectangle rect=bricks.convertToRect();
			g.drawRect(rect.x,rect.y,rect.width,rect.height);
			
	}*/
}
	
	


package graphicalInterface;

import java.awt.Graphics;
import java.awt.List;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JPanel;

import board_elements.Brick;



public class Board extends JPanel{
	 /**
	 * fghddd
	 */

	ArrayList<Brick> bricks;
	
	public static final int NUMBER_BRICKS=50;
	public static final int BOARD_WIDTH=800;
	public static final int BOARD_HIGHT=800;
	public Board(){
		super();
		super.setName("cos dziala");
		
		int xIndex=0;
		int yIndex=0;
		
			 bricks= new ArrayList <Brick>();
			for(int i=0; i<NUMBER_BRICKS;++i) {
				
				if(xIndex<BOARD_WIDTH) {
					bricks.add(new Brick(xIndex,yIndex));
				 	xIndex+=50;
				}
				 else if(yIndex<BOARD_HIGHT) {
					 xIndex=0;
					 yIndex+=30;
					 bricks.add(new Brick(xIndex,yIndex));
				 }
				 else
					 System.out.println("TU ZROBIC WYJATEK");
			}
		
	}
	public void paint(Graphics g) {
		super.paint(g);
		
		g.drawRect(0, 0, getWidth(), getHeight());
		for(int i=0;i<NUMBER_BRICKS;++i)
			bricks.get(i).drawRect(g);

	
	}
	
	
}
	
	


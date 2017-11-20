package graphicalInterface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.List;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JPanel;

import board_elements.*;


public class Board extends JPanel{
	 /**
	 * fghddd
	 */

	ArrayList<Brick> bricks;
	Pallet pallet;
	Ball ball;
	
	public static final int NUMBER_BRICKS=39;
	public static final int BOARD_WIDTH=800;
	public static final int BOARD_HEIGHT=700;
	public static final int X_SPACE=20;
	public static final int Y_SPACE=20;
	
	
	public Board(){
		super();
		super.setName("cos dziala");
		
		
		
		int xIndex=0;
		int yIndex=0;
		
		bricks= new ArrayList <Brick>();
		pallet  = new Pallet();
		ball=new Ball();
			 
		 makeBricks(xIndex,yIndex);
		 
		 setSize(BOARD_WIDTH, BOARD_HEIGHT);
		 setBackground(Color.BLACK);
		 setVisible(true);
		
	}
	
	public void makeBricks (int xIndex,int yIndex) {
		
		for(int i=0; i<NUMBER_BRICKS;++i) {
			
			if(xIndex<BOARD_WIDTH) {
				bricks.add(new Brick(xIndex,yIndex));
			 	xIndex=xIndex+Element.BRICK_WIDTH+X_SPACE;;
			}
			 else if(yIndex<BOARD_HEIGHT) {
				 xIndex=0;
				 yIndex=yIndex+Element.BRICK_HIGHT+Y_SPACE;
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
		
		pallet.drawPallet(g);
		ball.drawBall(g);

	
	}
	
	
}
	
	


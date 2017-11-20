package graphicalInterface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.List;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JPanel;

import board_elements.*;
import constants.Stale;


public class Board extends JPanel{


	ArrayList<Brick> bricks;
	Pallet pallet;
	Ball ball;

	
	public Board(){
		super();
		super.setName("cos dziala");
		
		
		
		int xIndex=0;
		int yIndex=0;
		
		bricks= new ArrayList <Brick>();
		pallet  = new Pallet();
		ball=new Ball();
			 
		 makeBricks(xIndex,yIndex);
		 
		 setSize(Stale.BOARD_WIDTH, Stale.BOARD_HEIGHT);
		 setBackground(Color.BLACK);
		 setVisible(true);
		
	}
	
	public void makeBricks (int xIndex,int yIndex) {
		
		for(int i=0; i<Stale.NUMBER_BRICKS;++i) {
			
			if(xIndex<Stale.BOARD_WIDTH) {
				bricks.add(new Brick(xIndex,yIndex));
			 	xIndex=xIndex+Stale.BRICK_WIDTH+Stale.X_SPACE;;
			}
			 else if(yIndex<Stale.BOARD_HEIGHT) {
				 xIndex=0;
				 yIndex=yIndex+Stale.BRICK_HIGHT+Stale.Y_SPACE;
				 bricks.add(new Brick(xIndex,yIndex));
			 }
			 else
				 System.out.println("TU ZROBIC WYJATEK");
		}	
	}
	
	public void paint(Graphics g) {

		super.paint(g);
		
		g.drawRect(0, 0, getWidth(), getHeight());
		for(int i=0;i<Stale.NUMBER_BRICKS;++i)
			bricks.get(i).drawRect(g);
		
		pallet.drawPallet(g);
		ball.drawBall(g);

	
	}
	
	
}
	
	


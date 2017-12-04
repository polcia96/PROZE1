package graphicalInterface;


import java.util.ArrayList
;

import java.util.List;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
//import java.awt.List;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;

import board_elements.*;
import constants.Constants;
import java.awt.event.*;

public class Board extends JPanel{


	ArrayList<Brick> bricks;
	Pallet pallet;
	Ball ball;
	static int brickNumber;
	
	public Board(JFrame container,int frameWidth,int frameHeight){
		super();
		super.setName("cos dziala");
		
		
		
		bricks= new ArrayList <Brick>();
		pallet  = new Pallet();
		ball=new Ball();
		brickNumber=0;	 
		// makeBricks(xIndex,yIndex);
		 
		makeBricks();
		double boardWidth=frameWidth;
		double boardHeight=frameHeight;
		
		
		 setSize((int)boardWidth, (int)boardHeight);

		 setBackground(Color.GRAY);
		 repaint();
		 setVisible(true);
		 
		 //zdarzenia narazei tu bo nie wiem gdzie
		 ///Poruszanie paletk¹,container (czyli main frame) ma byc wrazliwy na klawiature,
		 //jezeli zrodlo zarejestruje klikniecie w prawo lub lewo paletka sie porusza
		container.addKeyListener(new KeyAdapter() {
			 public void keyPressed(KeyEvent e) {
				 if (e.getKeyCode()==KeyEvent.VK_RIGHT) pallet.moveOnAxisX(1,container);
				 if (e.getKeyCode()==KeyEvent.VK_LEFT) pallet.moveOnAxisX(-1,container);
				 repaint();
			 }
		

	});
	
			
	
		
	}

	
	public void makeBricks() {
		int yIndex=0;
		makeRowBrick(yIndex,Constants.newBricks_l1);
		yIndex=yIndex+Constants.BRICK_HEIGHT+Constants.Y_SPACE;
		makeRowBrick(yIndex,Constants.newBricks_l2);
		yIndex=yIndex+Constants.BRICK_HEIGHT+Constants.Y_SPACE;
		makeRowBrick(yIndex,Constants.newBricks_l3);
	}
	
	public void makeRowBrick(int yIndex,List<String>newBricks ) {
		
		int xIndex=0;

		for(int i=0; i<newBricks.size(); ++i) {
		
			String brickPos=newBricks.get(i);

			switch (brickPos) {
			case "G" :
			{
				bricks.add(new Brick(xIndex,yIndex,Color.GREEN));
				brickNumber=brickNumber+1;
				break;		
			}
			
			case "B" :
			{
				bricks.add(new Brick(xIndex,yIndex,Color.BLUE));
			 	brickNumber=brickNumber+1;
				break;
			}
			
			case "R" :
			{
				bricks.add(new Brick(xIndex,yIndex,Color.RED));
			 	brickNumber=brickNumber+1;
				break;
			}
			}
			xIndex=xIndex+Constants.BRICK_WIDTH+Constants.X_SPACE;
		}
	}
	
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		
		g.drawRect(0, 0, getWidth(), getHeight());
		for(int i=0;i<brickNumber;++i)
			bricks.get(i).drawRect(g);
		
		pallet.drawPallet(g);
		ball.drawBall(g);

	
	}
	
	
}
	
	


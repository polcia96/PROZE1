package board_elements;

import java.awt.Color;

import java.awt.Graphics;
import constants.*;

public class Ball extends Element{

	public static int BALL_X=Constants.PALLET_X+(Constants.PALLET_WIDTH/2); 
	public static int BALL_Y=Constants.PALLET_Y-Constants.BALL_R; 
	public Ball()
	{
		super(BALL_X,BALL_Y,Constants.BALL_R,Constants.BALL_R);
		elColor=Color.WHITE;

	}
	
	public void drawBall(Graphics g) {
		g.setColor(elColor);
		g.fillOval(x, y, getWidth(), getHeight());
		
	}
	

}

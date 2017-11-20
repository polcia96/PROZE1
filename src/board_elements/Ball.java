package board_elements;

import java.awt.Color;

import java.awt.Graphics;
import constants.*;

public class Ball extends Element{

	public Ball()
	{
		super(Stale.BALL_X,Stale.BALL_Y,Stale.BALL_R,Stale.BALL_R);
		elColor=Color.WHITE;
	
	}
	
	public void drawBall(Graphics g) {
		g.setColor(elColor);
		g.fillOval(x, y, getWidth(), getHeight());
		
	}
	

}

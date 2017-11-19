package board_elements;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Element{

	public static final int BALL_R=30;
	public static final int BALL_X=Pallet.PALLET_X+(Pallet.PALLET_WIDTH/2);
	public static final int BALL_Y=Pallet.PALLET_Y-BALL_R;
	
	
	public Ball()
	{
		super(BALL_X,BALL_Y,BALL_R,BALL_R);
		elColor=Color.WHITE;
	
	}
	
	public void drawBall(Graphics g) {
		g.setColor(elColor);
		g.fillOval(x, y, getWidth(), getHeight());
		
	}
	

}

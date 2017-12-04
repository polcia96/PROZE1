package board_elements;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JFrame;

import constants.*;


public class Pallet extends Element {
	private Rectangle pallet;
	private int speed;
	
	public Pallet(){
		super(Constants.PALLET_X,Constants.PALLET_Y,Constants.PALLET_WIDTH,Constants.PALLET_HEIGHT);
		pallet=convertToRect();
		elColor=Color.RED;
		speed=10;
	}
	
public void moveOnAxisX(int turn,JFrame container){
	if (turn==1)pallet.x+=speed;
	if(turn==-1)pallet.x-=speed;
	
	if(pallet.x<0) pallet.x=0;
	if(pallet.x>(container.getWidth()-pallet.getWidth()))pallet.x=(int) (container.getWidth()-pallet.getWidth());
	System.out.println("PALLET"+container.getWidth());
}
	
public void drawPallet(Graphics g) {
		
		g.setColor(elColor);
		g.fillRoundRect((int)pallet.getX(),(int)pallet.getY(),(int)pallet.getWidth(),(int)pallet.getHeight(),Constants.X_DIAM,Constants.Y_DIAM);	
}

public void setSpeed(int newSpeed) {
	speed=newSpeed;
}



}

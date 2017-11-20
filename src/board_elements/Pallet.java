package board_elements;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Rectangle;

import constants.*;


public class Pallet extends Element {

	public Pallet(){
		super(Stale.PALLET_X,Stale.PALLET_Y,Stale.PALLET_WIDTH,Stale.PALLET_HEIGHT);
		elColor=Color.RED;
	}
	
public void drawPallet(Graphics g) {
		
		Rectangle rect=convertToRect();
		g.setColor(elColor);
		g.fillRoundRect((int)rect.getX(),(int)rect.getY(),(int)rect.getWidth(),(int)rect.getHeight(),Stale.X_DIAM,Stale.Y_DIAM);
		
}


}

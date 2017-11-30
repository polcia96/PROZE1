package board_elements;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Rectangle;

import constants.*;


public class Pallet extends Element {

	public Pallet(){
		super(Constants.PALLET_X,Constants.PALLET_Y,Constants.PALLET_WIDTH,Constants.PALLET_HEIGHT);
		elColor=Color.RED;
	}
	
public void drawPallet(Graphics g) {
		
		Rectangle rect=convertToRect();
		g.setColor(elColor);
		g.fillRoundRect((int)rect.getX(),(int)rect.getY(),(int)rect.getWidth(),(int)rect.getHeight(),Constants.X_DIAM,Constants.Y_DIAM);
		
}


}

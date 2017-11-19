package board_elements;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;




public class Pallet extends Element {
	
	public static final int PALLET_WIDTH=150;
	public static final int PALLET_HEIGHT=40;
	public static final int PALLET_X=313;
	public static final int PALLET_Y=600;
	public static final int X_DIAM=50;
	public static final int Y_DIAM=40;
	
	public Pallet(){
		super(PALLET_X,PALLET_Y,PALLET_WIDTH,PALLET_HEIGHT);
		elColor=Color.RED;
	}
	
public void drawPallet(Graphics g) {
		
		Rectangle rect=convertToRect();
		g.setColor(elColor);
		g.fillRoundRect((int)rect.getX(),(int)rect.getY(),(int)rect.getWidth(),(int)rect.getHeight(),X_DIAM,Y_DIAM);
		
}


}

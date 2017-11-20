
package board_elements;
import constants.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Element {
	public int x;
	public int y;
	public  Dimension dimension;
	public Color elColor;
	
	
	public Element(){
		x=Stale.X_LEFT;
		y=Stale.Y_TOP;
		dimension=new Dimension(Stale.BRICK_WIDTH,Stale.BRICK_HIGHT); 
		//dimension.width=40;
		//dimension.height=20;
		
	}
	public Element(int xIndex,int yIndex){
		x=Stale.X_LEFT+xIndex;
		y=Stale.Y_TOP+yIndex;
		dimension=new Dimension(Stale.BRICK_WIDTH,Stale.BRICK_HIGHT); 
		elColor=new Color(0, 0, 0);
		
	}
	
	public Element(int xIndex,int yIndex, int width,int hight){
		x=Stale.X_LEFT+xIndex;
		y=Stale.Y_TOP+yIndex;
		dimension=new Dimension(width,hight); 
		elColor=new Color(0, 0, 0);
		
	}

	public int getx() {
		return x;
	}
	public int gety() {
		return y;
	}
	public int getWidth() {
		return (int)dimension.getWidth();
	}
	public int getHeight() {
		return (int)dimension.getHeight();
	}

	public Rectangle convertToRect () {
		Rectangle rect=new Rectangle(x,y,(int)dimension.getWidth(),(int)dimension.getHeight());
		return rect;
	}
	





}

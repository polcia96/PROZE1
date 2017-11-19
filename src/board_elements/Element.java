
package board_elements;

import java.awt.Dimension;

public abstract class Element {
	public int x;
	public int y;
	public  Dimension dimension;
	
	public static final int BRICK_WIDTH=70;
	public static final int BRICK_HIGHT=30;
	public static final int X_LEFT=75;
	public static final int Y_TOP=100;
	public Element(){
		x=X_LEFT;
		y=Y_TOP;
		dimension=new Dimension(BRICK_WIDTH,BRICK_HIGHT); 
		//dimension.width=40;
		//dimension.height=20;
		
	}
	public Element(int xIndex,int yIndex){
		x=X_LEFT+xIndex;
		y=Y_TOP+yIndex;
		dimension=new Dimension(BRICK_WIDTH,BRICK_HIGHT); 
		
	}
	
	public Element(int xIndex,int yIndex, int width,int hight){
		x=X_LEFT+xIndex;
		y=Y_TOP+yIndex;
		dimension=new Dimension(width,hight); 
		
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
	public int getHight() {
		return (int)dimension.getHeight();
	}
}

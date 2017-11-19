
package board_elements;

import java.awt.Dimension;

public abstract class Element {
	public int x;
	public int y;
	public  Dimension dimension;

	public Element(){
		x=0;
		y=0;
		dimension=new Dimension(40,20); 
		//dimension.width=40;
		//dimension.height=20;
		
	}
	public Element(int xIndex,int yIndex){
		x=xIndex;
		y=yIndex;
		dimension=new Dimension(40,20); 
		//dimension.width=40;
		//dimension.height=20;
		
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

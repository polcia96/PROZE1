
package board_elements;

import java.awt.Dimension;

public class Element {
	public int x;
	public int y;
	public  Dimension dimension;

	public Element(){
		x=0;
		y=0;
		dimension.width=40;
		dimension.height=20;
		
	}
/aaaaaaaa
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

package board_elements;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Brick extends Element {
	Color brickColor;
	String cos;
	public Brick(){
		super();
		brickColor=Color.BLACK;
		cos="sprawdzenie";
		//uu
	}
	
	public Rectangle convertToRect () {
		Rectangle rect=new Rectangle(x,y,(int)dimension.getWidth(),(int)dimension.getHeight());
		return rect;
	}
	
}

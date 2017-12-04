package board_elements;



import java.awt.Color;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.color.ColorSpace;

//dada

public class Brick extends Element {


	public Brick(){
		super();
		elColor=Color.ORANGE;
		
	}
	public Brick(int xIndex, int yIndex){
		super(xIndex, yIndex);
		elColor=Color.ORANGE;

	}
	
	public Brick(int xIndex, int yIndex, Color color){
		super(xIndex, yIndex);
		elColor=color;

	}
	
	
	
	public void drawRect(Graphics g) {
		
		Rectangle rect=convertToRect();
		g.setColor(elColor);
		g.fillRect((int)rect.getX(),(int)rect.getY(),(int)rect.getWidth(),(int)rect.getHeight());
		
}
	
}

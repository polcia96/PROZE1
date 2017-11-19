package board_elements;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.color.ColorSpace;
//dada
public class Brick extends Element {
	Color brickColor;

	public Brick(){
		super();
		brickColor=new Color(0, 0, 0);
		brickColor=Color.BLACK;
		
	}
	public Brick(int xIndex, int yIndex){
		super(xIndex, yIndex);
		brickColor=new Color(0, 0, 0);
		brickColor=Color.BLACK;
		
	}
	
	
	public Rectangle convertToRect () {
		Rectangle rect=new Rectangle(x,y,(int)dimension.getWidth(),(int)dimension.getHeight());
		return rect;
	}
	
	public void drawRect(Graphics g) {
		
		Rectangle rect=convertToRect();
		g.fillRect((int)rect.getX(),(int)rect.getY(),(int)rect.getWidth(),(int)rect.getHeight());
		
}
	
}

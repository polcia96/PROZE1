package graphicalInterface;

import javax.swing.JButton;
import javax.swing.JPanel;
//raczej do poprawy/do kosza 
public class LevelWindow {
	//STWORZYC OSOBNA KLASE NA STALE
	static final int LEVEL_AMOUNT=4;
	JButton levelOne;
	JPanel levelGroup;
	LevelWindow(){
		levelOne=new JButton("1");
		levelGroup=new JPanel();
		levelGroup.add(levelOne);
		levelGroup.setVisible(true);
		
	}
	
}

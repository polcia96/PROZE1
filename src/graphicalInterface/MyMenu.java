package graphicalInterface;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MyMenu extends JMenu implements ActionListener {
	JMenu menu;
	JMenuItem start,changeUser,level,ranking ;

	MyMenu(){
		menu=new JMenu("Menu");
		level=new JMenuItem("Poziom");
		ranking=new JMenuItem("Ranking");
		start=new JMenuItem("Start");
		changeUser=new JMenuItem("Zmiana u¿ytkownika");
		
		menu.add(start);
		menu.add(level);
		menu.add(ranking);
		menu.add(changeUser);
		
		start.addActionListener(this);
		level.addActionListener(this);
		ranking.addActionListener(this);
		changeUser.addActionListener(this);
		
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();

		if(source == start)
			System.out.println("dzia³a_start");

		else if(source == level) {
			LevelWindow l1=new LevelWindow();
			l1.levelGroup.setVisible(true);
		}
		
		else if(source == ranking)
			System.out.println("dzia³a_ranking");
		
		else if(source == changeUser)
			System.out.println("dzia³a_changeUser");
	}
	



}

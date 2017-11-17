package graphicalInterface;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MainFrame extends JFrame{
	
	MyMenu menu;
	JMenuBar menuBar;
	LevelWindow mLevels;
	
	public MainFrame() {
		super("ARKANOID");
		//setLayout(new BorderLayout());
		menuBar=new JMenuBar();
		menu=new MyMenu();
		menuBar.add(menu.menu);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,1000);
		setLocation(50,0);
		setJMenuBar(menuBar);
		setVisible(true);
		
		//mLevels=new LevelWindow();
		//add(mLevels.levelGroup);
	}
	


	
}

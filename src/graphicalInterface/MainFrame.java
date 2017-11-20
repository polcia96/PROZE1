package graphicalInterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import board_elements.Brick;

public class MainFrame extends JFrame{

	MyMenu menu;
	JMenuBar menuBar;
	LevelWindow mLevels;
	Board board;
	Graphics g;
	InfoPanel infoPanel;
	//Brick brick;
	//JFrame frame;
	
	public MainFrame() {
		super("ARKANOID");
		//setLayout(new BorderLayout());
		menuBar=new JMenuBar();
		menu=new MyMenu();
		menuBar.add(menu.menu);
		
		//frame=new Frame();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,1000);
		setLocation(50,0);
		setJMenuBar(menuBar);
		

		infoPanel=new InfoPanel(getWidth());
		
	
		add(infoPanel);
		board=new Board();
		add(board);

		
		//board.drawRect(g);
		setVisible(true);
		

	
	
	
	}
	


	
}

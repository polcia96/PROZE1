package graphicalInterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import board_elements.Brick;
import constants.Constants;

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
		setLayout(new BorderLayout());
		
		menuBar=new JMenuBar();
		menu=new MyMenu();
		menuBar.add(menu.menu);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,1000);
		setLocation(50,0);
		setJMenuBar(menuBar);
		

		infoPanel=new InfoPanel(getWidth());
		
	
		add(infoPanel);

		board=new Board(this,this.getWidth(),this.getHeight());
		add(board,BorderLayout.CENTER);

		
		//board.drawRect(g);
		setVisible(true);
		setResizable(true);
		
		getContentPane().addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent e) {
				Component c=(Component)e.getSource();
				setSize(c.getSize());
				System.out.println("W "+getWidth()+"H "+getHeight());
				repaint();
			}
			
		});
	
	
	
	}
	


	
}

package constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class Constants {
	
		//new
		public static List<String>newBricks_l1;
		public static List<String>newBricks_l2;
		public static List<String>newBricks_l3;
		

		
		public static int NUMBER_BRICKS;
		public static int BOARD_WIDTH;
		public static int BOARD_HEIGHT;
		public static int X_SPACE;
		public static int Y_SPACE;
		
		public static int INFO_PANEL_HEIGHT;
		public static int LIVE_NUMBERS;
		public static int TIME_NUMBER;
		public static int X_LIVE;
		public static int Y_INFO;
		public static int X_TIME;
		
		public static int BRICK_WIDTH;
		public static int BRICK_HEIGHT; 
		public static int X_LEFT;
		public static int Y_TOP;
		
		public static int PALLET_WIDTH;
		public static int PALLET_HEIGHT;
		public static int PALLET_X;
		public static int PALLET_Y;
		public static int X_DIAM;
		public static int Y_DIAM;

		public static int BALL_R;


		public static void ConstantsFromFile() {
			try {
				Properties constants = new Properties();
				InputStream input = null;
				input = new FileInputStream("constants.properties");
				constants.load(input);
				
				String bricks_l1 = constants.getProperty("level_1");
				newBricks_l1 = new ArrayList<String>();
				newBricks_l1 = Arrays.asList(bricks_l1.split(","));
				
				String bricks_l2 = constants.getProperty("level_2");
				newBricks_l2 = new ArrayList<String>();
				newBricks_l2 = Arrays.asList(bricks_l2.split(","));
				
				String bricks_l3 = constants.getProperty("level_3");
				newBricks_l3 = new ArrayList<String>();
				newBricks_l3 = Arrays.asList(bricks_l3.split(","));
				System.out.println(newBricks_l1+ "\n"+ newBricks_l2+"\n"+newBricks_l3 );
				

				NUMBER_BRICKS = Integer.parseInt(constants.getProperty("NUMBER_BRICKS"));
				BOARD_WIDTH = Integer.parseInt(constants.getProperty("BOARD_WIDTH"));
				BOARD_HEIGHT = Integer.parseInt(constants.getProperty("BOARD_HEIGHT"));
				X_SPACE = Integer.parseInt(constants.getProperty("X_SPACE"));
				Y_SPACE = Integer.parseInt(constants.getProperty("Y_SPACE"));
				INFO_PANEL_HEIGHT = Integer.parseInt(constants.getProperty("INFO_PANEL_HEIGHT"));
				LIVE_NUMBERS = Integer.parseInt(constants.getProperty("LIVE_NUMBERS"));
				TIME_NUMBER = Integer.parseInt(constants.getProperty("TIME_NUMBER"));
				X_LIVE = Integer.parseInt(constants.getProperty("X_LIVE"));
				Y_INFO = Integer.parseInt(constants.getProperty("Y_INFO"));
				X_TIME = Integer.parseInt(constants.getProperty("X_TIME"));
				BRICK_WIDTH = Integer.parseInt(constants.getProperty("BRICK_WIDTH"));
				BRICK_HEIGHT = Integer.parseInt(constants.getProperty("BRICK_HIGHT"));
				X_LEFT = Integer.parseInt(constants.getProperty("X_LEFT"));
				Y_TOP = Integer.parseInt(constants.getProperty("Y_TOP"));
				PALLET_WIDTH = Integer.parseInt(constants.getProperty("PALLET_WIDTH"));
				PALLET_HEIGHT = Integer.parseInt(constants.getProperty("PALLET_HEIGHT"));
				PALLET_X = Integer.parseInt(constants.getProperty("PALLET_X"));
				PALLET_Y = Integer.parseInt(constants.getProperty("PALLET_Y"));
				X_DIAM = Integer.parseInt(constants.getProperty("X_DIAM"));
				Y_DIAM = Integer.parseInt(constants.getProperty("Y_DIAM"));
				BALL_R = Integer.parseInt(constants.getProperty("BALL_R"));
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		


}

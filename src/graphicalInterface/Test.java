package graphicalInterface;

import java.awt.EventQueue;



import constants.Constants;


class Test {
	public static void main(String[] args) throws Exception {
	
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Constants.ConstantsFromFile();
				new MainFrame();
			}

		
		});
	}
}


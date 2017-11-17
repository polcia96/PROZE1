package graphicalInterface;

import java.awt.EventQueue;
//PRZEKOPIOWANE,CHYBA OBS£UGA WIELOW¥TKOWA ALE JESZCZE SIÊ DOWIEM
class Test {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MainFrame();
			}
		});
	}
}
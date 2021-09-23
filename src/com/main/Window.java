package com.main;
import javax.swing.JFrame;
public class Window {
	public Window(String title, Game game) {
		JFrame frame = new JFrame(title);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(game); // Game inherits from Canvas, a Component object, so it can be put in a JFrame
		frame.pack();
		frame.setLocationRelativeTo(null); // ghetto way of centering the window
		frame.setVisible(true);
	}

}



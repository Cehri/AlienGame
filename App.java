package com.invasion.app;

import javax.swing.JFrame;

public class App extends JFrame {

	public static void main(String[] args) {
		App app= new App();
		
		app.setResizable(false);
		app.setFocusable(false);
		
		app.setSize(1000,800);
	   
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GameLevelOne game = new GameLevelOne();
		
		game.requestFocus();
		
		game.addKeyListener(game);
		
		game.setFocusable(true);
		
		game.setFocusTraversalKeysEnabled(false);
		
		app.add(game);
		
		app.setVisible(true);

	}

}

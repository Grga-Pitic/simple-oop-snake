package main.frames;

import javax.swing.JFrame;

import main.frames.components.CustomImage;
import main.frames.listeners.SnakeControl;
import main.game.GameContainer;

import java.awt.Color;


public class GameFrame extends JFrame {
	public GameFrame() {
		
		setFocusable(true);
		int width  = GameContainer.getInstance().getSettings().getWidth();
		int height = GameContainer.getInstance().getSettings().getHeight();
		addKeyListener(new SnakeControl());
		setSize(width*CustomImage.CELL_SIZE+6, 
				height*CustomImage.CELL_SIZE+28); // constants is workaround
		setBackground(Color.WHITE);
		getContentPane().setBackground(Color.WHITE);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().add(GameContainer.getInstance().getFood().getImageComponent());
	}
	
	public void changeSize(){
		int width  = GameContainer.getInstance().getSettings().getWidth();
		int height = GameContainer.getInstance().getSettings().getHeight();
		setSize(width*CustomImage.CELL_SIZE+6, 
				height*CustomImage.CELL_SIZE+28); // constants is workaround
	}
	
}

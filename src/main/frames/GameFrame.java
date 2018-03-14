package main.frames;

import javax.swing.JFrame;

import main.frames.components.CustomImage;
import main.frames.listeners.SnakeControl;
import main.game.GameContainer;

import java.awt.Color;


public class GameFrame extends JFrame {
	public GameFrame() {
		
		addKeyListener(new SnakeControl());
		setSize(GameContainer.WIDTH*CustomImage.CELL_SIZE+6, 
				GameContainer.HEIGHT*CustomImage.CELL_SIZE+28); // constants is workaround
		setBackground(Color.WHITE);
		getContentPane().setBackground(Color.WHITE);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		
	//	CustomImage customImage = new CustomImage();
	//	customImage.setBounds(26, 25, 54, 50);
	//	getContentPane().add(customImage);
		
	}
}

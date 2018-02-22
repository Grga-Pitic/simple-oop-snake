package main.frames;

import javax.swing.JFrame;

import main.frames.components.CustomImage;
import main.game.GameContainer;

import java.awt.BorderLayout;
import java.awt.Color;

public class GameFrame extends JFrame {
	public GameFrame() {
		setBackground(Color.WHITE);
		getContentPane().setBackground(Color.WHITE);
		setSize(GameContainer.WIDTH*CustomImage.CELL_SIZE, GameContainer.HEIGHT*CustomImage.CELL_SIZE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setLayout(null);
		
	//	CustomImage customImage = new CustomImage();
	//	customImage.setBounds(26, 25, 54, 50);
	//	getContentPane().add(customImage);
		
	}
}

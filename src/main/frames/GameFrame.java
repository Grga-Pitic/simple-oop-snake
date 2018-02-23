package main.frames;

import javax.swing.JFrame;

import main.frames.components.CustomImage;
import main.frames.listeners.SnakeControl;
import main.game.GameContainer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class GameFrame extends JFrame {
	public GameFrame() {
		
		addKeyListener(new SnakeControl());
		setBackground(Color.WHITE);
		getContentPane().setBackground(Color.WHITE);
		setSize(GameContainer.WIDTH*CustomImage.CELL_SIZE+(CustomImage.CELL_SIZE/2), GameContainer.HEIGHT*CustomImage.CELL_SIZE+(CustomImage.CELL_SIZE/2));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setLayout(null);
		
	//	CustomImage customImage = new CustomImage();
	//	customImage.setBounds(26, 25, 54, 50);
	//	getContentPane().add(customImage);
		
	}
}

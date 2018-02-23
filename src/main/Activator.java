package main;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import javax.imageio.ImageIO;

import main.frames.manager.FrameManager;
import main.game.Cell;
import main.game.GameContainer;
import main.game.Snake;
import main.game.services.FieldService;
import main.game.services.SnakeService;
import main.game.threads.GameThread;

public class Activator {
	public static void main(String [] args) {
		FrameManager.getInstance().getMenuFrame().setVisible(true);
		
		/*
		GameContainer game  = GameContainer.getInstance();
		Snake snake;
		snake = new Snake(new LinkedList<Cell>());
		
		game.setSnake(snake);
		
		SnakeService.getInstance().initSnake(snake);
		FieldService.getInstance().placeTheSnake(game.getField(), snake);
		try {
			snake.setHeadImage(ImageIO.read(new File("C:\\Users\\Grga\\Pictures\\snake\\head.jpg")));
			snake.setBodyImage(ImageIO.read(new File("C:\\Users\\Grga\\Pictures\\snake\\body.jpg")));
		
		} catch (IOException e) {
			System.out.print("Невозможно загрузить изображене");
		}
		
		new Thread(new GameThread()).start();
		*/
	}
}

package main;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import javax.imageio.ImageIO;

import main.frames.manager.FrameManager;
import main.game.Cell;
import main.game.Food;
import main.game.GameContainer;
import main.game.Snake;

public class Activator {
	/**
	 * Main entry point
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String [] args) throws IOException {
		GameContainer game = GameContainer.getInstance();
		Snake snake = new Snake(new LinkedList<Cell>());
		Food  food;
		
		try {
			snake.setHeadImage(ImageIO.read(new File("C:\\Users\\Grga\\Pictures\\snake\\head.jpg")));
			snake.setBodyImage(ImageIO.read(new File("C:\\Users\\Grga\\Pictures\\snake\\body.jpg")));
			food = new Food(ImageIO.read(new File("C:\\Users\\Grga\\Pictures\\snake\\head.jpg")));
			game.setSnake(snake);
			game.setFood(food);
		} catch (IOException e) {
			System.out.print("Невозможно загрузить изображене");
		}
		
		FrameManager.getInstance().getMenuFrame().setVisible(true);
		
	}
}

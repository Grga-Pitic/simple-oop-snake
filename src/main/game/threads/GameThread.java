package main.game.threads;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.imageio.ImageIO;

import main.frames.manager.FrameManager;
import main.game.Cell;
import main.game.GameContainer;
import main.game.Snake;
import main.game.printer.IPainter;
import main.game.printer.SnakePainter;
import main.game.services.FieldService;
import main.game.services.SnakeService;

public class GameThread implements Runnable {

	@Override
	public void run() {
		
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
		
		IPainter painter = SnakePainter.getInstance();
		
		while(true) {
			
			//SnakeService.getInstance().move(snake);
			painter.drawSnake(snake);
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
	//		FrameManager.getInstance().getGameFrame().getContentPane().repaint();
		}
		
	}

}

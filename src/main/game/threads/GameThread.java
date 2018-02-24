package main.game.threads;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.imageio.ImageIO;

import main.frames.manager.FrameManager;
import main.game.Cell;
import main.game.Food;
import main.game.GameContainer;
import main.game.Snake;
import main.game.painter.IPainter;
import main.game.painter.SnakePainter;
import main.game.services.FieldService;
import main.game.services.FoodService;
import main.game.services.SnakeService;

public class GameThread implements Runnable {

	@Override
	public void run() {
		
		Snake snake = GameContainer.getInstance().getSnake();
		Food  food  = GameContainer.getInstance().getFood();
		
		FoodService.getInstance().randomPosition(food);
		IPainter painter = SnakePainter.getInstance();
		painter.drawSnake(snake);
		while(true) {
			painter.drawSnake(snake);
			painter.drawFood(food);
			FrameManager.getInstance().getGameFrame().getContentPane().repaint();
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			SnakeService.getInstance().move(snake);
			
			
			if(GameContainer.getInstance().isGameOver()){
				break;
			}
			
	//		FrameManager.getInstance().getGameFrame().getContentPane().repaint();
		}
		
		FrameManager.getInstance().getGameoverFrame().setVisible(true);
		
		System.out.print("end of thread\n");
		
	}

}

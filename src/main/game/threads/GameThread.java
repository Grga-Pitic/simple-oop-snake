package main.game.threads;

import main.frames.manager.FrameManager;
import main.game.Food;
import main.game.GameContainer;
import main.game.Snake;
import main.game.painter.IPainter;
import main.game.painter.SnakePainter;
import main.game.services.FieldService;
import main.game.services.FoodService;
import main.game.services.SnakeService;

/**
 * Main game thread. Most of the gameplay process execute here.
 * @author Grga
 *
 */
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
				Thread.sleep(GameContainer.getInstance().getTimeDelay());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			SnakeService.getInstance().move(snake);
			
			if(GameContainer.getInstance().isGameOver()){
				
				FieldService.getInstance().removeTheSnake(GameContainer.getInstance().getField(), snake);
				FrameManager.getInstance().getGameFrame().getContentPane().removeAll();
				FrameManager.getInstance().getGameFrame().getContentPane().add(GameContainer.getInstance().getFood().getImageComponent());
				
				break;
			}
			
		}
		
		FrameManager.getInstance().getGameoverFrame().setVisible(true);
		
	}

}

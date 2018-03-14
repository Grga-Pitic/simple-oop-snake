package main.game.painter;

import main.game.Food;
import main.game.Snake;

/**
 * Interface of main output class.
 * @author Grga
 *
 */
public interface IPainter {
	/**
	 * The method paint snake
	 * @param snake
	 */
	void drawSnake(Snake snake);
	
	/**
	 * The method paint food
	 * @param food
	 */
	void drawFood (Food  food);
	
}

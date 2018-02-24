package main.game.painter;

import main.game.Food;
import main.game.Snake;

public interface IPainter {
	
	void drawSnake(Snake snake);
	void drawFood (Food  food);
	
}

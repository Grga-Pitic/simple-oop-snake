package main.game.services;

import java.util.List;

import main.game.Cell;
import main.game.Snake;

public class SnakeService {
	private static SnakeService instance;

	/**
	 * Init first 3 cell in the new snake
	 * @param snake
	 */
	public void initSnake(Snake snake) {
		
		List <Cell> body = snake.getBody();
		body.add(new Cell(3, 0));
		body.add(new Cell(3, 0));
		body.add(new Cell(3, 0));
		
	}
	
	public static SnakeService getInstance() {
		
		if(instance == null){
			instance = new SnakeService();
		}
		
		return instance;
	}
	
}

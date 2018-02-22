package main.game.services;

import java.util.List;

import main.game.Cell;
import main.game.GameContainer;
import main.game.Snake;

public class SnakeService {
	private static SnakeService instance;

	/**
	 * Init first 3 cell in the new snake
	 * @param snake
	 */
	public void initSnake(Snake snake) {
		
		List <Cell> body = snake.getBody();
		body.add(new Cell(2, 0));
		body.add(new Cell(1, 0));
		body.add(new Cell(0, 0));
		
	}
	
	public void move(Snake snake) {
		
		Cell tail = snake.getBody().remove(snake.getBody().size()-1);
		Cell head = snake.getBody().get(0);
		copyPosition(tail, head);
		
		switch(snake.getDirection()){
		case Snake.RIGHT: tail.setX(tail.getX()+1);
					      break;
		case Snake.LEFT:  tail.setX(tail.getX()-1);
						  break;
		case Snake.DOWN:  tail.setY(tail.getY()+1);
						  break;
		case Snake.UP:    tail.setY(tail.getY()+1);
					      break;
		}
		
		if(!GameContainer.getInstance().getField()[tail.getX()][tail.getY()]){
			snake.getBody().add(0, tail);
			return;
		}
		
		System.out.print("гамовер\n");
		
		
		
	}
	
	public static SnakeService getInstance() {
		
		if(instance == null){
			instance = new SnakeService();
		}
		
		return instance;
	}
	
	private void copyPosition(Cell cell1, Cell cell2) {
		
		cell1.setX(cell2.getX());
		cell1.setY(cell2.getY());
		
	}
	
}

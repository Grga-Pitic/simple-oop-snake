package main.game.services;

import java.util.List;

import main.game.Cell;
import main.game.Food;
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
		body.clear();
		body.add(new Cell(2, 0));
		body.add(new Cell(1, 0));
		body.add(new Cell(0, 0));
		snake.setDirection(Snake.RIGHT);
		
	}
	
	public void move(Snake snake) {
		
		boolean [][] field = GameContainer.getInstance().getField();
		
		Cell tail = snake.getBody().remove(snake.getBody().size()-1);
		Cell head = snake.getBody().get(0);
		field[tail.getX()][tail.getY()] = false;
		copyPosition(tail, head);
		
		switch(snake.getDirection()){
		case Snake.RIGHT: if(snake.getOldDirection() == Snake.LEFT){break;}
						  tail.setX(tail.getX()+1);
					      break;
		case Snake.LEFT:  if(snake.getOldDirection() == Snake.RIGHT){break;}
						  tail.setX(tail.getX()-1);
						  break;
		case Snake.DOWN:  if(snake.getOldDirection() == Snake.UP){break;}
						  tail.setY(tail.getY()+1);
						  break;
		case Snake.UP:    if(snake.getOldDirection() == Snake.DOWN){break;}
						  tail.setY(tail.getY()-1);
					      break;
		}
		
		
		if(GameContainer.getInstance().getSettings().isSolidWalls()){
			
			if(isWallCollision(tail)){
				GameContainer.getInstance().setGameOver(true);
				return;
			}
			
		} else {
			
			teleportCell(tail);
			
		}
		
//		if(isWallCollision(tail)){
//			GameContainer.getInstance().setGameOver(true);
//			return;
//		}
		
		
		// Checking for body collision.
		
		if(GameContainer.getInstance().getField()[tail.getX()][tail.getY()]){
			GameContainer.getInstance().setGameOver(true);
			return;
		}
		
		snake.getBody().add(0, tail);
		field[tail.getX()][tail.getY()] = true;
		
		// Cheacking for eating.
		
		Food food = GameContainer.getInstance().getFood();
		
		if((tail.getX() == food.getX())&&(tail.getY() == food.getY())){
			List <Cell> body = snake.getBody();
			body.add(1, new Cell(tail.getX(), tail.getY()));
			FoodService.getInstance().randomPosition(food);
			
		}
	}
	
	public static SnakeService getInstance() {
		
		if(instance == null){
			instance = new SnakeService();
		}
		
		return instance;
	}
	
	private boolean isWallCollision(Cell tail){
		if(!((tail.getX() >= 0) && (tail.getX() < GameContainer.getInstance().getSettings().getWidth()))) {
			return true;
			
		}
		
		if(!((tail.getY() >= 0) && (tail.getY() < GameContainer.getInstance().getSettings().getHeight()))) {
			return true;
		}
		
		return false;
	}
	
	private void teleportCell(Cell tail){
		if(tail.getX() < 0){
			tail.setX(GameContainer.getInstance().getSettings().getWidth()-1);
			return;
		}
		
		if(tail.getX() >=  GameContainer.getInstance().getSettings().getWidth()){
			tail.setX(0);
			return;
		}
		
		if(tail.getY() < 0){
			tail.setY(GameContainer.getInstance().getSettings().getHeight()-1);
			return;
		}
		
		if(tail.getY() >= GameContainer.getInstance().getSettings().getHeight()){
			tail.setY(0);
			return;
		}
	}
	
	private void copyPosition(Cell cell1, Cell cell2) {
		
		cell1.setX(cell2.getX());
		cell1.setY(cell2.getY());
		
	}
	
}

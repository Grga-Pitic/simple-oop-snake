package main.game.services;

import java.util.List;

import main.game.Cell;
import main.game.Snake;

/**
 * Class service. It process the game field.
 * @author Grga
 *
 */
public class FieldService {
	private static FieldService instance;
	
	public void placeTheSnake(boolean [][] field, Snake snake){
		
		List <Cell> body = snake.getBody();
		
		for(Cell cell:body){
			field[cell.getX()][cell.getY()] = true;
		}
		
	}
	
	public void setCell(boolean [][] field, int x, int y, boolean value) {
		
		field[x][y] = value;
	
	}
	
	public static FieldService getInstance() {
		
		if(instance == null) {
			instance = new FieldService();
		}
		return instance;
		
	}
	
}

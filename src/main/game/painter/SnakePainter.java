package main.game.painter;

import main.frames.components.CustomImage;
import main.game.Cell;
import main.game.Food;
import main.game.Snake;

public class SnakePainter implements IPainter {
	
	private static SnakePainter instance;
	
	public static SnakePainter getInstance(){
		
		if(instance == null){
			instance = new SnakePainter();
		}
		return instance;
		
	}
	
	@Override
	public void drawSnake(Snake snake) {
		
		
		for(Cell cell:snake.getBody()){
			cell.getImage().setImage(snake.getBodyImage());
			cell.getImage().setBounds(cell.getX()*CustomImage.CELL_SIZE, 
									  cell.getY()*CustomImage.CELL_SIZE, 
									  cell.getX()*CustomImage.CELL_SIZE+CustomImage.CELL_SIZE, 
									  cell.getY()*CustomImage.CELL_SIZE+CustomImage.CELL_SIZE);
			
		}
		
		Cell head = snake.getBody().get(0);
		head.getImage().setImage(snake.getHeadImage());
		head.getImage().setBounds(head.getX()*CustomImage.CELL_SIZE, 
								  head.getY()*CustomImage.CELL_SIZE, 
								  head.getX()*CustomImage.CELL_SIZE+CustomImage.CELL_SIZE, 
								  head.getY()*CustomImage.CELL_SIZE+CustomImage.CELL_SIZE);
		
		
		
	}

	@Override
	public void drawFood(Food food) {
		food.getImageComponent().setImage(food.getImage());
		food.getImageComponent().setBounds(food.getX()*CustomImage.CELL_SIZE, 
										   food.getY()*CustomImage.CELL_SIZE, 
										   food.getX()*CustomImage.CELL_SIZE+CustomImage.CELL_SIZE, 
										   food.getY()*CustomImage.CELL_SIZE+CustomImage.CELL_SIZE);
	}
	
}

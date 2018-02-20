package main.game.printer;

import main.frames.components.CustomImage;
import main.game.Cell;
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
			System.out.print(cell.getX() + " "+ cell.getY()+"\n");
			cell.getImage().setBounds(cell.getX()*CustomImage.CELL_SIZE, 
									  cell.getY()*CustomImage.CELL_SIZE, 
									  cell.getX()*CustomImage.CELL_SIZE+CustomImage.CELL_SIZE, 
									  cell.getY()*CustomImage.CELL_SIZE+CustomImage.CELL_SIZE);
			
		}
		
	}
	
}

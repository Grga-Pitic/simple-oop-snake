package main.game.services;

import java.util.Random;

import main.game.Food;
import main.game.GameContainer;

/**
 * Class service. It need to generate new random food position.
 * @author Grga
 *
 */
public class FoodService {
	public static FoodService instance;
	
	public void randomPosition(Food food) {
		
		int fieldWidth  = GameContainer.getInstance().getSettings().getWidth();
		int fieldHeigth =  GameContainer.getInstance().getSettings().getHeight();
		
		Random random = new Random();
		int x = random.nextInt(fieldWidth);
		int y = random.nextInt(fieldHeigth);
		
		boolean [][] field = GameContainer.getInstance().getField();
		
		if(field[x][y]){
			x = random.nextInt(fieldWidth);
			y = random.nextInt(fieldHeigth);
		}
		
		food.setX(x);
		food.setY(y);
		
	}
	
	public static FoodService getInstance() {
		if(instance == null) {
			instance = new FoodService();
		}
		return instance;
	}
}

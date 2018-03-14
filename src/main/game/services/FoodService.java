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
		
		Random random = new Random();
		int x = random.nextInt(GameContainer.WIDTH);
		int y = random.nextInt(GameContainer.HEIGHT);
		
		boolean [][] field = GameContainer.getInstance().getField();
		
		if(field[x][y]){
			x = random.nextInt(GameContainer.WIDTH);
			y = random.nextInt(GameContainer.HEIGHT);
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

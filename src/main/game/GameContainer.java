package main.game;

import main.settings.factoryes.SettingFactory;
import main.settings.model.Settings;


/**
 * Class container. It store the game data. 
 * @author Grga
 *
 */
public class GameContainer {
	public static final int WIDTH     = 16;
	public static final int HEIGHT    = 16;
	
	public static final int NORMAL_SPEED = 200;
	public static final int LOW_SPEED    = NORMAL_SPEED*2;
	public static final int HIGH_SPEED   = NORMAL_SPEED/2;
	
	private static volatile GameContainer instance;
	
	private boolean gameOver;
	
	private boolean [][] field;
	private Snake        snake;
	private Food		 food;
	private int          timeDelay;
	
	private Settings     settings;
	
	public GameContainer() {
		
		this.field     = new boolean[WIDTH][HEIGHT];
		this.gameOver  = false;
		this.settings  = SettingFactory.getInstance().createSettings();
		this.timeDelay = NORMAL_SPEED;
	}
	
	public Snake getSnake() {
		return snake;
	}

	public void setSnake(Snake snake) {
		this.snake = snake;
	}

	public boolean[][] getField() {
		return field;
	}
	
	public boolean isGameOver() {
		return gameOver;
	}

	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}
	
	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}
	
	public int getTimeDelay() {
		return timeDelay;
	}

	public void setTimeDelay(int timeDelay) {
		this.timeDelay = timeDelay;
	}

	public Settings getSettings() {
		return settings;
	}

	public synchronized static GameContainer getInstance() {
		
		if(instance == null){
			instance = new GameContainer();
		}
		return instance;
		
	}
	
}

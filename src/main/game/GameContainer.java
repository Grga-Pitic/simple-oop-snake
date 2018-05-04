package main.game;

import main.settings.factoryes.SettingFactory;
import main.settings.model.Settings;


/**
 * Class container. It store the game data. 
 * @author Grga
 *
 */
public class GameContainer {
	public static final int WIDTH  = 16;
	public static final int HEIGHT = 16;
	
	private static volatile GameContainer instance;
	
	private boolean gameOver;
	private boolean solidWalls;
	
	private boolean [][] field;
	private Snake        snake;
	private Food		 food;
	private int          timeDelay;
	
	private Settings     settings;
	
	public GameContainer() {
		
		this.gameOver  = false;
		this.settings  = SettingFactory.getInstance().createSettings();
		this.timeDelay = settings.getGameSpeed();
		this.field     = new boolean[settings.getWidth()][settings.getHeight()];
		applySpeed(Settings.SPEED_STEP);
		
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
	
	public void setField(boolean[][] field) {
		this.field = field;
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
	
	public boolean isSolidWalls() {
		return solidWalls;
	}

	public void setSolidWalls(boolean solidWalls) {
		this.solidWalls = solidWalls;
	}
	
	public void applySpeed(int speedStep){
		
		if(speedStep <= 0){
			speedStep = 200;
		}
		
		this.timeDelay = this.settings.getGameSpeed() * speedStep;
		
	}

	public synchronized static GameContainer getInstance() {
		
		if(instance == null){
			instance = new GameContainer();
		}
		
		return instance;
		
	}
	
}

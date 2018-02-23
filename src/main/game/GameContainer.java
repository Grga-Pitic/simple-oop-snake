package main.game;

public class GameContainer {
	public static final int WIDTH     = 16;
	public static final int HEIGHT    = 16;
	
	private static volatile GameContainer instance;
	
	private boolean gameOver;
	
	private boolean [][] field;
	private Snake        snake;
	
	public GameContainer() {
		
		this.field    = new boolean[WIDTH][HEIGHT];
		this.gameOver = false;
		
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

	public synchronized static GameContainer getInstance() {
		
		if(instance == null){
			instance = new GameContainer();
		}
		return instance;
		
	}
	
}

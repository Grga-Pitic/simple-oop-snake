package main.game;

public class GameContainer {
	private static final int WIDTH     = 16;
	private static final int HEIGHT    = 16;
	private static final int CELL_SIZE = 16;
	
	private static volatile GameContainer instance;
	
	private boolean [][] field;
	private Snake        snake;
	
	public GameContainer() {
		
		this.field = new boolean[WIDTH][HEIGHT];
		
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

	public synchronized static GameContainer getInstance() {
		if(instance == null){
			instance = new GameContainer();
		}
		return instance;
	}
	
}

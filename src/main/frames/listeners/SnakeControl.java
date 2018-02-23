package main.frames.listeners;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;
import java.util.Set;

import main.game.Cell;
import main.game.GameContainer;
import main.game.Snake;

public class SnakeControl implements KeyListener {
	private Set <Character> upSimbols;
	private Set <Character> downSimbols;
	private Set <Character> leftSimbols;
	private Set <Character> rightSimbols;
	
	public SnakeControl(){
		
		this.upSimbols    = new HashSet<Character>();
		this.downSimbols  = new HashSet<Character>();
		this.leftSimbols  = new HashSet<Character>();
		this.rightSimbols = new HashSet<Character>();
	}

	@Override
	public void keyPressed(KeyEvent event) {
		int newDirection;
		int newX;
		int newY;
		
		Cell head = GameContainer.getInstance().getSnake().getBody().get(0);
		
		char simbol = event.getKeyChar();
		
		if(simbol == 'w'){
			newDirection = Snake.UP;
			newX         = head.getX();
			newY		 = head.getY()-1;
		} else
		if(simbol == 's'){
			newDirection = Snake.DOWN;
			newX         = head.getX();
			newY		 = head.getY()+1;
		} else
		if(simbol == 'a'){
			newDirection = Snake.LEFT;
			newX         = head.getX()-1;
			newY		 = head.getY();
		} else 
		if(simbol == 'd'){
			newDirection = Snake.RIGHT;
			newX         = head.getX()+1;
			newY		 = head.getY();
		} else {
			return;
		}
		
		Cell secondCell = GameContainer.getInstance().getSnake().getBody().get(1);
		
		if((secondCell.getX()==newX)&&(secondCell.getY()==newY)){
			return;
		}
		
		GameContainer.getInstance().getSnake().setDirection(newDirection);
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}

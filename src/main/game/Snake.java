package main.game;

import java.awt.Image;
import java.util.List;


/**
 * Class container. It store the snake data.
 * @author Grga
 *
 */
public class Snake {
	public static final int UP    = 0;
	public static final int RIGHT = 1;
	public static final int DOWN  = 2;
	public static final int LEFT  = 3;
	
	private List <Cell> body;
	private int score;
	
	private Image headImage;
	private Image bodyImage;
	
	private int direction;
	
	public Snake(List <Cell> body) {
		this.body = body;
		this.direction = RIGHT;
	}
	
	public int getDirection() {
		return this.direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public Image getHeadImage() {
		return this.headImage;
	}

	public void setHeadImage(Image headImage) {
		this.headImage = headImage;
	}

	public Image getBodyImage() {
		return this.bodyImage;
	}

	public void setBodyImage(Image bodyImage) {
		this.bodyImage = bodyImage;
	}

	public List<Cell> getBody() {
		return this.body;
	}
	
}

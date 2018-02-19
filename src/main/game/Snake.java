package main.game;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

public class Snake {
	List <Cell> body;
	private int score;
	
	private Image headImage;
	private Image bodyImage;
	
	public Snake(List <Cell> body) {
		this.body = body;
	}
	
	public Image getHeadImage() {
		return headImage;
	}

	public void setHeadImage(Image headImage) {
		this.headImage = headImage;
	}

	public Image getBodyImage() {
		return bodyImage;
	}

	public void setBodyImage(Image bodyImage) {
		this.bodyImage = bodyImage;
	}

	public List<Cell> getBody() {
		return body;
	}
	
}

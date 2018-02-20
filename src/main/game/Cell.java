package main.game;

import main.frames.components.CustomImage;
import main.frames.manager.FrameManager;

public class Cell {
	private int x;
	private int y;
	
	private CustomImage image;
	
	public Cell(int x, int y) {

		this.x = x;
		this.y = y;
		this.image = new CustomImage();
		FrameManager.getInstance().getGameFrame().getContentPane().add(image);
	
	}
	
	public CustomImage getImage(){
		return this.image;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}

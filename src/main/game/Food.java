package main.game;

import java.awt.Image;

import main.frames.components.CustomImage;
import main.frames.manager.FrameManager;

public class Food {
	private int x;
	private int y;
	
	private Image image;
	private CustomImage imageComponent;
	
	public Food(Image image) {
		
		this.image          = image;
		this.imageComponent = new CustomImage();
		FrameManager.getInstance().getGameFrame().getContentPane().add(imageComponent);
		
//		this.x = x;
//		this.y = y;
		
	}
	
	public CustomImage getImageComponent() {
		return imageComponent;
	}

	public void setImageComponent(CustomImage imageComponent) {
		this.imageComponent = imageComponent;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
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

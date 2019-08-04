package main.game;

import java.awt.Image;

import main.frames.components.CustomImage;


/**
 * Class store the snake food data.
 * @author Grga
 *
 */
public class Food {
	private int x;
	private int y;
	
	private Image image;
	private CustomImage imageComponent;
	
	public Food(Image image) {
		
		this.image          = image;
		this.imageComponent = new CustomImage();
		
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

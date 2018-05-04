package main.settings.model;

import java.io.Serializable;

public class Settings implements Serializable {
	
	private int gameSpeed;
	private int height;
	private int width;
	
	private boolean solidWalls;
	
	public static int SPEED_STEP = 100;
	
	public Settings() {
		this.gameSpeed = 2;
		this.height    = 16;
		this.width     = 16;
		
		this.solidWalls = true;
	}

	public int getGameSpeed() {
		return gameSpeed;
	}

	public void setGameSpeed(int gameSpeed) {
		this.gameSpeed = gameSpeed;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public boolean isSolidWalls() {
		return solidWalls;
	}

	public void setSolidWalls(boolean solidWalls) {
		this.solidWalls = solidWalls;
	}
	
}

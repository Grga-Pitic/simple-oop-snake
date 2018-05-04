package main.game.services;

import main.game.GameContainer;
import main.settings.model.Settings;

public class GameDataService {
	private static GameDataService instance;
	
	public void applySettings(GameContainer game) {
		
		Settings settings = game.getSettings();
		game.setField(new boolean[settings.getWidth()][settings.getHeight()]);
		game.setTimeDelay(settings.getGameSpeed());
		game.setSolidWalls(settings.isSolidWalls());
		
	}
	
	public static GameDataService getInstance() {
		
		if(instance == null){
			instance = new GameDataService();
		}
		return instance;
	
	}
}

package main.settings.services;

import main.settings.model.Settings;


/**
 * Class-service. It does coping settings, restore to default etc.
 * @author Grga
 *
 */
public class SettingService {
	private static SettingService instance;
	
	
	/**
	 * The method copy the settings 
	 * @param s1 copies settings to this parameter
	 * @param s2 copies settings from this parameter
	 */
	public void copySettings(Settings s1, Settings s2) {
		s1.setGameSpeed(s2.getGameSpeed());
		s1.setHeight(s2.getHeight());
		s1.setWidth(s2.getWidth());
		s1.setSolidWalls(s2.isSolidWalls());
	}
	
	public void setDefaultSettings(Settings settings) {
		
		settings.setGameSpeed(400);
		settings.setHeight(16);
		settings.setWidth(16);
		settings.setSolidWalls(true);
		
	}
	
	public static SettingService getInstance() {
		if(instance == null){
			instance = new SettingService();
		}
		return instance;
	}
	
	
}

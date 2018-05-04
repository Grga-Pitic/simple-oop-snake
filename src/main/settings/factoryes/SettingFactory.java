package main.settings.factoryes;

import main.settings.model.Settings;
import main.settings.services.SettingIOService;

public class SettingFactory {
	
	private static SettingFactory instance;
	
	public Settings createSettings() {
		try {
			return SettingIOService.getInstance().loadFromFile();
		} catch (Exception e) {
			System.out.print("new settings\n");
			return new Settings();
		} 
		
	}
	
	public static SettingFactory getInstance() {
		
		if (instance == null) {
			instance = new SettingFactory();
		}
		return instance;
		
	}
	
}

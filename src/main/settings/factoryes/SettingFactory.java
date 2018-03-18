package main.settings.factoryes;

import main.settings.model.Settings;

public class SettingFactory {
	
	private static SettingFactory instance;
	
	public Settings createSettings() {
		return new Settings();
	}
	
	public static SettingFactory getInstance() {
		
		if (instance == null) {
			instance = new SettingFactory();
		}
		return instance;
		
	}
	
}

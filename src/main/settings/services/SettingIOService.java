package main.settings.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import main.settings.model.Settings;

/**
 * Class-service. It does all file working.
 * @author Grga
 *
 */
public class SettingIOService {
	private static SettingIOService instance;
	
	public void saveToFile(Settings settings) throws IOException{
		
		File settingsFolder = new File("settings");
		if(!settingsFolder.exists()){
			settingsFolder.mkdir();
		}
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("settings/GameSettings.txt"));
		output.writeObject(settings);
		output.close();
		
	}
	
	public void loadFromFile(Settings settings) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream input = new ObjectInputStream(new FileInputStream(""));
		Settings readed = (Settings)input.readObject();
		SettingService.getInstance().copySettings(settings, readed);
	}
	
	public static SettingIOService getInstance() {
		if(instance == null){
			instance = new SettingIOService();
		}
		return instance;
	}

}

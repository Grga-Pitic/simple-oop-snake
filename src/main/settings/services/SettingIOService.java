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
 * Class-service. It does file saving and file loading.
 * @author Grga
 *
 */
public class SettingIOService {
	private static SettingIOService instance;
	
	public void saveToFile(Settings settings) throws IOException {
		File settingsFolder = new File("settings");
		File settingsFile   = new File("settings/GameSettings.txt");
		
		if(!settingsFolder.exists()){
			settingsFolder.mkdir();
		}
		
		ObjectOutputStream output;
		output = new ObjectOutputStream(new FileOutputStream(settingsFile));
		try {
			output.writeObject(settings);
			
		} catch (FileNotFoundException e) {
			settingsFile.createNewFile();
			output.writeObject(settings);
		}
		output.close();
		
	}
	
	// TODO
	public Settings loadFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("settings/GameSettings.txt"));
		Settings settings = (Settings)input.readObject();
		input.close();
		return settings;

	}
	
	public static SettingIOService getInstance() {
		if(instance == null){
			instance = new SettingIOService();
		}
		return instance;
	}

}

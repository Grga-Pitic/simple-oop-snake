package main.frames.manager;

import javax.swing.JFrame;

import main.frames.GameFrame;
import main.frames.GameoverFrame;
import main.frames.MenuFrame;
import main.frames.SettingsFrame;

public class FrameManager {
	private static FrameManager instance;
	
	private JFrame gameFrame;
	private JFrame menuFrame;
	private JFrame gameoverFrame;
	private JFrame settingsFrame;
	
	public JFrame getGameoverFrame() {
		if(gameoverFrame == null){
			gameoverFrame = new GameoverFrame();
		}
		return gameoverFrame;
	}

	public JFrame getGameFrame(){
		if(this.gameFrame == null){
			this.gameFrame = new GameFrame();
		}
		return gameFrame;
	}
	
	public JFrame getMenuFrame(){
		if(this.menuFrame == null){
			this.menuFrame = new MenuFrame();
		}
		return this.menuFrame;
	}
	
	public JFrame getSettingsFrame(){
		
		if(settingsFrame == null){
			settingsFrame = new SettingsFrame();
		}
		return settingsFrame;
		
	}
	
	public static FrameManager getInstance() {
		if(instance == null){
			instance = new FrameManager();
		}
		return instance;
	}
	
	
}

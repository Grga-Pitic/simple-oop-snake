package main.frames.manager;

import java.util.Map;

import javax.swing.JFrame;

import main.frames.GameFrame;
import main.frames.GameoverFrame;
import main.frames.MenuFrame;
import main.game.GameContainer;

public class FrameManager {
	private static FrameManager instance;
	
	private JFrame gameFrame;
	private JFrame menuFrame;
	private JFrame gameoverFrame;
	
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
	
	public static FrameManager getInstance() {
		if(instance == null){
			instance = new FrameManager();
		}
		return instance;
	}
	
	
}

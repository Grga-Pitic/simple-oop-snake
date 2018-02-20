package main;

import main.frames.manager.FrameManager;
import main.game.threads.GameThread;

public class Activator {
	public static void main(String [] args) {
		FrameManager.getInstance().getGameFrame().setVisible(true);
		new Thread(new GameThread()).start();
	}
}

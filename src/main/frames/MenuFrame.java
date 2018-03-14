package main.frames;

import javax.swing.JFrame;

import java.awt.GridBagLayout;

import javax.swing.JPanel;

import java.awt.GridBagConstraints;

import javax.swing.JButton;

import java.awt.Insets;

import javax.swing.border.EmptyBorder;

import main.frames.manager.FrameManager;
import main.game.GameContainer;
import main.game.Snake;
import main.game.services.FieldService;
import main.game.services.SnakeService;
import main.game.threads.GameThread;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuFrame extends JFrame {
	
	private JFrame me;
	
	public MenuFrame() {
		this.me = this;
		
		setTitle("Snake");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(245, 243);
		setLocationRelativeTo(null);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(8, 8, 8, 8));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				me.setVisible(false);
				GameContainer game  = GameContainer.getInstance();
				Snake snake         = game.getSnake();
				
				SnakeService.getInstance().initSnake(snake);
				FieldService.getInstance().placeTheSnake(game.getField(), snake);
				
				
				new Thread(new GameThread()).start();
				FrameManager.getInstance().getGameFrame().setVisible(true);
			}
		});
		GridBagConstraints gbc_btnNewGame = new GridBagConstraints();
		gbc_btnNewGame.fill = GridBagConstraints.BOTH;
		gbc_btnNewGame.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewGame.gridx = 0;
		gbc_btnNewGame.gridy = 0;
		panel.add(btnNewGame, gbc_btnNewGame);
		
		JButton btnSettings = new JButton("Settings");
		GridBagConstraints gbc_btnSettings = new GridBagConstraints();
		gbc_btnSettings.fill = GridBagConstraints.BOTH;
		gbc_btnSettings.insets = new Insets(0, 0, 5, 0);
		gbc_btnSettings.gridx = 0;
		gbc_btnSettings.gridy = 1;
		panel.add(btnSettings, gbc_btnSettings);
		
		JButton btnExit = new JButton("Exit");
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.fill = GridBagConstraints.BOTH;
		gbc_btnExit.gridx = 0;
		gbc_btnExit.gridy = 2;
		panel.add(btnExit, gbc_btnExit);
	}

}

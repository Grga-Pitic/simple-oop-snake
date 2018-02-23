package main.frames;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GameoverFrame extends JFrame {
	public GameoverFrame() {
		setTitle("Game over");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(155,163);
		setResizable(false);
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
		gbl_panel.columnWidths = new int[]{54, 0};
		gbl_panel.rowHeights = new int[]{23, 23, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblGameOver = new JLabel("Game Over");
		GridBagConstraints gbc_lblGameOver = new GridBagConstraints();
		gbc_lblGameOver.insets = new Insets(0, 0, 5, 0);
		gbc_lblGameOver.gridx = 0;
		gbc_lblGameOver.gridy = 0;
		panel.add(lblGameOver, gbc_lblGameOver);
		
		JButton btnNewGame = new JButton("New Game");
		GridBagConstraints gbc_btnNewGame = new GridBagConstraints();
		gbc_btnNewGame.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewGame.anchor = GridBagConstraints.NORTH;
		gbc_btnNewGame.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewGame.gridx = 0;
		gbc_btnNewGame.gridy = 1;
		panel.add(btnNewGame, gbc_btnNewGame);
		
		JButton btnMenu = new JButton("Menu");
		GridBagConstraints gbc_btnMenu = new GridBagConstraints();
		gbc_btnMenu.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMenu.anchor = GridBagConstraints.NORTH;
		gbc_btnMenu.insets = new Insets(0, 0, 5, 0);
		gbc_btnMenu.gridx = 0;
		gbc_btnMenu.gridy = 2;
		panel.add(btnMenu, gbc_btnMenu);
		
		JButton btnExit = new JButton("Exit");
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnExit.anchor = GridBagConstraints.NORTH;
		gbc_btnExit.gridx = 0;
		gbc_btnExit.gridy = 3;
		panel.add(btnExit, gbc_btnExit);
	}
	
}

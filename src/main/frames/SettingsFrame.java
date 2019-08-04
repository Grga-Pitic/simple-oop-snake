package main.frames;

import javax.swing.JFrame;

import java.awt.GridBagLayout;

import javax.swing.JPanel;

import java.awt.GridBagConstraints;

import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import main.frames.manager.FrameManager;
import main.game.GameContainer;
import main.settings.model.Settings;
import main.settings.services.SettingIOService;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class SettingsFrame extends JFrame {
	private JComboBox solidWallsBox;
	private JComboBox gameSpeedBox;
	private JSpinner heightSpinner;
	private JSpinner widthSpinner;
	
	public SettingsFrame() {
		setTitle("Settings");
		setSize(322, 156);
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
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Game speed");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		gameSpeedBox = new JComboBox();
		gameSpeedBox.setModel(new DefaultComboBoxModel(new String[] {"Very Easy", "Easy", "Normal", "Hard", "Very Hard"}));
		gameSpeedBox.setSelectedIndex(gameSpeedBox.getItemCount() - 
				GameContainer.getInstance().getSettings().getGameSpeed());
		GridBagConstraints gbc_gameSpeedBox = new GridBagConstraints();
		gbc_gameSpeedBox.insets = new Insets(0, 0, 5, 0);
		gbc_gameSpeedBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_gameSpeedBox.gridx = 1;
		gbc_gameSpeedBox.gridy = 0;
		panel.add(gameSpeedBox, gbc_gameSpeedBox);
		
		JLabel lblNewLabel_1 = new JLabel("Solid walls");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		solidWallsBox = new JComboBox();
		solidWallsBox.setModel(new DefaultComboBoxModel(new String[] {"Disabled", "Enabled"}));
		
		if(GameContainer.getInstance().getSettings().isSolidWalls()){
			solidWallsBox.setSelectedIndex(1);
		} else {
			solidWallsBox.setSelectedIndex(0);
		}
		
		GridBagConstraints gbc_solidWallsBox = new GridBagConstraints();
		gbc_solidWallsBox.insets = new Insets(0, 0, 5, 0);
		gbc_solidWallsBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_solidWallsBox.gridx = 1;
		gbc_solidWallsBox.gridy = 1;
		panel.add(solidWallsBox, gbc_solidWallsBox);
		
		JLabel lblFieldSize = new JLabel("Field size");
		GridBagConstraints gbc_lblFieldSize = new GridBagConstraints();
		gbc_lblFieldSize.anchor = GridBagConstraints.EAST;
		gbc_lblFieldSize.insets = new Insets(0, 0, 5, 5);
		gbc_lblFieldSize.gridx = 0;
		gbc_lblFieldSize.gridy = 2;
		panel.add(lblFieldSize, gbc_lblFieldSize);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FrameManager.getInstance().getSettingsFrame().setVisible(false);
			}
		});
		
		NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());
		DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
		decimalFormat.setGroupingUsed(false);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 2;
		panel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblHeight = new JLabel("height:");
		GridBagConstraints gbc_lblHeight = new GridBagConstraints();
		gbc_lblHeight.anchor = GridBagConstraints.WEST;
		gbc_lblHeight.insets = new Insets(0, 0, 0, 5);
		gbc_lblHeight.gridx = 0;
		gbc_lblHeight.gridy = 0;
		panel_1.add(lblHeight, gbc_lblHeight);
		
		heightSpinner = new JSpinner();
		heightSpinner.setModel(new SpinnerNumberModel(
				GameContainer.getInstance().getSettings().getHeight(), 0, 24, 1));
		GridBagConstraints gbc_heightSpinner = new GridBagConstraints();
		gbc_heightSpinner.anchor = GridBagConstraints.WEST;
		gbc_heightSpinner.insets = new Insets(0, 0, 0, 5);
		gbc_heightSpinner.gridx = 1;
		gbc_heightSpinner.gridy = 0;
		panel_1.add(heightSpinner, gbc_heightSpinner);
		
		JLabel lblWidth = new JLabel("width: ");
		GridBagConstraints gbc_lblWidth = new GridBagConstraints();
		gbc_lblWidth.insets = new Insets(0, 0, 0, 5);
		gbc_lblWidth.anchor = GridBagConstraints.WEST;
		gbc_lblWidth.gridx = 2;
		gbc_lblWidth.gridy = 0;
		panel_1.add(lblWidth, gbc_lblWidth);
		
		widthSpinner = new JSpinner();
		widthSpinner.setModel(new SpinnerNumberModel(
				GameContainer.getInstance().getSettings().getWidth(), 0, 32, 1));
		GridBagConstraints gbc_widthSpinner = new GridBagConstraints();
		gbc_widthSpinner.gridx = 3;
		gbc_widthSpinner.gridy = 0;
		panel_1.add(widthSpinner, gbc_widthSpinner);
		GridBagConstraints gbc_cancelButton = new GridBagConstraints();
		gbc_cancelButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_cancelButton.insets = new Insets(0, 0, 0, 5);
		gbc_cancelButton.gridx = 0;
		gbc_cancelButton.gridy = 3;
		panel.add(cancelButton, gbc_cancelButton);
		
		JButton acceptButton = new JButton("Accept");
		acceptButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				int newHeight = (int)heightSpinner.getValue();
				int newWidth  = (int)widthSpinner.getValue();
				int gameSpeed = gameSpeedBox.getItemCount() - gameSpeedBox.getSelectedIndex();
				
				Settings settings = GameContainer.getInstance().getSettings();
				settings.setGameSpeed(gameSpeed); 
				settings.setHeight(newHeight);
				settings.setWidth (newWidth );
				((GameFrame)FrameManager.getInstance().getGameFrame()).changeSize();
				
				GameContainer.getInstance().applySpeed(Settings.SPEED_STEP);
				GameContainer.getInstance().setField(new boolean[newWidth][newHeight]);
				
				FrameManager.getInstance().getGameFrame().setLocationRelativeTo(null);
				
				try {
					SettingIOService.getInstance().saveToFile(settings);
				} catch (IOException e) {
					//do nothing
				}
				
				if(solidWallsBox.getSelectedIndex() == 0){
					settings.setSolidWalls(false);
					return;
				}
				settings.setSolidWalls(true);
				
			}
		});
		GridBagConstraints gbc_acceptButton = new GridBagConstraints();
		gbc_acceptButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_acceptButton.gridx = 1;
		gbc_acceptButton.gridy = 3;
		panel.add(acceptButton, gbc_acceptButton);
	}

}

package main.frames.components;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JComponent;

public class CustomImage extends JComponent {
	
	public static final int CELL_SIZE = 16;
	
	private Image image;
	
	public void setImage(Image image) {
		this.image = image;
	}
	
	@Override 
	public void paint(Graphics g){
		if(image != null){
			g.drawImage(image, 0, 0, CELL_SIZE, CELL_SIZE, null);
		}
	}
	
}

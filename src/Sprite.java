import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Sprite {
	private String file;
	private BufferedImage img;
	
	public Sprite(String filename){
		file = filename;
		
		try {
			img = ImageIO.read(new File(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void draw(Graphics g, int x, int y, int width, int height){
		g.drawImage(img, x, y, width, height, null);
	}
	
}

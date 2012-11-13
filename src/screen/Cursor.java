package screen;

import java.awt.Graphics;

import characters.Image;

public class Cursor {
	private int x;
	private int y;
	private final int width  = 40;
	private final int height = 40;
	private Image img;
	
	public Cursor(int x, int y){
		this.x = x;
		this.y = y;
		img = new Image("Sprites/Reticle.png");
	}
	
	public void draw(Graphics g){
		img.draw(g, x, y, width, height, 0, 0);
	}

	private int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}

	private int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}

	public void setCur(int x, int y) {
		this.x = x - width/2;
		this.y = y - height/2;
	}
}

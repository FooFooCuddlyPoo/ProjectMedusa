package screen;

import java.awt.Graphics;

import characters.Sprite;

public class Cursor {
	private int x;
	private int y;
	private final int width  = 64;
	private final int height = 64;
	private Sprite img;
	
	public Cursor(int x, int y){
		this.x = x;
		this.y = y;
		img = new Sprite("Sprites/Reticle.png");
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

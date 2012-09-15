import java.awt.Color;
import java.awt.Graphics;

public class Hitbox<E> {

	private int x;
	private int y;
	private int width;
	private int height;

	public Hitbox(int xIn, int yIn, int widthIn, int heightIn) {

		x = xIn;
		y = yIn;
		width = widthIn;
		height = heightIn;

	}

	// Getters and Setters:
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// Checks collision

	public boolean collisionCheck(E Hitbox) {
		return false;
	}

	public boolean collisionCheck(int x, int y) {
		if (x >= this.x && x <= (this.x + this.width) && y >= this.y && y <= (this.y + this.height)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void draw(Graphics g){
		g.setColor(Color.RED);
		g.drawRect(x, y, width, height);
	}

}

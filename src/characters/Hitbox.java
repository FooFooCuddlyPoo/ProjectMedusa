package characters;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Hitbox{

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

	public boolean collisionCheck(Hitbox h) {

		Rectangle temp  = new Rectangle(this.x, this.y, this.width, this.height);
		Rectangle temp2 = new Rectangle(h.x, h.y, h.width, h.height);
		return temp.intersects(temp2);
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

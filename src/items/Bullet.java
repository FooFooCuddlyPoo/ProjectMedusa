package items;

import java.awt.Graphics;

import characters.Hitbox;
import characters.Sprite;

public class Bullet {
	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;
	
	private Sprite img;
	
	private Hitbox h;
	
	private static final int speed = 10;
	private static final int BULLET_WIDTH = 8;
	private static final int BULLET_HEIGHT = 8;
	
	public Bullet(int origX, int origY, int destX, int destY){
		System.out.println("bullet constructor got called");
		x = origX;
		y = origY;
		
		double angle = Math.tan((destY - origY)/(destX - origX));
		System.out.println("angle is: "+angle);
		
		xSpeed = (int) (Math.cos(angle)*speed);
		ySpeed = (int) (Math.sin(angle)*speed);
		
		img = new Sprite("Sprites/Bullet.png");
		h = new Hitbox(x, y, BULLET_WIDTH, BULLET_HEIGHT);
	}
	
	public void move(){
		x += xSpeed;
		y += ySpeed;
		
		h.setX(x);
		h.setY(y);
	}

	public Hitbox getHitbox() {
		return h;
	}

	public void setHitbox(Hitbox h) {
		this.h = h;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void draw(Graphics g){
		img.draw(g, x, y, BULLET_WIDTH, BULLET_HEIGHT, 0, 0);
	}

}

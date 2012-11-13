package map;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import characters.Hitbox;
import characters.Image;


public class Wall implements Tile{
	private int x;
	private int y;
	
	private Hitbox h;
	
	private Image img;
	
	public Wall(int x, int y){
		this.x = x;
		this.y = y;
		
		h = new Hitbox(x, y, Tile.TILE_WIDTH, Tile.TILE_HEIGHT);
		
		img = new Image("Sprites/wall.png");
	}
	
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

	@Override
	public void draw(Graphics g) {
		img.draw(g, x, y, Tile.TILE_WIDTH, Tile.TILE_HEIGHT, 0, 0);
	}

	@Override
	public Hitbox getHitbox() {
		return h;
	}
	
}

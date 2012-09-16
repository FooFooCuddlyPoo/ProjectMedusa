import java.awt.Graphics;


public interface Tile {
	public static final int TILE_HEIGHT = 32;
	public static final int TILE_WIDTH = 32;
	
	public void draw(Graphics g);
	
	public int getX();
	public int getY();
	
	public Hitbox getHitbox();
}

import java.awt.Graphics;


public interface Tile {
	public static int TILE_HEIGHT = 32;
	public static int TILE_WIDTH = 32;
	
	public void draw(Graphics g);
	
	public int getX();
	public int getY();
}

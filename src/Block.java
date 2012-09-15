import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class Block implements Tile{
	private int x;
	private int y;
	
	private Sprite img;
	
	public Block(int x, int y){
		this.x = x;
		this.y = y;
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
		img.draw(g, x, y, Tile.TILE_WIDTH, Tile.TILE_HEIGHT);
	}
	
}

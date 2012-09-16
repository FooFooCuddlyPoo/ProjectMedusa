import java.awt.Graphics;


public class Character {
	public static final int CHAR_WIDTH  = 30;
	public static final int CHAR_HEIGHT = 60;
	private int x;
	private int y;
	
	private Sprite img;
	
	public Character(int x, int y){
		this.x = x;
		this.y = y;
		
		img = new Sprite("Sprites/sprites_map_claudius.png");
	}
	
	public void move(int x, int y){
		this.x += x;
		this.y += y;
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
	
	public String toString(){
		return "X: "+x+" Y: "+y;
	}
	
	public void draw(Graphics g){
		//img.draw(g, x, y, CHAR_WIDTH, CHAR_HEIGHT);
		g.fillRect(x, y, CHAR_WIDTH, CHAR_HEIGHT);
	}
}

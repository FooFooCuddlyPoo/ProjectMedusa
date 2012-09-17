import java.awt.Graphics;

public class Character {
	private final int speed = 3;
	
	public static final int CHAR_WIDTH = 32;
	public static final int CHAR_HEIGHT = 60;
	private int x;
	private int y;
	private Hitbox feetHitbox;
	private Hitbox bodyHitbox;

	private Sprite img;

	private int spriteStage;
	private int direction; // 0 = down, 1 = left, 2 = up, 3 = right
	private boolean moving;

	public Character(int x, int y) {
		this.x = x;
		this.y = y;
		feetHitbox = new Hitbox(x, y + 40, CHAR_WIDTH, CHAR_HEIGHT - 40);
		bodyHitbox = new Hitbox(x, y, CHAR_WIDTH, CHAR_HEIGHT);
		img = new Sprite("Sprites/Character.png");
		direction = 3;
		spriteStage = 0;
		moving = false;
	}


	public void move(boolean movingLeft, boolean movingUp, boolean movingRight, boolean movingDown, Tile tiles[][]) {

		if (!checkFeetCollision(tiles)) {
			if(movingLeft)
				this.x -= speed;
			if(movingUp)
				this.y -= speed;
			if(movingRight)
				this.x += speed;
			if(movingDown)
				this.y += speed;
			
			this.direction = direction;
			if (spriteStage >= 0 && spriteStage < 5)
				spriteStage++;
			else
				spriteStage = 0;
			
			feetHitbox.setX(this.x);
			feetHitbox.setY(this.y + 40);
		}
	}
	
	public boolean checkFeetCollision(Tile[][] tiles) {
		for (int h = 0; h < tiles.length; h++) {
			for (int w = 0; w < tiles[0].length; w++) {
				if (tiles[h][w].getHitbox() != null && getFeetHitbox().collisionCheck(tiles[h][w].getHitbox())){
					return true;
				}
			}
		}
		return false;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String toString() {
		return "X: " + x + " Y: " + y;
	}

	public void draw(Graphics g) {
		img.draw(g, x, y, CHAR_WIDTH, CHAR_HEIGHT, spriteStage, direction);
	}


	public Hitbox getFeetHitbox() {
		return feetHitbox;
	}

}

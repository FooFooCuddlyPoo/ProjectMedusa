package characters;
import java.awt.Graphics;

import map.Tile;

public class Character {
	private final double speed = 0.8;
	
	public static final int CHAR_WIDTH = 32;
	public static final int CHAR_HEIGHT = 60;
	private double x;
	private double y;
	private Hitbox feetHitbox;
	private Hitbox bodyHitbox;

	private Sprite img;

	private int spriteStage;
	private int direction; // 0 = down, 1 = left, 2 = up, 3 = right
	private boolean movingDown;
	private boolean movingLeft;
	private boolean movingUp;
	private boolean movingRight;

	public Character(int x, int y) {
		this.x = x;
		this.y = y;
		feetHitbox = new Hitbox(x, y + 40, CHAR_WIDTH, CHAR_HEIGHT - 40);
		bodyHitbox = new Hitbox(x, y, CHAR_WIDTH, CHAR_HEIGHT);
		img = new Sprite("Sprites/Character.png");
		direction = 3;
		spriteStage = 0;
	}


	public void move(Tile tiles[][]) {
		
		
			if(movingLeft){
				this.x -= speed;
				direction = 1;
				if (spriteStage >= 1 && spriteStage < 5)
					spriteStage++;
				else
					spriteStage = 1;
			}
			if(movingUp){
				this.y -= speed;
				direction = 2;
				if (spriteStage >= 1 && spriteStage < 5)
					spriteStage++;
				else
					spriteStage = 1;
			}
			if(movingRight){
				this.x += speed;
				direction = 3;
				if (spriteStage >= 1 && spriteStage < 5)
					spriteStage++;
				else
					spriteStage = 1;
			}
			if(movingDown){
				this.y += speed;
				direction = 0;
				if (spriteStage >= 1 && spriteStage < 5)
					spriteStage++;
				else
					spriteStage = 1;
			}
			
			if(!movingUp && !movingRight && !movingLeft && !movingDown)
				spriteStage = 0;
			
			
			//Things to improve:
			// -- Wall collision stuttering
			// -- Ability to walk through walls with backward movement if partly in wall
			// -- Collision box looks a bit off for some reason
			if (checkFeetCollision(tiles)){
				if (movingUp){
				this.y += speed+2;
				}
				if (movingDown){
				this.y -= speed+2;
				}
				if (movingRight){
				this.x -= speed+2;
				}
				if (movingLeft){
				this.x += speed+2;
				}
			}
			
			feetHitbox.setX((int)this.x);
			feetHitbox.setY((int)this.y + 40);
		
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
		return (int)x;
	}

	public int getY() {
		return (int)y;
	}

	public String toString() {
		return "X: " + x + " Y: " + y;
	}

	public void draw(Graphics g) {
		img.draw(g, (int)x, (int)y, CHAR_WIDTH, CHAR_HEIGHT, spriteStage, direction);
	}


	public Hitbox getFeetHitbox() {
		return feetHitbox;
	}

	public void setMovingRight(boolean movingRight) {
		this.movingRight = movingRight;
	}

	public void setMovingUp(boolean movingUp) {
		this.movingUp = movingUp;
	}

	public void setMovingLeft(boolean movingLeft) {
		this.movingLeft = movingLeft;
	}

	public void setMovingDown(boolean movingDown) {
		this.movingDown = movingDown;
	}

}

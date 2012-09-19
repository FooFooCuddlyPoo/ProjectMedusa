package items;

public class Bullet {
	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;
	
	public Bullet(int origX, int origY, int destX, int destY){
		x = origX;
		y = origY;
		
		//double angle = Math.tan()
	}
	
	public void move(){
		this.x += xSpeed;
		this.y += ySpeed;
	}
}

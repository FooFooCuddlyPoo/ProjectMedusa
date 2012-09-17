public class Camera {

	private int x;
	private int y;

	public Camera(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x - ProjectMedusa.SCREEN_WIDTH/2;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y - ProjectMedusa.SCREEN_HEIGHT/2;
	}

	public void setY(int y) {
		this.y = y;
	}

}

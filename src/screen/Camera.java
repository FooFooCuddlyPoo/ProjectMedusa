package screen;
import main.ProjectMedusa;

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

	public int getY() {
		return y - ProjectMedusa.SCREEN_HEIGHT/2;
	}

	public void setCamera(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

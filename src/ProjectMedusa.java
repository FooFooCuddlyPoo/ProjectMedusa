import javax.swing.JFrame;


public class ProjectMedusa extends JFrame {
	public static final int SCREEN_WIDTH  = 1024;
	public static final int SCREEN_HEIGHT = 768;
	
	
	private ScreenPanel sc;
	
	public ProjectMedusa(){
		setTitle("Project Medusa");
		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		sc = new ScreenPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(sc);
		this.setVisible(true);
		while (true){
			sc.repaint();
		}
		
	}
	
	
	public static void main(String[] args){
		new ProjectMedusa();

	}
	
}

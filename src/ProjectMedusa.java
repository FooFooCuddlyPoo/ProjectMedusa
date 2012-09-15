import javax.swing.JFrame;


public class ProjectMedusa extends JFrame {
	
	public ProjectMedusa(){
		setTitle("Project Medusa");
		setSize(1024, 720);
		ScreenPanel sc = new ScreenPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(sc);
		this.setVisible(true);
	}
	
	public static void main(String[] args){
		new ProjectMedusa();
	}
	
}

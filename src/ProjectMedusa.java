import javax.swing.JFrame;


public class ProjectMedusa extends JFrame {
	
	ScreenPanel sc;
	
	public ProjectMedusa(){
		setTitle("Project Medusa");
		setSize(1024, 720);
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

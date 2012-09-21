package main;
import java.awt.Point;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import screen.ScreenPanel;



public class ProjectMedusa extends JFrame {
	public static final int SCREEN_WIDTH  = 1024;
	public static final int SCREEN_HEIGHT = 768;
	
	
	private ScreenPanel sc;
	
	public ProjectMedusa(){
		setTitle("Project Medusa");
		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		sc = new ScreenPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setCursor(this.getToolkit().createCustomCursor(
	            new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB), new Point(0, 0),
	            "null"));
		add(sc);
		this.setVisible(true);
		
		long time = System.currentTimeMillis();
		
		while (true){
			
			if(System.currentTimeMillis() - time > 30){
				sc.repaint();
				time = System.currentTimeMillis();
			}
		}
		
	}
	
	
	public static void main(String[] args){
		new ProjectMedusa();

	}
	
}

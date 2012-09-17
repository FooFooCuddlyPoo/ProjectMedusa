import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;



public class ScreenPanel extends JPanel implements KeyListener, Runnable{


	private Map map;
	private Camera camera;
	private Graphics2D bufferGraphics;
	private long lastTime;
	
	public ScreenPanel(){
		setFocusable(true);
		requestFocusInWindow();
		MListener mlist = new MListener();
		addMouseListener(mlist);
		addMouseMotionListener(mlist);
		this.addKeyListener(this);
		init();
	}
	
	public void init(){
		map = new Map("Levels/testLevel.txt");
		camera = new Camera(map.getChar().getX(), map.getChar().getY());
	}
	
	public void paintComponent(Graphics g){

		requestFocusInWindow();
		Graphics2D g2d = (Graphics2D) g;
		Image offscreen = createImage(getWidth(), getHeight());
		bufferGraphics = (Graphics2D) offscreen.getGraphics();
		bufferGraphics.setColor(Color.white);
		bufferGraphics.fillRect(0, 0, getWidth(), getHeight());

		mainLoop(bufferGraphics);
		g2d.drawImage(offscreen, 0, 0, this);

	}
	
	public void mainLoop(Graphics2D g){
		g.translate(-camera.getX(), -camera.getY());
		map.draw(g);
	}

	
	public void run(){
		while(true){
			super.repaint();
		}
	}
	
	@Override
	public void keyPressed(KeyEvent k) {
		if(k.getKeyCode() == KeyEvent.VK_A)
			map.getChar().move(-3, 0, 1, map.getTiles());
		if(k.getKeyCode() == KeyEvent.VK_W)
			map.getChar().move(0, -3, 2,  map.getTiles());
		if(k.getKeyCode() == KeyEvent.VK_D)
			map.getChar().move(3, 0, 3,  map.getTiles());
		if(k.getKeyCode() == KeyEvent.VK_S){
			map.getChar().move(0, 3, 0,  map.getTiles());}
		
		camera.setX(map.getChar().getX());
		camera.setY(map.getChar().getY());
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	private class MListener implements MouseListener, MouseMotionListener{
		
		@Override
		public void mouseDragged(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

}

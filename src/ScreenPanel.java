import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;


public class ScreenPanel extends JPanel implements KeyListener{

	private Map map;
	private Graphics2D bufferGraphics;
	
	public ScreenPanel(){
		setFocusable(true);
		requestFocusInWindow();
		MListener mlist = new MListener();
		addMouseListener(mlist);
		addMouseMotionListener(mlist);
	}
	
	public void paintComponent(Graphics g){
		requestFocusInWindow();
		Graphics2D g2d = (Graphics2D) g;
		Image offscreen = createImage(getWidth(), getHeight());
		bufferGraphics = (Graphics2D) offscreen.getGraphics();
		bufferGraphics.setColor(Color.white);
		bufferGraphics.fillRect(0, 0, getWidth(), getHeight());
		
		mainLoop();
	}
	
	public void mainLoop(){
		
	}

	
	public void run(){
		while(true){
			repaint();
		}
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
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

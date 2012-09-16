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


@SuppressWarnings("serial")
public class ScreenPanel extends JPanel implements KeyListener{
	
	private static final int FPS  = 30;
	private static final int TICK = 1000/FPS;

	private Map map;
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
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		System.out.println("paintComponenet cakkkled");
		requestFocusInWindow();
		Graphics2D g2d = (Graphics2D) g;
		Image offscreen = createImage(getWidth(), getHeight());
		bufferGraphics = (Graphics2D) offscreen.getGraphics();
		bufferGraphics.setColor(Color.white);
		bufferGraphics.fillRect(0, 0, getWidth(), getHeight());
		
		g2d.drawImage(offscreen, 0, 0, this);
		gameDraw(g);
		
	}
	
	public void gameDraw(Graphics g){
		System.out.println("drawing method called called");
		map.draw(g);
	}

	
	public void run(){
		while (true){
			long current = System.currentTimeMillis();
			if (current - lastTime > TICK) {
				repaint();
				lastTime = current;
			}
			
		}
	}
	
	@Override
	public void keyPressed(KeyEvent k) {
		System.out.println("KeyPressed event: "+k);
		if(k.getKeyCode() == KeyEvent.VK_A)
			map.getChar().move(-3, 0);
		else if(k.getKeyCode() == KeyEvent.VK_W)
			map.getChar().move(0, -3);
		else if(k.getKeyCode() == KeyEvent.VK_D)
			map.getChar().move(3, 0);
		else if(k.getKeyCode() == KeyEvent.VK_S)
			map.getChar().move(0, 3);
		
		map.draw(bufferGraphics);
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

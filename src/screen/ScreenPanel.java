package screen;
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

import map.Map;




@SuppressWarnings("serial")
public class ScreenPanel extends JPanel implements KeyListener{


	private Map map;
	private Camera camera;
	private Cursor cursor;
	private int mouseX;
	private int mouseY;
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
		camera = new Camera(map.getChar().getX() + (map.getChar().CHAR_WIDTH/2), map.getChar().getY() + (map.getChar().CHAR_HEIGHT/2));
		cursor = new Cursor(512, 384);
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
		update();
		g.translate(-camera.getX(), -camera.getY());
		map.draw(g);
		g.translate(camera.getX(), camera.getY());
		cursor.draw(g);
	}

	public void update(){
		map.getChar().move(map.getTiles());
		camera.setCamera(map.getChar().getX() + (map.getChar().CHAR_WIDTH/2), map.getChar().getY() + (map.getChar().CHAR_HEIGHT));
		cursor.setCur(mouseX, mouseY);
	}
	
	@Override
	public void keyPressed(KeyEvent k) {
		if(k.getKeyCode() == KeyEvent.VK_A)
			map.getChar().setMovingLeft(true);
		if(k.getKeyCode() == KeyEvent.VK_W)
			map.getChar().setMovingUp(true);
		if(k.getKeyCode() == KeyEvent.VK_D)
			map.getChar().setMovingRight(true);
		if(k.getKeyCode() == KeyEvent.VK_S)
			map.getChar().setMovingDown(true);
		
		if(k.getKeyCode() == KeyEvent.VK_ESCAPE)
			System.exit(0);
	}

	@Override
	public void keyReleased(KeyEvent k) {
		if(k.getKeyCode() == KeyEvent.VK_A)
			map.getChar().setMovingLeft(false);
		if(k.getKeyCode() == KeyEvent.VK_W)
			map.getChar().setMovingUp(false);
		if(k.getKeyCode() == KeyEvent.VK_D)
			map.getChar().setMovingRight(false);
		if(k.getKeyCode() == KeyEvent.VK_S)
			map.getChar().setMovingDown(false);
		
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
		public void mouseMoved(MouseEvent m) {
			mouseX = m.getX();
			mouseY = m.getY();
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

package items;

import java.awt.Graphics;

public interface Item {
    
	String type = null;
	
    public void draw(Graphics g, int x, int y, int width, int height);

	public Object returnName();
}
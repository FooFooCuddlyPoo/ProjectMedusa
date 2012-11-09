package items;

import java.awt.Graphics;

public interface Item {
	
	int drawSize = 100;
	
	void draw( int x, int y, Graphics g);
		
	String returnName ();
		
}

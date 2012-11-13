package items;

import java.awt.Graphics;

import characters.Image;

public class Health implements Item {
	
	String type;
	Image img;
	
	public Health (String foodType){
		type = foodType;		
		img = new Image("Sprites/" + type + ".png");
	}

	public void setType(String type) {
		this.type = type;
	}

	public String returnName(){
		return type;
	}

	@Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        img.draw(g, x, y, width, height, 0, 0);
        
    }
	
}
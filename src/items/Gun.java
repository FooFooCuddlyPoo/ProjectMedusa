package items;

import java.awt.Graphics;

import characters.Sprite;

public class Gun implements Item {

	String type;
	Sprite img;
	
	public Gun( String gunType){
		type = gunType;		
		img = new Sprite("Sprites/" + type + ".png");
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

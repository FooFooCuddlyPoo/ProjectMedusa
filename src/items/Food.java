package items;

import java.awt.Graphics;

import characters.Sprite;

public class Food implements Item {
	
	String type;
	Sprite img;
	
	public Food(String foodType){
		type = foodType;		
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

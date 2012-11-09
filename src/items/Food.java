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

	public void draw (int x, int y, Graphics g){
		img.draw(g, x, y, Item.drawSize, Item.drawSize, 0, 0);
	}
	
}

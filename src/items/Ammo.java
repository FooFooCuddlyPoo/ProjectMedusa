package items;

import java.awt.Graphics;

import characters.Sprite;

public class Ammo implements Item {

	int quantity;
	String type;
	Sprite img;
	
	public Ammo( int amount, String ammoType){
		quantity = amount;
		type = ammoType;		
		img = new Sprite("Sprites/" + type + "Ammo.png");
	}
	
	public int getLevel() {
		return quantity;
	}

	public void setLevel(int level) {
		this.quantity = level;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String returnName(){
		return type;
	}
	
	public void use(){
		setLevel(this.quantity - 1);
	}

    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        img.draw(g, x, y, width, height, 0, 0);
        
    }
	
}

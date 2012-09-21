package screen;

import java.awt.Graphics;

import characters.Sprite;

public class Hud {
	private int health;
	private int hunger;
	private int stamina;
	
	private Sprite bg;
	private Sprite img;
	
	public Hud(int health, int hunger, int stamina){
		setStats(health, hunger, stamina);
		bg = new Sprite("Sprites/LifebarBackground.png");
		img = new Sprite("Sprites/Lifebar.png");
	}
	
	public void draw(Graphics g){
		bg.draw(g, 0, 0, 300, 104, 0, 0);
		//draw rectangles here for health etc
		img.draw(g, 0, 0, 300, 104, 0, 0);
	}

	public void setStats(int health, int hunger, int stamina) {
		this.health = health;
		this.hunger = hunger;
		this.stamina = stamina;
	}
}

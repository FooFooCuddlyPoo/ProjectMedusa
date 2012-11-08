package screen;

import java.awt.Color;
import java.awt.Graphics;

import characters.Sprite;

public class Hud {
	private double health;
	private double hunger;
	private double stamina;
	
	private Sprite bg;
	private Sprite img;
	
	private final int healthBarWidth = 198;
	
	public Hud(int health, int hunger, int stamina){
		setStats(health, hunger, stamina);
		bg = new Sprite("Sprites/LifebarBackground.png");
		img = new Sprite("Sprites/Lifebar.png");
	}
	
	public void draw(Graphics g){
		bg.draw(g, 0, 0, 300, 104, 0, 0);
		g.setColor(Color.red);
		g.fillRect(97, 42, (int)(healthBarWidth*(health/100.0)), 19);
		img.draw(g, 0, 0, 300, 104, 0, 0);
	}

	public void setStats(int health, int hunger, int stamina) {
		this.health = health;
		this.hunger = hunger;
		this.stamina = stamina;
	}
}

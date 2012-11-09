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
	private final int smallBarWidth = 161;
	
	public Hud(int health, int hunger, int stamina){
		setStats(health, hunger, stamina);
		bg = new Sprite("Sprites/LifebarBackground.png");
		img = new Sprite("Sprites/Lifebar.png");
	}
	
	public void draw(Graphics g){
		bg.draw(g, 0, 0, 300, 104, 0, 0);
		g.setColor(Color.red);
		g.fillRect(97, 42, (int)(healthBarWidth*(health/100.0)), 19);
		g.setColor(Color.green);
		g.fillRect(79, 76, (int)(smallBarWidth*(stamina/100.0)), 13);
		g.setColor(Color.yellow);
		g.fillRect(79, 13, (int)(smallBarWidth*(hunger/100.0)), 13);
		img.draw(g, 0, 0, 300, 104, 0, 0);
	}

	public void setStats(int health, int hunger, int stamina) {
		this.health = health;
		this.hunger = hunger;
		this.stamina = stamina;
	}
}

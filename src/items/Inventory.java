package items;

import java.awt.Graphics;

import characters.Image;

import main.ProjectMedusa;
import map.Tile;

public class Inventory {

	private boolean open;
	private Item[][] inventory;
	private static final int width = 4;
	private static final int height = 3;

	private static final int area = 100;
	private static final int startX = 100;
	private static final int startY = 100;
	
	private Image img;

	private int count;

	public Inventory() {
		open = false;
		inventory = new Item[height][width];
		count = 0;
		img = new Image("Sprites/inventory.png");
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public boolean add(Item input) {
		if (isFull())
			return false;
		if (input == null)
			return false;
		for (int h = 0; h < height; h++) {
			for (int w = 0; w < width; w++) {
				if (inventory[h][w] == null) {
					inventory[h][w] = input;
					return true;
				}
			}
		}
		return false;
	}

	public Item remove(int x, int y) {
		if (inventory[x][y] == null)
			return null;
		Item temp = inventory[x][y];
		inventory[x][y] = null;
		count--;
		return temp;
	}
	
	public boolean contains(String search){
		for (int f = 0; f < width; f++){
			for (int k = 0; k < height; k++){
				if (inventory[f][k].returnName().equals(search)){
					return true;
				}
			}
		}
		return false;
	}
	
	public Item returnItem(String search){
		for (int f = 0; f < width; f++){
			for (int k = 0; k < height; k++){
				if (inventory[f][k].returnName().equals(search)){
					return inventory[f][k];
				}
			}
		}
		return null;
	}

	private boolean isFull() {
		if (count == 12) {
			return true;
		}
		return false;
	}

	public void draw(Graphics g) {
	    img.draw(g, ProjectMedusa.SCREEN_WIDTH/2, 0, ProjectMedusa.SCREEN_WIDTH/2, ProjectMedusa.SCREEN_HEIGHT, 0, 0);
		for (int h = 0; h < height; h++) {
			for (int w = 0; w < width; w++) {
				if (inventory[h][w] != null) {
					inventory[h][w].draw(g, w, h, area, area);
				}
			}
		}
	}

}

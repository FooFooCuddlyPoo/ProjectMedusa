import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Map {
	private Tile[][] tiles;
	private String file;
	
	private int width;
	private int height;
	
	private Character character;
	
	public Map(String filename){
		file = filename;
		readMap();
	}
	
	public void readMap(){
		try {
			Scanner scan = new Scanner(new File(file));
			width = scan.nextInt();
			height = scan.nextInt();
			
			tiles = new Tile[height][width];
			
			int temp;
			
			for(int h = 0; h < height; h++){
				for(int w = 0; w < width; w++){
					temp = scan.nextInt();
					
					if(temp == 2){
						tiles[h][w] = new Floor(w*Tile.TILE_WIDTH, h*Tile.TILE_HEIGHT);
						character   = new Character(w*Tile.TILE_WIDTH, h*Tile.TILE_HEIGHT);
					}
					else{
						tiles[h][w] = getTileType(temp, w, h);
					}
				}
			}
			
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public void draw(Graphics g){
		for(int h = 0; h < tiles.length; h++){
			for(int w = 0; w < tiles[0].length; w++){
				if(tiles[h][w] != null)
					tiles[h][w].draw(g);
			}
		}
		
		if(character != null)
			character.draw(g);
	}
	
	private Tile getTileType(int num, int x, int y) {
		if(num == 1)
			return new Wall(x*Tile.TILE_WIDTH, y*Tile.TILE_HEIGHT);
		else if(num == 0)
			return new Floor(x*Tile.TILE_WIDTH, y*Tile.TILE_HEIGHT);
		else
			return null;
	}

	public Tile[][] getTiles() {
		return tiles;
	}
	
	public void setTiles(Tile[][] tiles) {
		this.tiles = tiles;
	}

	public Character getChar() {
		return character;
	}

	public void setChar(Character character) {
		this.character = character;
	}
}

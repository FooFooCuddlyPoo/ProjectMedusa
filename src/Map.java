import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Map {
	private Tile[][] tiles;
	private String file;
	
	private int width;
	private int height;
	
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
			
			for(int h = 0; h < height; h++){
				for(int w = 0; w < width; w++){
					tiles[h][w] = getTileType(scan.nextInt(), w, h);
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
	}
	
	private Tile getTileType(int num, int x, int y) {
		if(num == 1)
			return new Block(x*Tile.TILE_WIDTH, y*Tile.TILE_HEIGHT);
		else
			return null;
	}

	public Tile[][] getTiles() {
		return tiles;
	}
	
	public void setTiles(Tile[][] tiles) {
		this.tiles = tiles;
	}
}

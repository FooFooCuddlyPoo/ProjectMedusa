import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Map {
	private Tile[][] tiles;
	private String file;
	
	private int width;
	private int height;
	
	public Map(){
		
	}
	
	public void readMap(){
		try {
			Scanner scan = new Scanner(new File(file));
			width = scan.nextInt();
			height = scan.nextInt();
			
			for(int h = 0; h < height; h++){
				for(int w = 0; w < width; w++){
					tiles[h][w] = getTileType(scan.nextInt(), w, h);
				}
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
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

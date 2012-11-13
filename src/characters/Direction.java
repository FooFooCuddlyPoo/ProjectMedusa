package characters;

public enum Direction {
    DOWN(0),
    LEFT(1),
    UP(2),
    RIGHT(3);
    
    private int value;
    
    private Direction(int n){value = n;}
    
    public int value(){return value;}
}

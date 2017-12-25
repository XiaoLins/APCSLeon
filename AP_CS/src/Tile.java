public class Tile {

    private char letter;
    private int value;

    public Tile(char letter, int value){
        this.letter = letter;
        this.value = value;
    }

    public void printTile (){
        System.out.println("This tile \"" + this.letter + "\" is with a value of " + this.value);
    }

    public void testTile (){
        Tile Z = new Tile('Z', 10);
        Z.printTile();
    }

    public String toString() {
        return String.format("This tile \"%s\" is with a value of %d",letter+"",value);
    }

    public boolean equals(Tile that){
        return this.letter == that.letter && this.value == that.value;
    }

    public char getLetter (){
        return this.letter;
    }

    public int getValue (){
        return this.value;
    }
}

public class Card {

    //Declaring the instance variables
    private final int rank;
    private final int suit;
    //Mapping for suits: Clubs = 0, Diamonds = 1, Hearts = 2, Spades = 3;
    //Mapping for ranks: Ace = 1, Jack = 11, Queen = 12, King = 13;
    //We declare rank and suit as int to compare cards which has a higher rank or suit.

    public static final String[] ranks = {null,"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
    public static final String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
    //In this class, RANKS and SUITS are mostly used in the toString method.
    //Having them defined as class variables, we need not to create and
    //garbage-collect them every time when toString is invoked.

    //Value constructor
    public Card (int rank, int suit){
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {
        return String.format("%s of %s\n",ranks[this.rank],suits[this.suit]);
    }

    public boolean equals(Card that){
        return this.rank == that.rank && this.suit == that.suit;
    }

    public int compareTo (Card that){
        if (this.suit == that.suit){
            if (this.rank == that.rank){
                return 0;
            } else if (this.rank < that.rank){
                return -1;
            } else if (this.rank > that.rank){
                return 1;
            }
        } else if (this.suit < that.suit){
            return -1;
        } else if (this.suit > that.suit){
            return 1;
        }
        return 0;
    }

    public int compareToModified (Card that){
        if (this.suit == that.suit){
            if (this.rank == that.rank){
                return 0;
            } else if (this.rank == 1){
                return 1;
            } else if (that.rank == 1){
                return -1;
            } else if (this.rank < that.rank){
                return -1;
            } else if (this.rank > that.rank){
                return 1;
            }
        }
        else if (this.suit < that.suit){
            return -1;
        } else if (this.suit > that.suit){
            return 1;
        }
        return 0;
    }

    public int getRank() {
        return this.rank;
    }

    public int getSuit(){
        return this.suit;
    }
}

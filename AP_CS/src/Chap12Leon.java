/*
Chap 12 Arrays of objects
Card.java
 */

import java.io.PrintStream;

public class Chap12Leon {
    public static void main(String[] args){
        PrintStream out = System.out;

        out.println("12.1, 12.2, 12.4 Creating the Card class");

        //Create card objects: Ace of Hearts and 2 of Diamonds
        Card aceHearts = new Card(1,2);
        Card twoDiamonds = new Card(2,1);

        //Create the toString method using arrays for Card class so that the result of
        //System.out.println(aceHearts);
        //is Ace of Hearts and the result of
        //System.out.println(twoDiamonds);
        //is 2 of Diamonds.
        out.println(aceHearts);
        out.println(twoDiamonds);

        //Create the equals method.
        out.println(aceHearts.equals(twoDiamonds));

        //Create the compareTo method.
        //Comparison of suits comes first: Clubs<Diamonds<Hearts<Spades.
        out.println(aceHearts.compareTo(twoDiamonds));

        //Create the getters.
        out.println(aceHearts.getRank());
        out.println(aceHearts.getSuit());
        out.println();
    }
}

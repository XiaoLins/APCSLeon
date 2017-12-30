/*
Chap 12 Arrays of objects
Card.java
 */

import java.io.PrintStream;
import java.util.Arrays;
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

        out.println("12.3 Class variables");
        //Class variables are defined in a class, before the method definitions.
        //They are public (we can access them by calling Card.RANKS),
        //static (shared across all instances of the class ),
        //and final (can not be reassigned).
        //Declare class variables String[] RANKS and String[] SUITS after the instance variables
        //of the Card class.
        out.println();

        out.println("12.5 final instance variables");
        //We do not want to modify any existing card, so we make the Card class immutable.
        //Declare the instance variables final, so that no other programmers could
        //add a modifier later. Once the instance variables of an instance objects is
        //assigned, they can never be reassigned.
        out.println();

        out.println("12.6 Array of objects");
        Card[] cards = new Card[52];
        //Creation of references to 52 Card objects, not creation of 52 Card objects.
        //The elements are initialized to null.
        //Write a method anyCard(Card[] cards) to check if all elements of cards are
        //null.
        out.println(anyCard(cards));

        //Now we populate the array.
        int i = 0;
        for (int suit = 0 ; suit <= 3 ; suit++){
            for (int rank = 1; rank <= 13; rank++){
                cards[i] = new Card(rank, suit);
                i++;
            }
        }
        //Display the 52-card deck.
        printDeck(cards);
        out.println();

        out.println("12.7 - 12.10 Binary search");
        //Write a search(Card[] cards, Card target) method to search for an object
        //in the array of objects.
        out.println(search(cards, twoDiamonds));

        /*
        If the cards are in order, we can use a better algorithm: Binary search.
        1. Choose an index between low and high and call it mid. Compare the card
        at mid to the target.
        2. If they are equal, return the index.
        3. If the card at mid is lower than the target, search the range from
        mid + 1 to high.
        4. If the card at mid is higher than the target, search the range from
        low to mid - 1.
        Write the biSearch(Card[] cards, Card target) method.
         */

        out.println(biSearchIterative(cards, cards[9]));
        out.println(biSearchRecursive(cards, cards[4]));

        out.println("Exercise 12.1");
        Arrays.toString(makeDeck());

        out.println("Exercise 12.2");
        out.println(cards[0].compareTo(cards[12]));

        out.println("Exercise 12.3");
        out.println(Arrays.toString(suitHist(cards)));
        out.println(hasFlush(cards));
    }

    public static boolean hasFlush (Card[] cards){
        int[] histogram = suitHist(cards);
        for (int i = 0 ; i < histogram.length ; i++){
            if (histogram[i] >= 5){
                return true;
            }
        }
        return false;
    }


    public static int[] suitHist (Card[] cards){
        int[] histogram = new int[4];
        for (int i = 0 ; i < cards.length ; i++){
            histogram[cards[i].getSuit()]++;
        }
        return histogram;
    }


    public static Card[] makeDeck (){
        int i = 0;
        Card[] cards = new Card[52];
        for (int suit = 0; suit < 4; suit++){
            for (int rank = 1; rank < 14; rank++){
                cards[i] = new Card(rank,suit);
                i++;
            }
        }
        return cards;
    }


    public static int biSearchRecursive(Card[] cards, Card target){
        int low = 0;
        int high = cards.length - 1;
        if (low <= high){
            int mid = (high + low) / 2;
            int diff = cards[mid].compareTo(target);
            if (diff == 0){
                return mid;
            } else if (diff < 0){
                Card[] dividedCards = Arrays.copyOfRange(cards, mid + 1, high);
                int indexRecursive = biSearchRecursive(dividedCards,target);
                for (int i = 0 ; i < cards.length ; i++){
                    if (dividedCards[indexRecursive].equals(cards[i])){
                        return i;
                    }
                }
            } else if (diff > 0) {
                Card[] dividedCards = Arrays.copyOfRange(cards, low, mid - 1);
                int indexRecursive = biSearchRecursive(dividedCards, target);
                for (int i = 0; i < cards.length; i++) {
                    if (dividedCards[indexRecursive].equals(cards[i])){
                        return i;
                    }
                }
            }
        }
        return -1;
    }


    public static int biSearchIterative(Card[] cards, Card target){
        int low = 0;
        int high = cards.length - 1;
        while (low <= high){
            int mid = (high + low) / 2;
            int diff = cards[mid].compareTo(target);
            if (diff == 0){
                return mid;
            } else if (diff < 0){
                low = mid + 1;
            } else if (diff > 0){
                high = mid - 1;
            }
        }
        return -1;


//        else if (cards[mid].compareTo(target) == 1){
//            //mid is bigger than target
//            biSearch(Arrays.copyOfRange(cards,low,mid),target);
//        } else if (cards[mid].compareTo(target) == -1){
//            //mid is smaller than target
//            biSearch(Arrays.copyOfRange(cards,mid,high),target);
//        }
//        return -1;
    }


    public static boolean anyCard(Card[] cards){
        for (int i = 0; i < cards.length ; i++){
            if (!(cards[i] == null)){
                return false;
            }
        }
        return true;
    }

    public static void printDeck(Card[] cards){
        for (int i = 0; i < cards.length ; i++){
            System.out.print(cards[i]);
        }
    }

    public static int search(Card[] cards, Card target){
        for (int i = 0 ; i < cards.length ; i++){
            if (cards[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
}

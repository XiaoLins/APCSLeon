/*
* Chap09 char and String
*/
import java.io.PrintStream;
import java.util.*;
//We may import java.util.Scanner, java.util.Arrays and java.util.Random
public class Chap09Leon {
	private static Scanner in;
	public static void main (String[] args) {
		PrintStream out = System.out;
		String fruit, name, rename, upperName;
		char letter;
		int n, length, index, diff, hour, minute;
		in = new Scanner(System.in);
		
		out.println("9.1 Characters");
		//Java provides 8 primitive data types for representing integers, real number,
		//characters, and Boolean values:
		//bype, short, int, long, float, double, char, boolean.
		//An object is a collection of data that provides a set of methods.
		//String is an object.
		fruit = "banana";
		letter = fruit.charAt(0);
		out.println(letter);
		out.println(letter == 'a');
		letter = fruit.charAt(5);
		out.println(letter);
		out.println(letter == 'a');
		out.println('\'');
		
		//The increment and decrement operators work with characters.
		//In Unicode, each character is represented by a code unit.
		//The code units for uppercase Latin letters run from 65 to 90.
		//The code units for lowercase Latin letters run from 97 to 122.
		out.println("Roman alphabet: ");
		for (letter = 'A'; letter <= 'z'; letter++) {
			out.print(letter);
		}
		out.print("\n");
		
		//The code units for uppercase Greek letters run from 913 to 937.
		//The code units for lowercase Greek letters run from 945 to 969.
		out.println("Greek alphabet: ");
		for (n = 913; n <= 969; n++) {
			out.print((char)n);
		}
		out.print("\n");
		out.println();
		
		out.println("9.2 Strings are immutable");
		//If once created, an object cannot be modified, the object is immutable.
		//STrings are immutable by design.
		name = "Alan Turing";
		upperName = name.toUpperCase();
		//toUpperCase and toLowerCase methods create new strings. They do not change
		//the string "Alan Turing"
		out.println(upperName);
		out.println(name);
		
		name = name.replace("Turing", "Dubos");
		out.println(name);
		//We assigned a new string "Alan Dubos" to name, replacing the old string
		//"Alan Turing".
		out.println();
		
		out.println("9.3 String traversal");
		for (n = 0; n < fruit.length(); n++) {
			letter = fruit.charAt(n);
			out.println(letter);
		}
		//Strings provide the length method that returns the number of 
		//characters in the String.
		length = fruit.length();
		out.print("The last letter of the word \" banana \" is : ");
		out.println(fruit.charAt(length - 1));
		out.println();
		
		out.print("Please type your name: ");
		name = in.nextLine();
		rename = reverse(name);
		out.println("The reverse of your name is: " + rename);
		out.println();
		
		out.println("9.4 Substrings");
		//The substring method returns a new String that copies letters from an
		//existing string, starting at the given index.
		out.println(fruit.substring(0));
		out.println(fruit.substring(6));
		//Starting at the first given index and stopping before the second.
		out.println(fruit.substring(0, 3));
		out.println(fruit.substring(5, 5));
		out.println(fruit.substring(5, 6));
		out.println(fruit.substring(6, 6));
		//out.println(fruit.substring(5, 7));
		out.println();
		
		out.println("9.5 The indexOf method");
		out.println("In the String \"banana\",");
		index = fruit.indexOf('a');
		//It returns the index of the first appearance.
		out.println(index);
		
		index = fruit.indexOf('a', 2);
		out.println(index);
		//Starting at index 2 and finds the next 'a', which is at index 3.
		
		index = fruit.indexOf('x');
		out.println(index);
		//If the character does not appear in the String, indexOf returns -1.
		
		index = fruit.indexOf("nan");
		out.println(index);
		
		out.println("9.6 String comparison");
		//The == operator checks whether two variables refer to the same object.
		//If you give it two different strings that contain the same letters,
		//it yields false.
		String name1 = new String ("Alan Turing");
		String name2 = new String ("Alan Turing");
		if (name1 == name2) {
			out.println("The names are the same");
		} else {
			out.println("The names are different");
		}
		
		//The equals method returns true if the strings contain the same characters.
		if (name1.equals(name2)) {
			out.println("The names are the same");
		} else {
			out.println("The names are different.");
		}
		
		name = "Alan Turing";
		out.println("Hello, my name is Alan Turing. What's your name, please?");
		rename = in.nextLine();
		
		diff = name.compareTo(rename);
		if (diff == 0) {
			out.println("Our names are the same.");
		} else {
			if (diff < 0) {
				out.println("My name comes before yours.");
			} else {
				out.println("My name comes after yours.");
			}
		}
		
		//If the first string comes first in the alphabet, the difference is negative.
		//If the strings are equal, their different is zero.
		
		out.println("9.7 String formatting");
		//With the inputs hour = 19, minute = 5, we want the method returns
		//07 : 05 PM
		out.print("Please type the hour: ");
		hour = in.nextInt();
		out.print("and the minute: ");
		minute = in.nextInt();
		out.print("The time is ");
		out.println(time(hour, minute));
		out.println();
		
		out.println("9.8 Wrapper classes");
		//Primitive data types do not provide methods. But for each primitive type, there is a
		//corresponding class in the Java library, called a wrapper class.
		//int has Integer. boolean has Boolean. long has Long. double has Double.
		//Wrapper classes provide methods for converting strings to other types.
		
		out.println(Integer.parseInt("12345"));
		out.println(Boolean.parseBoolean("True"));
		out.println(Boolean.parseBoolean("true"));
		out.println(Boolean.parseBoolean("TRUE"));
		out.println(Boolean.parseBoolean("1"));
		out.println();
		
		//They also provide toString, which returns a string representation of a value.
		out.println(Integer.toString(12345));
		out.println(Boolean.toString(true));
		out.println();
		
		out.println("9.9 Command-line arguments");

		out.println("Exercise 9.1");
		out.println('a' + 2.0);
        /*
        1.
        It outputs "test!"
        Its type is String
        Since type char can only contain one character, the type of the output must be String.
        2. (For the following table. 1 means yes and 0 means no.)
                   boolean     char    int     double      String
         boolean    0           0       0       0           1
         char       0           1       1       1           1
         int        0           1       1       1           1
         double     0           1       1       1           1
         String     1           1       1       1           1
         3.
         Booleans cannot be added by booleans seems there was no other choices.
         char + char
         char + double
         4.
         After char++, the char value doesn't change.
         After char = char + 1, exception occurred which says incompatible type : there might be loss converting char to int
         5.
         The entire output becomes a String
         6.
         boolean: boolean only
         char: char,int
         int: char,int
         double: char,int,double
         String: String
         */

        out.println("Exercise 9.2");
        out.println(Arrays.toString(letterHist("ABCDEFGZZZ")));

        out.println("Exercise 9.3");
        String s = "((3 + 7) * 2)";
        out.println(countParentheses(s));
        out.println(countParentheses("((())"));

        out.println("Exercise 9.4");
        //See file Recurse.java

        out.println("Exercise 9.5");
        out.println(isAbecedarian("ABCEFA"));
        out.println(isAbecedarian("ABDEST"));

        out.println("Exercise 9.6");
        out.println(isDoubloon("Caucasus"));
        out.println(isDoubloon("TestWord"));

        out.println("Exercise 9.7");
        out.println(isAnagram("stop","pots"));

        out.println("Exercise 9.8");
        out.println(canSpell("quijibo","jib"));
	}

	public static boolean canSpell (String s1, String s2){
	    final char LOWERCASE_A = 97;
	    String it1 = s1.toLowerCase();
	    String it2 = s2.toLowerCase();
	    int[] piles = new int[26];
	    int[] word = new int[26];
	    for (int i = 0 ; i < it1.length(); i ++){
	        piles[it1.charAt(i)-LOWERCASE_A]++;
        }
        for (int i = 0 ; i < it2.length(); i++){
	        word[it2.charAt(i)-LOWERCASE_A]++;
        }
        for (int i = 0 ; i < 26; i++){
	        if (word[i] > piles[i]){
	            return false;
            }
        }
        return true;
    }


	public static boolean isAnagram (String s1, String s2){
	    if (s1.length() != s2.length()){
	        return false;
        }
	    String it1 = s1.toLowerCase();
	    String it2 = s2.toLowerCase();
	    int range1 = 0;
	    int range2 = 0;
	    for (int i = 0; i < s1.length(); i++){
	        if (s1.charAt(i) > range1){
	            range1 = s1.charAt(i);
            }
        }
        for (int i = 0; i < s2.length(); i++){
            if (s2.charAt(i) > range2){
                range2 = s2.charAt(i);
            }
        }
        if (range1 != range2){
	        return false;
        }
        int[] char1 = new int[range1];
	    int[] char2 = new int[range2];
	    for (int i = 0; i < it1.length(); i++){
	        char1[it1.charAt(i)-1]++;
	        char2[it2.charAt(i)-1]++;
        }
        for (int i = 0; i < char1.length; i++){
	        if (char1[i] != char2[i]){
	            return false;
            }
        }
        return true;
    }


	public static boolean isDoubloon (String s){
	    final char LOWERCASE_A = 97;
	    int[] t = new int[26];
	    String it = s.toLowerCase();
	    for (int i = 0 ; i < it.length() ; i++){
	        t[it.charAt(i)-LOWERCASE_A]++;
        }
        for (int i = 0 ; i < 26 ; i++){
	        if (t[i] != 2 && t[i] != 0){
	            return false;
            }
        }
        return true;
    }

    public static boolean isAbecedarian (String s){
        String it = s.toLowerCase();
        boolean result;
        if (it.length() <= 1){
            return true;
        } else if (it.charAt(1) > it.charAt(0)){
            result = isAbecedarian(it.substring(1));
        } else {
            return false;
        }
        return result;
    }

//    public static boolean isAbecedarian (String s){
//        String it = s.toLowerCase();
//        char currentLetter = 0;
//        for (int i = 0; i < s.length(); i++){
//            if (it.charAt(i) > currentLetter){
//                currentLetter = it.charAt(i);
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }

	public static boolean countParentheses (String s){
	    int countOpen = 0;
	    int countClose = 0;
	    char c;
	    for (int i = 0; i < s.length(); i++){
	        c = s.charAt(i);
	        if (c == '('){
	            countOpen++;
            } else if (c == ')' ){
	            countClose++;
            }
        }
        return countClose == countOpen;
    }

//  First edition
//	public static int countParentheses (String s){
//	    int count = 0;
//	    for(int i = 0; i < s.length(); i++){
//	        char c = s.charAt(i);
//	        if (c == '('){
//	            count++;
//            } else if (c == ')') {
//	            count--;
//            }
//        }
//        return count;
//    }


	public static int[] letterHist (String s){
	    final char LOWERCASE_A = 97;
	    int[] result = new int[26];
	    String s2 = s.toLowerCase();
	    for (int i = 0; i < s2.length(); i++){
	        result[s2.charAt(i)-LOWERCASE_A]++;
        }
        return result;
    }


	public static String time (int hour, int minute) {
		String ampm;
		if (hour < 12) {
			ampm = "AM";
			if (hour == 0) {
				hour = 12;
			}
		} else {
			ampm = "PM";
			hour = hour - 12;
		}
		return String.format("%02d:%02d %s", hour, minute, ampm);
		//String.format creates a new string, but does not display anything.
	}
	
	
	public static String reverse(String name) {
		String result = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			result += name.charAt(i);
		}
		return result;
	}
}

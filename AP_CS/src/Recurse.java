import java.io.PrintStream;

public class Recurse {
    private static String s;

    /**
     * Returns the first character of the given String.
     */
    public static char first (String s){
        return s.charAt(0);
    }

    /**
     * Returns all but the first letter of the given String.
     */
    public static String rest (String s){
        return s.substring(1);
    }

    /**
     * Returns all but the first and last letter of the String.
     */
    public static String middle (String s){
        return s.substring(1,s.length()-1);
    }

    /**
     * Returns the length of the given String.
     */
    public static int length (String s){
        return s.length();
    }

    public static void main(String[] args){
        String s = "abcde";
        PrintStream out = new PrintStream(System.out);
        out.println(first(s));
        out.println(rest(s));
        out.println(middle(s));
        out.println(length(s));
        printString(s);
        out.println();
        printBackward(s);
        String backwards = reverseString("coffee");
        out.println(backwards);
        out.println(isPalindrome("oloolo"));

    }

    public static boolean isAbecedarian (String s){
        String it = s.toLowerCase();
        boolean result = false;
        if (length(it) <= 1){
            return true;
        } else if (first(rest(it)) > first(it)){
            result = isAbecedarian(rest(it));
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


    public static boolean isPalindrome (String s) {
        if (length(s) <= 1) {
            return true;
        } else if (first(s) == rest(s).charAt(length(s)-2)){
            isPalindrome(middle(s));
        } else {
            return false;
        }
        return true;
    }


    public static String reverseString (String s){
        String result = "";
        if (length(s) != 1){
            result += reverseString(rest(s));
        }
        return result + first(s);
    }


    public static void printBackward (String s){
        if (length(s) != 1){
            printBackward(rest(s));
        }
        System.out.println(first(s));
    }


    public static void printString (String s){
        if (length(s) > 0){
            System.out.println(first(s));
            printString(rest(s));
        }
    }
}

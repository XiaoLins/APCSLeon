import java.io.PrintStream;

public class Test {
    public static void main(String[] args){
        PrintStream out = new PrintStream(System.out);
        String test = "test";
        char charTest = 'a';
        out.println(test + '!');
        out.println(charTest++);
        out.println();
        /*
        It outputs "test!"
        Its type is String
        Since type char can only contain one character, the type of the output must be String
         */
    }
}

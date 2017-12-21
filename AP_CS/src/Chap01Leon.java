
public class Chap01Leon {
	public static void main(String[] args) {
		
		// 1.4
		System.out.println("1.4 Class, Method, statement and comment");
		System.out.println("Hello, World!"); //This line is a print statement.
		
		System.out.println();
		
		// 1.5
		System.out.print("1.5 \"print\" versus \"println\",");
		System.out.println("and the escape sequence \"\\\",\"\\\\\""); // "\" Test
		
		System.out.print("Hello, ");
		System.out.println("World!"); // Distinguish difference between "print" and "println"
		
		System.out.println("This example also shows the escape sequence \"\\\"\"");
		
		System.out.println("");
		
		// 1.6.1
		System.out.println("1.6.1 The escape sequence \"\\n\"");
		//It is \, not /
		System.out.println("(1) Hello,\nWorld!");
		System.out.println("(2) Hello,/nWorld! This is wrong. ");
		System.out.println("");
		
		// 1.6.2
		System.out.println("1.6.2 The escape sequence: \"\\t\"");
		System.out.println("Hello, \tWorld!");
		System.out.println("Hello, \n\tWorld!");
		System.out.println("(1)Hello, \tWorld!");
		System.out.println("(2)Hello, \n\tWorld!");
	}
}

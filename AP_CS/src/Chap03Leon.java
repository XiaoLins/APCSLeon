import java.util.Scanner;
import java.util.Random;
//Import statement cannot be inside a class definition
public class Chap03Leon {
	private static Scanner in;
	public static void main(String[] args) {
		String line,name;
		double inch,cm,inchDouble,quotient,remainderDouble;
		int age,inchInt,remainderInt;
		final double CM_PER_INCH = 2.54;	
		in = new Scanner(System.in);
		//By convention, all variables and constants are declared at the top of main.
		
		System.out.println("3.1 The System class");
		System.out.println(System.out);
		//The result indicates that System.out is a PrintStream
		//ThinkJava says that out is a "special value" provided by the System class
		//System is a class defined in the java.lang Package
		//"out" is a fired in the System class(Java Library)
		//PrintStream is a class defined in the java.io package.
		
		System.out.println("3.2 The Scanner class, and the nextLine method");
		
		System.out.print("Type something:");
		line = in.nextLine();
		//The nextLine method read a line of input from the keyboard and returns
		//a String. It reads characters until it gets to a new line.
		System.out.println("You said:"+line);
		
		System.out.print("Type something else:");
		line = in.nextLine();
		System.out.println("You also said:"+line);
		System.out.println();
		
		System.out.println("3.4-3.5 nextInt, nextDouble, and constants");
		System.out.print("What is your height in centimeters? ");
		cm = in.nextDouble();
		//nextInt reads input from the keyboard and returns a floor integer.
		//nextDouble reads input and returns a floating-point number.
		//nextInt and nextDouble read characters until it gets to a non-digit.
		in.nextLine();
		//read the new line /n, because a /n was typed before.
		//It's a good habit to type it here.
		inch = cm * CM_PER_INCH ;
		System.out.print(cm+" centimeters = ");
		System.out.println(inch+" inches");
		System.out.println();
		
		System.out.println("3.10 The Scanner bug, and the %s %d format specifier");
		System.out.print("What is your name? ");
		name = in.nextLine();
		System.out.print("What is your age? ");
		age = in.nextInt();
		in.nextLine(); //Newly added
		System.out.println("Hello "+name+", age "+age+".");
		System.out.printf("Hello %s, age %d.\n", name, age);
		//The format specifier %s indicates that the following value should be
		//displayed as String. %d indicates int.
		System.out.println();
		
		System.out.print("What is your age? ");
		age = in.nextInt();
		in.nextLine();
		System.out.print("What is your name? ");
		name = in.nextLine();
		System.out.printf("Hello %s, age %d.\n", name, age);
		System.out.println();
		
		System.out.println("3.6 The printf method, the %f and %d format specifiers");
		System.out.print("An example of the \"%\" format specifier: ");
		System.out.printf("%.1f centimeters = %.4f inches\n", cm, inch);
		
		System.out.println("Four examples of the \"%\" format specifier: ");
		System.out.printf("%08d\n", 1234);
		System.out.printf("%08d\n", 123456789);
		System.out.printf("%8d\n", 1234);
		//%08d display the integer padded with zeros, at least 8 digits wide.
		System.out.printf("%d\n", 5, 6, 7);
		System.out.printf("%d %d\n", 5, 6, 7);
		System.out.printf("%d %d %d\n", 5, 6, 7);
		System.out.println();
		
		System.out.println("3.7 Type cast");
		inchInt = (int) inch;
		inchDouble = (double) inchInt;
		System.out.println("You are about " + inchInt + " inches.(inchInt)");
		System.out.println("You are about " + inchDouble + " inches. (inchDouble)");
		System.out.printf("You are about %.0f inches", inch);
		System.out.println(" (%.0f)");
		//The (int) operator toward 0.
		//The %.0f format specifier displays the closest integer.
		System.out.println();
		
		System.out.println("3.8 Modulus operator");
		quotient = inchInt / 12;
		remainderInt = inchInt % 12;
		remainderDouble = inch % 12;
		System.out.printf("The quotient of (%d/12) is %f",inchInt,quotient);
		System.out.printf("The remainderInt of (%d/12) is %d, \n",inchInt,remainderInt);
		System.out.printf("and the remainderDouble of (%f/12) is %f. \n",inch, remainderDouble);
		System.out.printf("%.6f cm is about "+ (inchInt/12) + " feet "+(inchInt%12)+" inches. \n",cm);
		
		System.out.println(-76/12);
		System.out.println(-76%12);
		System.out.println(76/-12);
		System.out.println(76%-12);
		System.out.println(-76/12);
		System.out.println(51.5%12.5);
		//When either dividend or divisor is negative, the naive definition breaks
		//down and programming languages differ in how these values are defined.
		//In Java, results of integer modulo operator % and floating-point modulo
		//operator % have the same sign as dividend.
		System.out.println();
		
		System.out.println("Exercise 3.1");
		//System.out.printf("%f , %d", inchInt,inch);
		
		System.out.println("Exercise 3.2");
		System.out.print("Please input the value of Celsius you wanna convert to Fahrenheit: ");
		double Celsius,Fahrenheit;
		Celsius = in.nextDouble();
		in.nextLine();
		Fahrenheit = (Celsius * 1.8) + 32.0 ;
		System.out.printf("%.1f C = %.1f F",Celsius,Fahrenheit);
		System.out.println();
		
		System.out.println("Exercise 3.3");
		System.out.print("Please input the value of seconds you wanna convert to hours,minutes and seconds: ");
		int secondInput,hourOutput,minuteOutput,secondOutput;
		secondInput = in.nextInt();
		in.nextLine();
		hourOutput = secondInput / 3600 ;
		minuteOutput = (secondInput % 3600) / 60 ;
		secondOutput = secondInput % 60 ;
		System.out.printf("%d seconds = %d hours, %d minutes and %d seconds", secondInput, hourOutput, minuteOutput, secondOutput);
		System.out.println();
		
		
		System.out.println("Exercise 3.4");
		System.out.println("I'm thinking of a number between 1 and 100");
		System.out.println("(including both). Can you guess what it is?");
		int guessedNumber ;
		System.out.print("Type a number: ");
		guessedNumber = in.nextInt();
		in.nextLine();
		System.out.printf("Your guess is: %d \n", guessedNumber);
		Random random = new Random();
		int randomedNumber = random.nextInt(100) + 1;
		System.out.printf("The number I was thinking of is: %d \n", randomedNumber);
		System.out.println("You were off by: " + (guessedNumber-randomedNumber));
		
	}

}

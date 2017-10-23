
public class Chap02Leon {
	public static void main(String[] args) {
		
		// 2.1 & 2.2
		System.out.println("2.1 & 2.2 Declaration, assignment, and String");
		System.out.println();
		
		String message;
		//This statement DECLARES that the variable
		//message has the type String.
		message = "Hello, world!";
		//This is an assignment statement.
		System.out.println(message);
		
		message="My name is Leon.";
		System.out.println(message);
		//DECLARATION and ASSIGNMENT in the same line
		
		System.out.println("2.8 Operators for String");
		System.out.println();
		
		System.out.println(1 + 2 * 3);
		System.out.println((1 + 2) * 3);
		System.out.println(1 + 2 + "Hello");
		System.out.println("Hello" + 1 + 2);
		
		System.out.println("2.2 Initialization and int");
		System.out.println();
		
		int hour = 13, minute = 24, second = 07;
		System.out.print("The current time is ");
		System.out.print(hour+":"+minute+":");
		System.out.println(second+".");
		
		System.out.println("2.2 Octal");
		System.out.println();
		
		hour = 13;
		minute = 24;
		second = 8;
		System.out.print("The current time is ");
		System.out.print(hour+":"+minute+":");
		System.out.println(second+".");
		//In Java and several other languages, an integer literal beginning 
		//with 0 is interpreted as an octal (base 8) quantity.

		System.out.println(0123);
		
		System.out.println("2.5 Arithmetic operators, integer division");
		System.out.println();
		
		hour=19;
		minute=45;
		System.out.print("Number of minutes since midnight: ");
		System.out.println(hour*60+minute);
		
		System.out.print("Fraction of the hour that has passed: ");
		System.out.println(minute/60);
		
		System.out.println(-4/3);
		System.out.println(4/3);
		System.out.println(-6/3);
		System.out.println(6/3);
		
		System.out.println("2.6 The floating-point type: double");
		System.out.println();
		
		System.out.println(-4/3.0);
		System.out.println(-3/3.0);
		System.out.println(2/3.0);
		System.out.println(1/3.0);
		
		
		System.out.print("Fraction of the hour that has passed: ");
		System.out.println(minute/60.0);
		
		double y = 1/3;
		System.out.println(y);
		
		System.out.println("2.7 Rounding errors");
		System.out.println();
		
		System.out.println(0.1);
		System.out.println(0.1+0.1);
		System.out.println(0.1+0.1+0.1);
		System.out.println(0.1+0.1+0.1+0.1);
		System.out.println(0.1+0.1+0.1+0.1+0.1);
		System.out.println(0.1+0.1+0.1+0.1+0.1+0.1);
		System.out.println(0.1+0.1+0.1+0.1+0.1+0.1+0.1);
		System.out.println(0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1);
		System.out.println(0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1);
		System.out.println(0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1);
		
		//Over time the result may be inaccurate.
		//We can avoid the problem by using integers in addition and subtraction,
		//as long as the integer is smaller than
		
		System.out.println("2.10 Types of errors");
		System.out.println();
		
		
		//Compile-time error
		//System.out.println(7)
		
		//Run-time error
		//System.out.println(7/0);
		
		System.out.println("Exercise 2.2");
		System.out.println();
		//Initialization
		String day="Monday",date="23rd",month="October",year="2017";
		//Step 3
		System.out.println(day);
		System.out.println(date);
		System.out.println(month);
		System.out.println(year);
		//Step 4
		System.out.println(day+", "+month+" "+date+", "+year);
		//Step 5
		System.out.println("American format:");
		System.out.println(day+", "+month+" "+date+", "+year);
		System.out.println("European format:");
		System.out.println(day+" "+date+" "+month+" "+year);
		
		System.out.println("Exercise 2.3");
		System.out.println();
		//Initialization
		hour = 20;
		minute = 10;
		second = 20;
		//Step 3
		System.out.println(hour*3600+minute*60+second);
		//Step 4
		System.out.println(86400-(hour*3600+minute*60+second));
		//Step 5
		System.out.println((86400-(hour*3600.0+minute*60+second))/86400);
		//Step 6
		int hour2 = 20;
		int minute2 = 16;
		int second2 = 30;
		System.out.println("Time: "+(hour2-hour)+" Hour(s) "+(minute2-minute)+" Minute(s) "+(second2-second)+" Second(s)");
	}
}

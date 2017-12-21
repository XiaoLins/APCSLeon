
public class Chap04Leon {
	public static void main(String[] args) {
		double root, angle, degrees, height, x, y;
		String s, t, day, month;
		int year, date, hour, minute;
		
		System.out.println("4.1 Math methods");
		root = Math.sqrt(25.0);
		System.out.println("The sqaure root of 25 is: "+root);
		newLine();
		
		angle = 0.5 * Math.PI;
		height = Math.sin(angle);
		degrees = Math.toDegrees(angle);
		System.out.println("Sine of 0.5 pi radian is: "+height);
		System.out.println("0.5 pi radians is equal to "+degrees+" degrees");
		newLine();
		
		degrees = 270.0;
		angle = Math.toRadians(degrees);
		height = Math.sin(angle);
		System.out.println("Sine of 270 degrees is: "+height);
		System.out.print("270 degress is equal to" + angle / Math.PI);
		System.out.println(" pi radians");
		newLine();
		
		y = Math.pow(2.0, 10.0);
		System.out.println("y = 2 ^ 10 = " + y);
		System.out.println(Math.round(1.888));
		newLine();
		
		System.out.println("4.2 Euler's number, composition");
		System.out.println("The Euler's number, e, is: " + Math.E);
		System.out.println("y = e ^ x");
		System.out.println("y is the xth power of base e. Or:");
		System.out.print("x is the exponent to the base e such that the ");
		System.out.println("power is y.");
		y = Math.exp(2);
		System.out.println("The second power of e is y = e ^ 2" + y);
		newLine();
		
		System.out.println("x = ln y");
		x = Math.log(y);
		System.out.println("x is the logarithm to the base e of the power y. Or ");
		System.out.println("x is the natural logarithm of y");
		System.out.println("x = ln 7.38905609893065 =" + x);
		System.out.println(Math.log(Math.exp(2)));
		newLine();
		
		System.out.println("4.5 & 4.6 Parameters and arguments");
		s = "Print this line twice.";
		t = "We are Olers.";
		printTwice(s);
		printTwice(t);
		
		//FLow of execution: Execution always begins at first statement of main,
		//regardless of where it is in the source code.
		//When you write a method, you name the parameters.
		//When you use(invoke) a method, you provide the arguments.
		//For example, printTwice has a parameter named s with type String.
		//When we invoke printTwice, we have to provide an argument with type
		//String. This process is called parameter passing.
		//Parameters and other variables only exist inside their own methods, so
		//they are often call local variables.
		
		hour = 14;
		minute = 18;
		year = 2012;
		date = 30;
		printTime(hour, minute);
		printTime(year, date);
		printTime(11, 19);
		newLine();
		
		System.out.println("Exercise 4.1");
		//1. The output would be like as the followings
		//No, I wug.
		//You wugga wug.
		//I wug.
		//2. It is running the 2nd line of the main method, then the first line
		//of the zoop() method, then the second line of the baffle() method is the
		//first time that ping() involved.
		//3. There may be an endless loop and OutOfMemory Exception
		//or StackOverFlow Exception occurred.
		System.out.println("The answer is in the comment.");
		System.out.println();
		
		System.out.println("Exercise 4.2");
		zool(11,"unexisted","GuangTa");
		System.out.println();
		
		System.out.println("Exercise 4.3");
		printAmerican("Tuesday",14,"November",2017);
		printEuropean("Tuesday",14,"November",2017);
		System.out.println();
		}
	
	public static void printAmerican(String day, int date, String month, int year) {
		System.out.printf("%s, %s %d, %d \n", day, month, date, year);
	}
	
	public static void printEuropean(String day, int date, String month, int year) {
		System.out.printf("%s %d %s %d \n", day, date, month, year);
	}
	
	public static void zool (int time,String stringA, String stringB) {
		System.out.println(time);
		System.out.println(stringA);		
		System.out.println(stringB);
	}
	
	public static void printTime(int hour, int minute) {
		System.out.print(hour);
		System.out.print(":");
		System.out.print(minute);
	}
	
	public static void printTwice(String s) {
		System.out.println(s);
		System.out.println(s);
	}
	
	public static void newLine() {
		System.out.println();
	}

}

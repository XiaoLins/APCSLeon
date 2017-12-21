import java.util.Random;
import java.util.Scanner;

public class Chap05Leon {
	
	private static Scanner in;
	
	public static void main(String[] args) {
		String fruit1,fruit2;
		int m,n;
		double x = 0;
		in = new Scanner(System.in);
		
		System.out.println("5.1 Relational operators");
		m = 5;
		n = 5;
		System.out.println(m == n); // is equal to
		System.out.println(5 != 6); // is not equal to
		System.out.println(5 > 3); // greater than
		System.out.println(5 <= 5); // greater than or equal to
		// These are only two boolean values: true and false
		//true and false are boolean values, so hey can be displayed directly
		
		fruit1 = "Apple";
		fruit2 = "Orange";
		System.out.println(fruit1.equals(fruit2));
		//Most relational operators don't work with strings. We use the
		//equals method with String.
		
		System.out.println("5.2 Logical operators");
		System.out.println(5 > 0 && 5<= 10); //and
		System.out.println(!(5 > 10)); // not
		System.out.println(! true);
		// 5 > 10 should be put into parentheses
		System.out.println(true || 5 > 10); // or
		// true || anything is always true, so there are dead codes
		//after || dead code caused by short circuit
		//Likewise, false && anything is always false.
		System.out.println(false && 5 < 10);
		newLine();
		
		System.out.println("5.3 & 5.4 Conditional statements, chaining, and nesting");
		checkPosNeg();
		checkOddEven();
		newLine();
		
		System.out.println("5.5 & 5.6 Flag variables and the return statement");
		printLog();
		printLog();
		newLine();
		
		System.out.println("5.7 Validating input");
		printLogPlus();
		printLogPlus();
		printLogPlus();
		newLine();
		
		System.out.println("5.8 Recursion");
		System.out.print("Let us count down from n = ");
		n = in.nextInt();
		countDown(n);
		newLine();
		
		System.out.println("5.10 Binary numbers");
		System.out.print("The binary representation of n = ");
		n = in.nextInt();
		displayBinary(n);
		newLine();
		
		System.out.println("Exercise 5.1");
		if (x > 0 && x < 10) {
			System.out.println("positive single digit number.");
		}
		
		System.out.println("Exercise 5.2");
		// 1.
		// main
		// zoop: fred="just for" bob=bizz=5
		// ping: strangStrung="not "
		// main
		// clink: fork=2*buzz=4
		// zoop: fred="breakfast " bob=fork=4
		// 2.
		// just for
		// any not more 
		// It's breakfast 
		// !
		
		System.out.println("Exercise 5.3");
		// main
		// nLines: n=4
		// nLines: n=3
		// nLines: n=2
		// nLines: n=1
		// nLines: n=0
		
		System.out.println("Exercise 5.4");
		int a,b,c;
		System.out.print("a = ");
		a = in.nextInt();
		System.out.print("b = ");
		b = in.nextInt();
		System.out.print("c = ");
		c = in.nextInt();
		System.out.print("n = ");
		n = in.nextInt();
		checkFermat(a,b,c,n);
		
		System.out.println("Exercise 5.5");
		verseBeer(99);
		
		System.out.println("Exercise 5.6");
		/*
		public class Buzz{
			public static void baffle(String blimp) {
				System.out.println(blimp); //4
				zippo("ping",-5); //5
			}
			
			public static void zippo(String quince, int flag) {
				if (flag<0) {
					System.out.println(quince+" zoop"); //6
				}else {
					System.out.println("ik"); //2
					baffle(quince); //3
					System.out.println("boo-wa-ha-ha"); //7
				}
			}
			public static void main(String[] args) {
				zippo("rattle",13); //1
			}
		}
		*/
		//3. "rattle"
		//4.
		//ik
		//rattle
		//ping zoop
		//boo-wa-ha-ha
		
		System.out.println("Exercise 5.7");
		System.out.println("I'm thinking of a number between 1 and 100");
		System.out.println("(including both). Can you guess what it is?");
		int guessedNumber ;
		System.out.print("Type a number: ");
		guessedNumber = in.nextInt();
		in.nextLine();
		Random random = new Random();
		int randomedNumber = random.nextInt(100) + 1;
		guessNumber(guessedNumber,randomedNumber);
	}
	
	public static void guessNumber(int numberGuessed, int numberRandomed) {
		if (numberGuessed == numberRandomed) {
			System.out.println("You get it!");
		}else {
			if(numberGuessed > numberRandomed) {
				System.out.println("Well, it's too high.");
			}else {
				System.out.println("Well, it's too low.");
			}
			System.out.print("Take another try: ");
			int triedNumber = in.nextInt();
			in.nextLine();
			guessNumber(triedNumber,numberRandomed);
		}
	}
	
	public static void newLine() {
		System.out.println();
	}
	
	public static void checkPosNeg() {
		System.out.println("Type a floating-point number x = ");
		double x = in.nextDouble();
		if (x==0) {
			System.out.println("x is zero.");
		}else {
				if (x<0) {
					System.out.println("x is negative.");
				}else {
					System.out.println("x is positive");
				}
			}
		
	}
	
	public static void checkOddEven() {
		System.out.print("Type an integer m = ");
		int m = in.nextInt();
		if ((m % 2)==0) {
			System.out.println("m is even.");
		}else {
			System.out.println("m is odd.");
		}
		
	}
	
	public static void printLog() {
		System.out.print("Type a POSITIVE floating-point number x = ");
		double x = in.nextDouble();
		boolean nonPositiveFlag = (x<=0);
		if (nonPositiveFlag) {
			System.out.println("ERROR: "+x+" is not POSITIVE!");
			return;
			//Return statement terminates a method before you reach the end of it.
		}
		System.out.println("The natural logarithm of x is y = " + Math.log(x));
	}
	
	
	public static void printLogPlus() {
		System.out.print("Type a POSITIVE floating-point number x = ");
		in.nextLine();
		//The line is critical.
		if(!in.hasNextDouble()) {
			System.out.println("ERROR: " + in.next() + " is not a NUMBER");
			return;
		}
		double x = in.nextDouble();
		if (x<=0) {
			System.out.println("ERROR: "+x+" is not POSITIVE!");
			return;
			//Return statement terminates a method before you reach the end of it.
		}
		System.out.println("The natural logarithm of x is y = " + Math.log(x));
	}
	
	public static void countDown(int n) {
		if (n == 0) {
			System.out.println("GO!");
		} else {
			System.out.println(n);
			countDown(n-1);
		}
	}
	
	public static void displayBinary(int n) {
		if (n>0) {
			displayBinary (n/2);
			System.out.print(n%2);
		}
	}
	
	
	/*
	public static void displayBinary(int n) {
		String[] binary = null;
		String toDisplay = "";
		int times = 0;
		if(n!=0) {
			if ((n % 2) == 0){
				binary[times] = "0";
				times++;
				displayBinary(n / 2);
			} else {
				binary[times] = "1";
				times++;
				displayBinary((n - 1) / 2);
			}
			while (times != 0) {
				toDisplay = toDisplay + binary[times];
				times--;
			}
		}
		System.out.println(toDisplay);
	}
	
	public static void displayBinary(int n) {
		double powers = 0;
		String toDisplay = "";
		while (n >= Math.pow(2.0, powers)){
			powers++;
		}
		powers--;
		System.out.println(powers);
		
	}
	*/
	
	public static void checkFermat(int a, int b, int c, int n) {
		boolean isEqual;
		isEqual = (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n));
		if(isEqual && n>2) {
			System.out.println("Holy smokes, Fermat was wrong!");
		}else {
			System.out.println("No, that doesn't work.");
		}
	}
	
	public static void verseBeer(int n) {
		if (n != 0) {
			System.out.println(n + " bottles of beer on the wall,");
			System.out.println(n + " bottles of beer,");
			System.out.println("ya' take one down, ya' pass it around,");
			System.out.println((n-1) + " bottles of beer on the wall");
			verseBeer(n-1);
		}else {
			System.out.println("No bottles of beer on the wall,");
			System.out.println("no bottles of beer,");
			System.out.println("ua' can't take one down, ya' can't pass it around");
			System.out.println("'cause there are no more bottles of beer on the wal!");
		}
	}
}

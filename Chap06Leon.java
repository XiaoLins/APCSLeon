import java.util.Scanner;

public class Chap06Leon {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		//All the methods we have written so far have been void which do NOT
		//return values. In Chap06, we'll write methods that return values
		//which we call value methods.
		
		//Compared to void methods, value methods differ in two ways:
		//They declare the type of the return value (the return type);
		//They use at least one return statement to provide a return value. And
		//the type of the expression in the return statement must match the 
		//return type of the method
		
//		System.out.println("6.1 Return values");
//		System.out.print("Let me find the absolute value of x = ");
//		double x = in.nextDouble();
//		System.out.printf("OK, it's %f.\n",absoluteValue(x));
//		System.out.println();
//		
//		System.out.println("6.2 Incremental development");
//		//Incremental development starts with a working program and make small
//		//incremental changes.
//		System.out.println("Give me the coordinates of two point, the center"+" of the circle and a point on the perimeter. Then I will"+" tell you the area of the circle.");
//		
//		System.out.print("The x-coordinate of the center is x1 = ");
//		double x1 = in.nextDouble();
//		System.out.print("The y-coordinate of the center is y1 = ");
//		double y1 = in.nextDouble();
//		System.out.print("The x-coordinate of the parameter point is x2 = ");
//		double x2 = in.nextDouble();
//		System.out.print("The y-coordinate of the parameter point is y2 = ");
//		double y2 = in.nextDouble();
//		System.out.println(circleArea(x1,y1,x2,y2));
//		System.out.println();
//		
//		System.out.println("6.5 Boolean methods");
//		System.out.print("Give me a nunber, and I will tell you whether it" + " is positive or not. x = ");
//		x = in.nextDouble();
//		System.out.println(isPosOrNot(x));
//		System.out.println();
//		
//		System.out.println("6.7 Factorial");
//		System.out.print("Give me a non-negative integer, and I will tell "+"you its factorial. n = ");
//		int n = in.nextInt();
//		System.out.printf("n factorial is %d.\n",factorial(n));
//		System.out.println();
//		
//		System.out.println("6.9 Fibonacci sequence");
//		System.out.print("We want to find the i th number in the Fibonacci" + " sequence. n = ");
//		int i = in.nextInt();
//		System.out.printf("That will be %d", fibonacci(i));
		
		System.out.println("Exercise 6.1");
		isPosOrNot(2); //1. Nothing happened.
		//isPosOrNot(System.out.println();) //2. Error
		
		System.out.println("Exercise 6.2");
		System.out.print("n = ");
		int n = in.nextInt();
		System.out.print("m = ");
		int m = in.nextInt();
		System.out.println(isDivisible(n,m));
		
		System.out.println("Exercise 6.3");
		System.out.print("a = ");
		int a = in.nextInt();
		System.out.print("b = ");
		int b = in.nextInt();
		System.out.print("c = ");
		int c = in.nextInt();
		System.out.println(isTriangle(a,b,c));
		
		System.out.println("Exercise 6.4");
		System.out.println(Multadd(1.0,2.0,3.0));
		System.out.println(Multadd(Math.cos(Math.PI/4),0.5,Math.sin(Math.PI/4)));
		System.out.println(Multadd(1.0,Math.log(10),Math.log(20)));
		System.out.print("x = ");
		double x = in.nextInt();
		System.out.println(expSum(x));
		
		System.out.println("Exercise 6.5");
		//true
		//true
		//ping!
		//pong!
		
		System.out.println("Exercise 6.6");
		//1.
		//main
		//prod m=1 n=4
		//prod m=1 n=3
		//prod m=1 n=2
		//prod m=1 n=1
		//2.
		//24
		//3. Prod recurses itself while m!=n
		//4.
		/*
		public static int prod(int m, int n) {
			if (m==n) {
				return n;
			} else {
				return n * prod (m, n-1);
			}
		}
		*/
		
		System.out.println("Exercise 6.7");
		System.out.print("Please input the odd sum you wanna get: n = ");
		n = in.nextInt();
		System.out.println(oddSum(n));
		
		System.out.println("Exercise 6.8");
		System.out.print("Please input what you wanna test for Ackermann function: m = ");
		m = in.nextInt();
		System.out.print("n = ");
		n = in.nextInt();
		System.out.println(ack(m,n));
		
		System.out.println("Exercise 6.9");
		System.out.print("Please input what you wanna power: x = ");
		x = in.nextInt();
		System.out.print("Please input the number of power: n = ");
		n = in.nextInt();
		System.out.println(power(x,n));
	}

	public static double power(double x, int n) {
		if (n < 0) {
			return -1;
		} else if(n == 0) {
			return 1;
		} else if (n % 2 == 0) {
			return power(x,n/2) * power(x,n/2);
//			return Math.pow(power(x,n/2),2);
		} else {
			return x * power(x,n-1);
		}

	}
	
	
	public static int ack(int m, int n) {
		if (m == 0) {
			return n + 1;
		} else if(m > 0 && n == 0) {
			return ack(m - 1,1);
		} else if(m > 0 && n > 0) {
			return ack(m - 1,ack(m,n-1));
		} else {
			return -1;
		}
	}
	
	
	public static int oddSum(int n) {
		if (n <= 0) {
			return 0;
		} 
		int recurse = oddSum(n - 2);
		int result = n + recurse;
		return result;
	}
	
	
	public static double expSum(double x) {
		return Multadd(x,Math.pow(Math.E, -x),Math.sqrt(1-Math.pow(Math.E, -x)));
	}
	
	public static double Multadd (double a, double b, double c) {
		return a * b + c;
	}
	
	
	public static boolean isTriangle (int a, int b, int c) {
		if (a+b<=c) {
			return false;
		} else if(a+c<=b) {
			return false;
		} else if(b+c<=a) {
			return false;
		}
		return true;
	}
	
	public static boolean isDivisible(int n, int m) {
		if (m%n == 0) {
			return true;
		}
		return false;
	}
	
	public static double absoluteValue(double x) {
		if (x>=0) {
			return x;
		} else {
			return -x;
		}
		//The return value from this method is a double.
		//Now we have a form of return statement that include a return value.
		//Make sure that every possible path through the program reaches a return statement.
		//Code that appears after a return statement, or any place else where
		//it can never be executed, is called dead code.
	}
	
	public static double circleArea(double x1, double y1, double x2, double y2) {
		double radius = Math.sqrt( (Math.pow(x2 - x1 ,2) + Math.pow(y2 - y1,2)) );
		double area = radius * radius * Math.PI ;
		return area;
		/*
		Step 1:
		A stub is an outline including the method signature and a return statement.
		The return statement is a placeholder for the program to compile.
		Step 2:
		Scaffoldings are codes which are helpful for building the program but not part of the final product.
		 */
	}
	
	public static boolean isPosOrNot(double x) {
		return x>0;
	}
	
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else if (n<0) {
			return -1;
		}
		int step = n;
		int result = 1;
		while (step != 0) {
			result = result * step;
			step--;
		}
		return result;
	}
	
	public static int fibonacci (int i) {
		if (i <= 0) {
			return -1;
		} else if (i <= 2) {
			return 1;
		}
		int a1 = 1;
		int a2 = 1;
		int a3 = 2;
		int times = 2;
		while (times != i) {
			int b = a1 + a2;
			a3 = b;
			a1 = a2;
			a2 = a3;
			times++;
		}
		return a3;
	}
}

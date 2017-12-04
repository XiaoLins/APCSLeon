import java.util.*;
//We import java.util.Scanner and java.util.Arrays
//A wildcard is a symbol used to replace or represent one or more characters.
import java.io.*;

public class Chap08Leon {
	private static Scanner in;
	
	public static void main(String[] args) {
		PrintStream out = System.out;
		in = new Scanner(System.in);
		
		out.println("8.1 Creating arrays");
		//An array is a sequence of values. The values in the array are called
		//elements. All the values in an array must have the same type.
		
		int[] a; //Declaration of a variable with an in array type;
		a = new int[4]; //Assignment. Creation of the array of four integer elements.
		//int[] counts = new int[4];
		//The size can be any none negative integer.
		out.println();
		
		out.println("8.2 Accessing elements");
		//Values of counts is a reference to the array.
		//An array is not the same things the variable referring to it.
		//We can assign different variables to refer to the same array, and we
		//can change the value of a variable to refer to a different array.
		
		//The indexes of an array of n elements are: 0, 1, 2, ... n - 1.
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		
		int[] b = {5,6,7,8};
		//Array constants can only be used in initializers.
		out.println();
		
		out.println("8.3 & 8.5 Displaying arrays, array length");
		out.println("println(a) = " + a);
		out.println("println(b) = " + b);
		//The bracket indicates that the value is an array. "I" stands for
		//"integer", and the rest represents the address of the array.
		printArray(a);
		printArray(b);
		out.println(Arrays.toString(a));
		out.println(Arrays.toString(b));
		out.println();
		
		out.println("8.4 Copying arrays");
		int[] c = a;
		printArray(c);
		a[0] = 2;
		printArray(c);
		//a and c are different variables referring to the same array.
		//They are called aliases. As we change the value of a, c changes with it.
		out.println();
		
		int[] d = new int[a.length];
		for (int i = 0; i < a.length ; i++) {
			d[i] = a[i];
		}
		a[0] = 3;
		printArray(a);
		printArray(d);
		//We actually copy the array that a referring to. So d does not change with a.
		out.println();
		
		int[] e = Arrays.copyOf(a, 4);
		a[0] = 4;
		printArray(a);
		printArray(e);
		//We actually copy the array that a referring to. So e does not change with a.
		out.println();
		
		int[] f = Arrays.copyOfRange(a, 2, 4);
		//Copy the range that 2 <= (index of a) < 4
		printArray(f);
		out.println();
		
		out.println("8.6 Array traversal and search");
		//Looping through the elements of an array is called a traversal.
		a[0] = 1;
		printArray(a);
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) Math.pow(a[i], 2);
		}
		printArray(a);
		out.println();
		
		//Search involves traversing an array looking for a particular
		//element. The following example displays the index where the 
		//target value first appears.
		a[0] = 0;
		a[1] = 0;
		a[2] = 0;
		a[3] = 0;
		out.print("Array a = ");
		printArray(a);
		
		out.print("Search for the integer n you type in array a. n = ");
		int n = in .nextInt();
		if (search(a,n) >= 0) {
			out.printf("%d first appears at index = %d.\n",n, search(a,n));
		} else {
			out.printf("%d does not appear in array a.\n", n);
		}
		out.println();
	}
	
	public static int search (int[] a, int n) {
		int i = 0;
		while (i <= n) {
			if(a[i] == n) {
				return i;
			} else {
				i++;
			}
		}
		return -1;
	}
	
	
	public static void printArray(int[] a) {
		System.out.print("{");
		for(int i = 0 ; i < a.length ; i++) {
			System.out.print(a[i]);
			if (i != a.length-1) {
				System.out.print(", ");
			} 
		}
		System.out.print("}\n");
	}
}

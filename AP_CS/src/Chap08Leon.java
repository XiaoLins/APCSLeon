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
		//Array constants can only be used in initializors.
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
		
		//A reduce operation reduces an array of values down to a single
		//value. The following example displays the sum of elements of
		//array a.
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		out.print("Array a = ");
		printArray(a);
		out.printf("The sum of elements of array a is %d.\n", sum(a));
		out.println();
		
		out.print("Array a = ");
		printArray(a);
		out.printf("The minimum value of elements of array a is %d.\n", min(a));
		out.println();
		
		out.println("8.7 Random numbers");
		int[] integers = runArray(100);
		out.println("We have generated an array of which the 100 elements are random integers between 1 and 100. The array is:");
		printArray(integers);
		out.println();
		
		out.println("8.8 Transverse and count");
		out.print("We want to count how many times a certain n appears in the array. n = ");
		n = in.nextInt();
		out.printf("%d appears %d times in the array.\n", n, count(integers,n));
		out.println();
		
		//Write a method, interval(int[] a, int low, int high),
		//counting how many elements in the array fall in the interval (low, high].
		out.println("We want to count how many elements in the array fall in the interval (low, high])");
		out.print("low = ");
		int low = in.nextInt();
		out.print("high = ");
		int high = in.nextInt();
		out.printf("%d elements fall in the interval (%d, %d].\n", interval(integers, low, high), low, high);
		out.println();
		
		//Create an array int[] frequencies = new int[10], of which the 10 elements
		//counting how many random integers fall in the interval (0, 10], (10, 20]
		//... (90, 100] respectively. Display array frequency.
		
		int[] frequencies = new int[10];
		for (int i = 0; i < 10; i++) {
			frequencies[i] = interval(integers, i*10, (i+1)*10);
		}
		printArray(frequencies);
		
		//Every time the loop invokes interval(a, low, high), it traverses the
		//entire array. Try to transverse the array only once.
		for (int i = 0; i < integers.length; i++) {
			for(int k = 0; k < frequencies.length; k++) {
				if (integers[i] > k * 10 && integers[i] <= k * 10 + 10) {
					frequencies[k]++;
					break;
				}
			}
		}
		printArray(frequencies); //Leon's work
		
		for (int i = 0; i < integers.length; i++) {
			int iFreq = (integers[i] - 1) / 10;
			frequencies[iFreq]++;
		}
		printArray(frequencies);
		out.println(); //Dubos's work
		
		out.println("8.10 The enhanced for loop");
		//It is conventional to use plural nouns for array variables
		//and singular nouns for element variables.
		for(int integer : integers) {
			int iFreq = (integer - 1) / 10;
			frequencies[iFreq]++;
		}
		printArray(frequencies);
		out.println();
		
		printArray(sieveOfEratosthenes(100));

        out.println("Exercise 8.1");
        a[0] = 1;
        printArray(a);
        double[] doubles = new double[5];
        for (int i = 0; i < doubles.length; i++){
            doubles[i] = i+1;
        }
        out.println(Arrays.toString(powArray(doubles,3)));
        printArray(a);
        out.println();

        out.println(Arrays.toString(histogram(integers)));

        out.println("Exercise 8.2");
        /*
        1.Function banana
        This method multiplies all elements of a together.
        kiwi : save the result of the multiplication
        i: count loop times
        2.Function grapefruit
        This methods finds the index of the first elements which value equals to the parameter grape
        i: count loop times
        3.Function pineapple
        This methods loops a.length times, for each loop, pine was added by 1 and when pine was exactly equal
        to apple, pear wound be added by 1.
        pear: times pine equals to apple
        pine: count loop times
        */

        out.println("Exercise 8.3");
		/*
		output:
		30
		stack:
		zoo: [2,4,6,8,10]
		fus = 30
		mus add all elements of the array zoo together and return the result.
		*/

        out.println("Exercise 8.4");
		out.println(indexOfMax(integers));

		out.println("Exercise 8.5");
		printArray(sieveOfEratosthenes(100));

		out.println("Exercise 8.6");
		out.println(areFactors(12,integers));

		out.println("Exercise 8.7");
        out.println(arePrimeFactors(12,integers));

        out.println("Exercise 8.8");
        int[] testArray = {0,1,2,3,2,4,7,2,1,9,3};
        out.println(maxInRange(testArray,2,10));
	}

	public static double max (int[] a){
	    return (double) maxInRange(a,0,a.length);
    }


	public static int maxInRange (int[] a,int lowIndex, int highIndex){
	    if(a.length==1){
	        return a[0];
        } else if (lowIndex == highIndex){
	        return a[lowIndex];
        }
        int[] maxes1 = Arrays.copyOfRange(a,lowIndex,(highIndex-lowIndex)/2);
	    int[] maxes2 = Arrays.copyOfRange(a, (highIndex-lowIndex)/2,highIndex);
	    int maxIn1 = maxInRange(maxes1,0,maxes1.length);
	    int maxIn2 = maxInRange(maxes2,0,maxes2.length);
	    if (maxIn1 > maxIn2){
	        return maxIn1;
        }
        return maxIn2;
    }


	public static boolean arePrimeFactors (int n, int[] a){
	    int[] primeArray = sieveOfEratosthenes(n);
	    boolean isPrime = false;
	    for (int i = 0 ; i < a.length ; i++){
	        for(int iIn = 0 ; iIn < primeArray.length ; iIn++){
	            if (primeArray[iIn] == a[i]){
	                isPrime = true;
	                break;
                }
            }
            if(!isPrime){
	            return false;
            }
            isPrime = false;
	        if(n % a[i] != 0){
	            return false;
            }
        }
        return true;
    }


	public static boolean areFactors (int n, int[] a){
		for (int i = 0; i<a.length;i++){
			if(n % a[i] != 0){
				return false;
			}
		}
		return true;
	}


	public static int indexOfMax(int[] a){
		int result = a[0];
		int count = 0;
		for(int i : a){
			if(result < a[count]){
				result = count;
			}
			count++;
		}
		return result;
		//Yes, since the first index of the loop is 1.
	}


	public static int[] histogram (int[] a){
	    int[] counts = new int[a.length+1];
	    for (int i = 0; i < a.length ; i++){
	        counts[a[i]] += 1;
        }
        return counts;
    }


	public static double[] powArray (double[] a,double power){
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.pow(a[i], power);
        }
        return a;
    }



	public static int[] sieveOfEratosthenes (int n) {
		int[] series = new int[n];
		boolean[] prime = new boolean[n];
		int[] primeNumbers = new int[n];
		int transverseCount = 1;
		int primeNumbersCount = 0;
		for (int i = 0; i < series.length; i++) {
			series[i] = i + 1;
			prime[i] = true;
		}
		for (int i = 0; i < series.length - 1 ; i++) {
			if (prime[transverseCount]) {
				primeNumbers[primeNumbersCount] = series[transverseCount];
				primeNumbersCount++;
				for(int isUnPri = transverseCount + 1; isUnPri < series.length; isUnPri++)
                    if (series[isUnPri] % series[transverseCount] == 0) {
                        prime[isUnPri] = false;
                    }
			}
			transverseCount++;
		}
		int[] result = Arrays.copyOf(primeNumbers,primeNumbersCount);
		return result;
	}
	
	
	public static int interval(int [] a, int low, int high) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > low && a[i] <= high) {
				count++;
			}
		}
		return count;
	}
	
	
	public static int count(int[] a, int n) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				count++;
			}
		}
		return count;
	}
	
	
	public static int[] runArray(int n) {
		Random ran = new Random();
		int[] ranArray = new int[100];
		for (int i = 0; i < 100; i++) {
			ranArray[i] = ran.nextInt(100) + 1;
			//The method nextInt takes an integer argument n, and returns a random
			//integer between 0 and n - 1 (inclusive), that is [0, n-1] 
		}
		return ranArray;
	}
	
	public static int min (int[] a) {
		int result = a[0];
		for (int i = 1; i < a.length ; i++) {
			if(a[i] < result) {
				result = a[i];
			}
		}
		return result;
	}
	
	
	public static int sum (int[] a) {
		int result = 0;
		for(int i = 0; i < a.length ; i++) {
			result += a[i];
		}
		return result;
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

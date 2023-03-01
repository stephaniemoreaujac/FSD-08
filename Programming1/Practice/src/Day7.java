
public class Day7 {
	
	// global scope
	public static final int DEFAULT_MIN = 0; 
	public static final int DEFAULT_MAX = 20;


	// Must be present to run JVM
	public static void main(String[] args) {
		
		// Calling a method
		//helpSomebody();	
		
		/*
		// we can call methods several times
		randomNumber();
		randomNumber();
		randomNumber();
		randomNumber();
		*/
		
		// Passing single argument
		//multiplyByTwo(2); // because it auto cast to a double
		
		/*
		 // Passing multiple arguments
		int a = 7;
		multiplyTwoNumbers(a, a);
		*/
		
		// Return Data Types do not need to be assigned
		//int number = smallestTeacher(2,3,2);
		//smallestTeacher(4,7);
		
		//System.out.println( writeMath(3, 6.2) );
		//writeMath(5,7.2);

//		calcAverage(2,4,6);
//		calcAverage(12, 14, 16);
//		calcAverage(3, 3, 1);
		
//		String startingPart = getStart("Umbrella");
//		
//		System.out.println( getStart("Banana") );
//		System.out.println( getStart("Ninja Cats") );
				
		
		System.out.println("2 arguments " + randomNumber(10,100));
		System.out.println("no arguments " + randomNumber() );
	}
	
	// Overloading
	public static int randomNumber() {
		return randomNumber(DEFAULT_MAX, DEFAULT_MIN);
	}
	
	public static int randomNumber(int max) {
		return randomNumber (max, DEFAULT_MIN);
	}
	
	public static int randomNumber(int max, int min) {
		return (int) ((Math.random() * (max - min)) + min) ;
	}
	
	// Overloading
	public static int addNum(int a, int b) {
		return a + b;
	}
	public static int addNum(int a, int b, int c) {
		int returnInt = 0;
		returnInt += addNum(a, b);
		returnInt += addNum(returnInt, c);
		
		
		return returnInt;
		
		// return addNum( addNum(a, b), c); // SAME RESULT
		
	}
	
	// get the first half of a string without using substring
 	public static String getStart(String str) {
		String strReturn = ""; // the string to return
		int midpoint = str.length() / 2;
		for (int i = 0; i < midpoint; i++) {
			strReturn += str.charAt( i );
		}
		return strReturn;
	}
	
 	// get the first half of a string with substring
 	public static String getStartSubString(String str) {
	    return str.substring(0, str.length() / 2);
	}
	
	// return and argument data type do not have to match
	public static String writeMath(int a, double b) {
		String math = a + " + " + b + " = " + (a+b);
		System.out.println("Inside Method: " + math);
		return math;
	}
	
	// Calculate the average of 3 numbers
	public static void calcAverage(int a, int b, int c) {
		int avg = (a + b + c)/3;
		System.out.println(avg);
		if (avg > 5) {
			return; // return void to leave method early
		}	
		
		System.out.println("The average was calculated.");
	}
	
	// find the smallest of 3 numbers
	public static int smallest(int a, int b, int c) {
		int smallestNumber;
		
		if (a < b && a < c) {
			smallestNumber = a;
		} else if (b < c) {
			smallestNumber = b;
		} else {
			smallestNumber = c;
		}
		System.out.println("Inside method: " + smallestNumber);
		
		return smallestNumber;
		
	}

	public static void smallestMathMin (int a, int b, int c) {
		int d = Math.min (a,b);
		int e = Math.min (c,d);
		
		// same as the previous 2 statements
		int f = Math.min (c,Math.min (a,b));
		
		System.out.println(e);
	}
	
	// Multiplies two numbers
	public static void multiplyTwoNumbers(int x, int y) {
		int z = x * y;
		
		System.out.println(z);
	}
	
	// Multiply argument by 2
	public static void multiplyByTwo(double number) {
		System.out.println(number*2);
	}

	// Simple method
	public static void helpSomebody() {
		System.out.print("Help, ");
		System.out.println("I need somebody");
		
		// Calling another method, within a method
		helpAnybody();
	}
	
	public static void helpAnybody() {
		System.out.println("Help anybody?");
	}

	
	// static vs non static methods - view AccessDay7.java
	public String nonStatic(int x) {
		return "The int is: " +x;
	}
	public static String isStatic(double x) {
		return "The double is: " + x;
	}
	private static void thisIsPrivate() {
		System.out.print("This is a private method");
	}
}

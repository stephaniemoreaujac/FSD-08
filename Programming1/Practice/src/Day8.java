
import java.util.Arrays;

public class Day8 {

	public static void main(String[] args) {
		
		String str;
		
//		// Declaring and Manipulating arrays
		String[] pets = { "cat", "dog", "pig", ""};
		pets[3] = "ram";
		pets[2] = pets[1];
		pets[0] = "ant";
		
		int[] num = {1,2,3,4,5};
		
		double[] grades = new double[4];
		grades[0] = 10;
		grades[1] = 30;
		grades[2] = 67.3;
		grades[3] = 99.1;
		
		// output content of grades
//		System.out.println(Arrays.toString(grades));
		
		// for loop vs for each loop
		/*
		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		for (int d=0; d<days.length; d++) { 
			System.out.print(days[d] + " ");
		}
		System.out.println();
		// FOREACH d IN days - no index available
		for (String d : days) {
			System.out.print(d + " ");
		}
		System.out.println();
		*/
		// The following (can) produce the exact same result
		/*
		double total = 0;
		for (int i=0; i<grades.length; i++) { 
			total += grades[i];
		}
		System.out.println("Total is: " + total);
		
		total = 0;
		for (double grade : grades) {
			total += grade;
		}
		System.out.println("Total is: " + total);
		*/
		
		int[] t = { 2, 5, 7, 1, 4, 7};
		int[] s = { 21,45 };
		
		printVarargs(t);
		printArray(t);
		
		printVarargs(s);
		printArray(s);
		
		 printVarargs(2);
		 printVarargs(2, 5, 7, 8); // instead of declaring printList (int, int, int, int)
		 // printArray(2, 5, 7, 1, 4, 7); ERROR does not work
		
		printVarargsMultiArguments(999, pets);
		printVarargsMultiArguments(123, "hello", "world");
		
		/*
		// Comparing array
		// Copy the pointer - not the actually data
		String[] name = { "John", "Peter", "Adam", "Alain"};
		String[] people = name;
		
		System.out.println( Arrays.toString( name ));
		System.out.println( Arrays.toString( people ));
		
		people[1] = "Arthur";
		System.out.println( Arrays.toString( name ));
		System.out.println( Arrays.toString( people ));
		
		name[2] = "Henri";
		System.out.println( Arrays.toString( name ));
		System.out.println( Arrays.toString( people ));
		*/
		
	}
	
	public static void printArray(int[] num) {
		System.out.println(Arrays.toString(num));
	}
	
	public static void printVarargs(int ... num) {
		System.out.println(Arrays.toString(num));
	}
	
	// OVERLOADING - different argument data types
	public static void printVarargsMultiArguments(int name, String ... str) {
		System.out.println(name + " - " + Arrays.toString(str));
	} 
	public static void printVarargsMultiArguments(String name, int ... str) {
		System.out.println(name + " - " + Arrays.toString(str));
	} 

}

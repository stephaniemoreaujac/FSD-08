import java.util.Arrays;


public class ArrayStuff {


	public static void main(String[] args) {

		//arrayStats();

		int[] randInt = generateRandom(20, 1, 20);
		double[] randDouble = generateRandomDouble(20, 1, 20);
		System.out.println( findSmallestInt(randInt) );
		System.out.println( findLargestInt(randInt) );
		System.out.println( findLargestInt(2, 5, 10, 39, 37, 23) );
		System.out.println( findAverage(randDouble) );
	}

	// create and calculate stats of an array
	public static void arrayStats() {
		// populate 20 items
		int[] randoms = new int[20];
		for (int i = 0; i<randoms.length; i++) {
			randoms[i] = randomNumber(50,1);
		}

		//output array as string
		//System.out.println(Arrays.toString(randoms));

		// init variables
		int countPositive = 0;
		int countOdds = 0;
		int countOver25 = 0;

		// calculate stats
		for (int n : randoms) {
			if ( n >= 0) countPositive++;
			if ( n % 2 == 1) countOdds++;
			if ( n > 25) countOver25++;
		}

		System.out.println("Number of positive numbers: " + countPositive + "\n"
				+ "Number of negative numbers: " + (randoms.length - countPositive) + "\n"
				+ "Number of odd numbers: " + countOdds + "\n"
				+ "Number of even numbers: " + (randoms.length - countOdds) + "\n"
				+ "Number of numbers over 25: " + countOver25);

	}

	// generate random number between min and max
	public static int randomNumber(int max, int min) {
		return (int) ((Math.random() * (max - min)) + min) ;
	}

	// find smallest int
	public static int findSmallestInt(int arr[]) {

		int currentSmallest = arr[0];  
		for (int i = 1; i < arr.length; i++){
			if (arr[i] < currentSmallest) 
				currentSmallest = arr[i];
		}  
		return currentSmallest;  
	}

	// find largest int
	public static int findLargestInt(int ... arr) {
		int currentLargest = arr[0];  
		for (int i = 1; i < arr.length; i++){
			if (arr[i] > currentLargest) 
				currentLargest = arr[i];
		}  
		return currentLargest;  
	}

	// find smallest int
	public static double findAverage(double arr[]) {

		double total = 0;  
		for (double i : arr)
			total += i;

		return (total / arr.length);  
	}

	// linear search
	public static int search(int arr[], int value){
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value){
				return i;
			}
		} 
		return -1;
	}

	// selection sort
	public static int[] sortArr(int arr[]){
		int arrLen = arr.length;

		// One by one move down array elements
		for (int i = 0; i < arrLen-1; i++){
			// Find the minimum element in unsorted array
			int smallestIndex = i;
			for (int j = i+1; j < arrLen; j++) {
				if (arr[j] < arr[smallestIndex]) {
					// found current smallest
					smallestIndex = j;
				}
			}

			// Swap smallest with current element
			int temp = arr[smallestIndex];
			arr[smallestIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	// find common element between 2 arrays and output to console
	public static void commonArr(String[] arrA, String[] arrB) {

	}

	public static double[] generateRandomDouble(int count, int min, int max) {
		double[] r = new double[count];
		for (int i = 0; i<r.length; i++) {
			r[i] = ((Math.random() * (max - min)) + min);
		}
		return r;
	}

}









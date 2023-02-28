
public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// MATH
//		System.out.println( Math.pow(3,4) );
		
//		System.out.println( Math.random() );

		
		// RANDOM NUMBERS
/*
		double r = Math.random(); // double between 0 and 1
		System.out.println("random number is " + r);
		
		// Random number of type double between 0 (inclusive) and 10 (exclusive)
		double a = r * 10;
		System.out.println("random double is " + a);
		
		// Random integer value between 0 (inclusive) and 10 (exclusive)
		int b = (int) (r * 10); 
		System.out.println("random int is " +  b );
		
		// Random integer between 0 and max, where max is given variable
		int max = 15;
		int c = (int) (r * max);
		System.out.println("random with max is " + c);
		
		// Random integer between a min(inc) and a max(inc) value
		int min = 10;
		double tmp = r * ((max+1)-min);
		int d = (int) (min + tmp);
//		int e = (int) (min + (r * ((max+1)-min))); // same thing in 1 line
		System.out.println("random with min/max is " + d);
*/
		// char
//		char letter = 'b';		
//		System.out.println( (char)(letter + 1));
		
		// STRING
		String a = "Apple";
		String b = "Pine";
		
		System.out.println( b.length() );
		
		// get last charater of a string
		String c = "Bicycle";
		char lastChar = c.charAt( c.length()-1 ); 
		System.out.println("last char " + lastChar );
	}
}

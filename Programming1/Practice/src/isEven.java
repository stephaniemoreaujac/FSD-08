
public class isEven {

	public static void main(String[] args) {
		
		// get integer from user - safely assume user provided an Interger
		//String userInput = ;
		int userInt = Integer.parseInt(args[0]);
		
		boolean isEven = (userInt % 2) == 0;

		// boolean isEven = (Integer.parseInt(args[0])%2==0);
		
		// OPTION 1 = determine if it is even or odd
		String results = "";
		if (isEven) {
			results = "even";
		} else {
			results = "odd";
		}
		System.out.println("the number " + userInt + " is " + results);
		
		
		// OPTION 2
		System.out.print("the number " + userInt + " is ");
		if (isEven) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	}

}

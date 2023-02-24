
public class IsVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
	Write a method that takes a String as an input argument. 
	Output if the character at a randomly generated index is a vowel
	is the character __ at index __ a vowel? Yes, it is!
	is the character __ at index __ a vowel? No, it is not a vowel
*/
		
		// get input from user
		String strInput = args[0];
		
		String str = strInput.toLowerCase(); // lower case so not checking a and A
		
		// generate random index
		int index = (int)(Math.random() * str.length() );
		
		char c = str.charAt(index); // D.R.Y
		
		System.out.print("is the character " + strInput.charAt(index) + " at index " + index + " a vowel? ");
		
		// check if vowel
//		if (str.charAt(index)=='a' || str.charAt(index)=='e' || str.charAt(index)=='A' || str.charAt(index)=='E')
//		if (c=='a' || c=='e' || c=='A' || c=='E')
		if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
			System.out.print("Yes, it is!");
		}else {
			System.out.print("No, it is not a vowel");
		}


				
	}

}

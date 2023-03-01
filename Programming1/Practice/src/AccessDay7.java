
public class AccessDay7 {

	public static void main(String[] args) {
		// Required Day7.java in same package

		// Using the static keyword
		Day7.isStatic(4.2);
		
		// Method without static keyword
		Day7 d7 = new Day7();
		d7.nonStatic(3);
		
		// private access modifier = no access
		// Day7.thisIsPrivate(); // ERROR
	
		
		
	}

}

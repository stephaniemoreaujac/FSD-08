
public class Day2 {

	public static void main(String[] args) {
		// Naming our variables
		String userName;
		
		userName = "Steph";
		System.out.println( userName );
	
		userName = "Bob";
		System.out.println( userName );
		
		 //String userName; // cannot redeclare varible name
		
		/* Careful how we name our variables 
		 * 	userName and username are NOT the same
		 */
		String username;
		username = "Adele";
		System.out.println(username);
		
		// single line declaration
		int hour = 60;
		
		// arithmetic operator
		int twoHours = hour + hour;
		System.out.println(twoHours);
		
		twoHours = hour * 3;
		System.out.println(twoHours);
		
		// char must be in single quotes
		char letter = 'H';
		
		System.out.println(letter);
		
		
		// Concatenation
		int a = 5;
		int b = 10;
		String c;

		System.out.println(a + b);
		System.out.println("a + b"); 
		System.out.println("a" + "b");
		System.out.println("a" + b);
		System.out.println(a + "b");
		System.out.println(a);

		//c = a + b; // ERROR type mismatch
		c = "a + b";
		c = "a" + "b";
		c = "a" + b;
		System.out.println(c);
		c = a + "b";
		System.out.println(c);
		//c = a;	// ERROR type mismatch
		
		// THESE ARE NOT THE SAME
		c = "1. a" + (a + b) + "b";	// 1. a15b
		c = "2. a" + a + b + "b";	// 2. a510b

//		c = 'c' + 'h'; 	// ERROR
//		System.out.println(c);
		
		// Shorthand operators
		int sh = 5;
		
		// these do the same thing
		sh = sh + 5; // 10
		sh += 10;	  // 20
		System.out.println(sh);
		sh += sh;	// sh = sh + sh; => 40
		sh -= 8; // sh = sh - 8 => 32
		sh /= 4; // sh = sh / 4 => 8
		sh *= 3; //	sh = sh * 3	=> 24
		
		// incremental - decremental
		int pages = 0;
		pages = pages + 1;	// 1
		System.out.println(pages);
		pages += 1;	// 2
		System.out.println(pages);
		pages++; // 3
		System.out.println(pages);
		++pages; // 4
		System.out.println(pages);	// 4
		System.out.println("pages++ " + pages++); //pages++ 4	
		System.out.println(pages); // 5
		System.out.println("++pages " + ++pages);	//++pages 6
		System.out.println(pages); // 6
				
//		System.out.println(sh);
		
		String fullName;
		fullName = "Steph";
		fullName = fullName + " ";
		fullName += "Moreau";
		
		//System.out.println(fullName);
		
// ACTUALLY DONE ON DAY 3
		
		/*
		// difference between ++number and number++;

		int a = 5;	// a = 5
		int b = 5;	// b = 5
		
		a++;	// a = 6
		++b;	// b = 6
		
		int c = a++;	// c = 6, a = 7
		int d = ++b;	// b = 7, d = 7
		
		
		System.out.print(a++);	// output 7, a = 8
		*/
		
		int z = 4;
		
		double x = z;
		System.out.println(x);
		
		// int y = x; // TYPE MISMATCH ERROR
		int y = (int) x;
		System.out.println(y);

		
		String s = "77";
		int si = Integer.parseInt( s );
		System.out.println(si);	// 77
		
		double sd = Double.parseDouble( s );
		System.out.println(sd); // 77.0
		
		String s2 = "38.6";
		System.out.println( Double.parseDouble( s2 ) ); //38.6
		// System.out.println( Integer.parseInt( s2 ) ); //ERROR
		
		
	}
}

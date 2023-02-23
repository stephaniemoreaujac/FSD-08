
public class Day3 {

	public static void main(String[] args) {
		
		/*
		// GET PROGRAM VARIABLE FROM USER
		System.out.println(args[0]);
		*/
		/*
		// CONDITIONAL STATEMENTS
		boolean isRaining = false;
		
		System.out.println("Check weather");
		
		if (isRaining) {
			System.out.println("Find your umbrella");
			System.out.println("Get your rain boots");
		} else {
			System.out.println("It might be sunny");
		}
		
		System.out.println("Enjoy the day!");
		 */
		
		/*
		int grade = 50;
		String namedGrade = "";
		
		if (grade >= 95) {
			namedGrade = "A+";
		} else if (grade > 80) {
			namedGrade = "B";
		} else if (grade > 70) {
			namedGrade = "B-";
		} else if ( grade > 60)
			namedGrade = "C-";
		else
			namedGrade = "F";
		// Curly brackets are optional, but will only execute 1 statement
		System.out.println(namedGrade);

		
		if (grade > 60) {
			System.out.println("Your grade was over 60");
			System.out.println("You Passed!");
		}
		*/
		
		// SWITCH STATEMENT
		String color = "black"; // switch is case sensitive
		int x = 2;
		switch(color) {
		  case "orange" : // if color == "orange"
			System.out.println("This is the start");
		    System.out.println("The one true color of the sun");
		    x++;
		    System.out.println("x is equal to " + x);
		    break;
		  case "blue": // if color == blue
		    System.out.println("Favorite by a mile!!!");
		    System.out.println("x is equal to " + x);
		    break;
		  case "green":
		    System.out.println("Second place, but not close");
		    break;
		  case "yellow":
		  case "red": // if (color == "red" || color == "yellow")
		    System.out.println("Last on the podium");
		    break;
		  case "purple":
		    System.out.println("Not the popular vote");
		  case "black":
		    System.out.println("Left in the dust");
		   
		   default :
			System.out.println("Not the favorite");
		}

		
	}
}


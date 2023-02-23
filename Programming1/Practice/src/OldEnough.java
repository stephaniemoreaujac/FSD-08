
public class OldEnough {

	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		
		String output = "";
		
		//Age less than 16
		if (age < 16)
			output = "You can't really do much!";
		else if (age >= 18 && age <= 25 ) {
			//Age over 18 
			if (age > 18)
				output += "You are legal in Ontario" + "\n";
			//Age over 17 
			if (age > 17)
				output += "You are legal in Quebec" + "\n";
			//Age equal to or over 21
			if (age >= 21)
				output += "Let's go to Vegas..." + "\n";
			//Between 18 and 25 (inclusive) 
			output += "Renting a car will be difficult";
		} else {//Over 25 
			output += "You can do anything";
		}
		
		System.out.println(output);

	}

}


public class VariableSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create 2 variables
		int a = 111;
		int b = 999;
		
		// swap their values
		/* CANT DO THIS - it will overwrite one of the values
			a = b; 
			b = a; 
		*/
		
		int temp = a;
		a = b;
		b = temp;
		
		// output to terminal
		System.out.print("The value of A is " + a);
		System.out.print(" and the value of B is " + b);
	}

}

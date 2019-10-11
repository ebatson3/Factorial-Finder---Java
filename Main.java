package ebatson3_lab04_q1; //Package name

import java.util.Scanner; //Importing scanner for user input

public class Main {
	public static void main(String[] xyz) {
		int n = 0; //Declaring initial variable value
		double nfact = 1; //Declaring initial variable value
		boolean check = true;
		
	
	Scanner inputScanner = new Scanner(System.in); //Naming and initializing scanner
	System.out.println("Please enter an integer: "); //Prompting user input
	n = inputScanner.nextInt(); //This value assigned to n variable
	while (check) 
	{
		if (n<0) {
		System.out.println("Invalid input, please enter a postitive integer: "); 
		/*Displayed if input does not meet requirements */
		n = inputScanner.nextInt();
		}
		else
			check = false;
	}
	
	while (n > 0) { //Opening while loop
		nfact = nfact*n; //Computing the factorial value
		n--; //Decrementing the input
	}
	System.out.println("The factorial is " + nfact); //Outputs the result to the user
	inputScanner.close(); //Closing the scanner
	System.out.println("Goodbye!"); //Outputs goodbye to user
	}
} //End of program

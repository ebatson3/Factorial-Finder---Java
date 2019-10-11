package ebatson3_lab05_q1; //Package name

import java.util.Scanner; //Importing the scanner for user input

public class Main {
	
	public static void printHeader (int labNu, int questionNum, String fName, String lName, String mission) {
		
	}
	
	public static int getPositiveInteger() {
		boolean checker = true; //Initializing boolean to check if valid input
		int value = 0; //Naming input variable
		Scanner inputScanner = new Scanner(System.in); //Naming scanner
		System.out.println("Please enter the number to be turned into it's factorial: "); //Outputs this to get user input
		value = inputScanner.nextInt(); //Assigns this value to the variable
		if (value<0) {
			System.out.println("Invalid! Enter a positive number dood: "); //Outputs when input is invalid
			value = inputScanner.nextInt(); //Assigns this value to the variable
		}
		else
			checker = false; //Changes the value of the boolean
		
		inputScanner.close(); //Closing the scanner
		return value; //Returns this vale to the main method
	}
	
	public static double computeFactorial(int value) {
		int yfact = 1; // Declaring the factorial variable 
		while (value>0) {
			yfact = yfact*value; //Computing the factorial using a loop 
			value--; //Decrementing the input value
		}
		return yfact; //Returns this value to the main method
	}
	
	public static void main(String[] xyz) {
		System.out.println("The factorial is: " + computeFactorial(getPositiveInteger())); //Outputs the result using the methods above
	}
} //End of program
		
	


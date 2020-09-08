/**
 * Name: Tony Barrera
 * CptS 233: MicroAssignment #1
 * Date: 9/7/2020
 * gitRepo URL: 
 */

import java.util.Scanner;

public class main {

	
	public static void main(String[] args) {
	
		System.out.println("Welcome to Westfield Carpet Comapany's Room Carpet Price Calculator");
		System.out.println("To start, we need a bit of information to proceed.");
		System.out.println("(Press enter after typing your response)");

		Scanner scan = new Scanner(System.in);
		
		double cost = getPositiveNumber("Enter the cost per square foot: ", scan);
		double w = getPositiveNumber("Enter the width of the room: ", scan);
		double len = getPositiveNumber("Enter the length of the room: ", scan);
		
		RoomDimension dim = new RoomDimension(w, len);
		RoomCarpet newCarpet = new RoomCarpet(dim, cost);
		
		System.out.println("\nThe cost of your new carpet will be: $" + newCarpet.CostOfCarpet());
		
		scan.close();
	}
	
	public static double getPositiveNumber(String prompt, Scanner scan) {
		
		
		System.out.println(prompt);
		double n = scan.nextDouble();
		while(n <= 0) {
			System.out.println("Please enter a positive number: ");
			n = scan.nextDouble();
		}
		
		return n;
	}
	
}

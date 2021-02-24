import java.util.Scanner;

public class ProgressiveSum {
	public static void main(String[] args) {
		System.out.println("This program will process the sum of values from 1 to n.");
		
		//request input for n
		boolean isValid = false;
		Scanner keyboard = new Scanner(System.in);
		int upperLimit = 0;
		while (isValid == false) {
			System.out.println("Please enter a positive (non-zero) number as the upper limit.");
			upperLimit = keyboard.nextInt();
			if (upperLimit < 1) {
				System.out.println("This is not a valid value for the upper limit.");
			} else {
				isValid = true;
				System.out.println("Thank you! Here is a verbose calculation of the sum:");
			}
		}
		
		//sum of 1 through n
		int total = 0;
		for (int i = 1; i <= upperLimit; i++) {
			System.out.print(i + " + " + total + " = ");
			total += i;
			System.out.println(total);
		}
		
		//output
		System.out.println("The final total is " + total);
		
	}
}

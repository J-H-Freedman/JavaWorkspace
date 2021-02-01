import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		System.out.println("Oh hello!");
		System.out.println("I will add two numbers for you.");
		System.out.println("Enter two whole numbers, please...");
		
		int n1, n2;		
		
		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		
		int sum = n1+n2;
		
		
		System.out.println("The sum of those two numbers is " + Integer.toString(sum));

	}

}

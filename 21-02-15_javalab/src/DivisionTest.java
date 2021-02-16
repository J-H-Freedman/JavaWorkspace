import java.util.Scanner;
public class DivisionTest {
	public static void main(String[] args) {
		System.out.println("This program tests to see if two intergers are divisable");
		
		System.out.println("Please enter two intergers...");
		Scanner keyboard = new Scanner(System.in);
		int intergerOne = keyboard.nextInt();
		int intergerTwo = keyboard.nextInt();
		
		int result = intergerOne / intergerTwo;
		int remainder = intergerOne % intergerTwo;
		
		switch (remainder) {
		case 0:
			System.out.println("Congrats! These two numbers are divisable. The result is " + result);
			break;
		default:
			System.out.println("These two intergers are not divisable. Try reducing the second number by " + remainder);
			break;
		}
		System.exit(0);
	}
}

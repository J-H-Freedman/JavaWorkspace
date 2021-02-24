import java.util.Scanner;

public class characterCounter {
	public static void main(String[] args) {
		
		//preface program
		System.out.println("We will find the amount of a specified character appears in a string.");
		
		//acquire strings
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the string you wish to search through:");
		String targetString = keyboard.nextLine();
		
		System.out.println("Please enter a character for us to search for:");
		System.out.println("(If more than one character is submitted, we will use the first one.)");
		Character searchedChar = keyboard.next().charAt(0);
		
		System.out.println("Thank you! We will now perform the verbose calculation...");
		
		//calculate
		int total = 0;
		for (int i = 0; i < targetString.length(); i++) {
			if (targetString.charAt(i) == searchedChar) {
				total++;
				System.out.println("The new total is " + total);
			}
		}
		
		//output
		System.out.println("The final total is " + total);
		
	}
}

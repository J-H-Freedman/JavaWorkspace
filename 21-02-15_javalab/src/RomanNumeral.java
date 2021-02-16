import java.util.Scanner;

public class RomanNumeral {
	public static void main(String[] args) {
		System.out.println("This program will convert your input into roman numerals");
		System.out.println("Please enter a number between 1 and 10");
		
		Scanner keyboard = new Scanner(System.in);
		int beforeConversion = keyboard.nextInt();
		String afterConversion = "";
		
		switch (beforeConversion)
		{
		case 1:
			afterConversion = "I";
			break;
		case 2:
			afterConversion = "II";
			break;
		case 3:
			afterConversion = "III";
			break;
		case 4:
			afterConversion = "IV";
			break;
		case 5:
			afterConversion = "V";
			break;
		case 6:
			afterConversion = "VI";
			break;
		case 7:
			afterConversion = "VII";
			break;
		case 8:
			afterConversion = "VIII";
			break;
		case 9:
			afterConversion = "IX";
			break;
		case 10:
			afterConversion = "X";
			break;
		default:
			System.out.println("That value was not between 1 and 10.");
			System.out.println("Please restart this program and try again.");
			System.exit(0);
			break;
		}
		
		System.out.println(beforeConversion + " is " + afterConversion + " in roman numerals.");
		System.exit(0);
	}
}

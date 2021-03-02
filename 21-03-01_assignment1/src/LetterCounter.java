import java.util.Scanner;
public class LetterCounter {
    public static void main(String[] args) {
        //prompt user
        Scanner keyboard = new Scanner(System.in);
        System.out.println("We will calculate the amount of times a specified character appears in a string.");
        System.out.println("First type the string:");
        String targetString = keyboard.nextLine();
        System.out.println("Now what character do you want me to count?");
        char targetChar = keyboard.next().charAt(0);
        //process input
        int charCount = 0;
        for (int c=0; c<targetString.length(); c++)
        {
            if (targetString.charAt(c) == targetChar)
            {
                charCount++;
            }
        }
        //produce output
        System.out.println("We have found " + charCount + " instances of the letter '" + targetChar +"' in the string \"" + targetString + "\"");
        //terminate program
    }
}

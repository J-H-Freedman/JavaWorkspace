import java.util.Locale;
import java.util.Scanner;
public class TestTheStrings {
    public static void main(String[] args) {
        boolean isDone = false;
        Scanner keyboard = new Scanner(System.in);

        //prompt user
        System.out.println("Please enter a series of words and I will tell you if the first and last letter are the same.");
        System.out.println("When finished, please type \"done\"");

        while (isDone == false)
        {
            //acquire input
            String testInput = keyboard.nextLine().toLowerCase();
            switch (testInput)
            {
                case "done":
                    //terminate program
                    isDone = true;
                default:
                    //process input to match the first and last character
                    if (testInput.charAt(0) == testInput.charAt(testInput.length()-1))
                    {
                        //produce output
                        System.out.println("The word \"" + testInput + "\" has the same first and last character of '" + testInput.charAt(0) + "'");
                    }
            }
        }
    }
}

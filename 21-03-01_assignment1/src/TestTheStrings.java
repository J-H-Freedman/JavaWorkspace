import java.util.Locale;
import java.util.Scanner;
public class TestTheStrings {
    public static void main(String[] args) {
        //prompt user
        System.out.println("Please enter a series of words and I will tell you if the first and last letter are the same.");
        System.out.println("When finished, please type \"done\"");
        //process input
        boolean isDone = false;
        Scanner keyboard = new Scanner(System.in);
        String terminate = "done";
        while (isDone == false)
        {
            String testInput = keyboard.nextLine().toLowerCase();
            switch (testInput)
            {
                case "done":
                    isDone = true;
                    //break;
                default:
                    if (testInput.charAt(0) == testInput.charAt(testInput.length()-1))
                    {
                        System.out.println("The word \"" + testInput + "\" has the same first and last character of \"" + testInput.charAt(0) + "\".");
                    }
            }
        }
        //produce output

        //terminate program
    }
}

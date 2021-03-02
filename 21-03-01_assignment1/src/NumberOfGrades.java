import java.util.Scanner;
public class NumberOfGrades {
    public static void main(String[] args) {
        //prompt user
        System.out.println("Please provide a series of grades seperated by spaces.");
        System.out.println("When you are done, type a negative number(i.e. -1)");
        //process input
        boolean isDone = false;
        Scanner keyboard = new Scanner(System.in);
        int A_grade, B_grade, C_grade, D_grade, F_grade, gradeCount;
        A_grade = B_grade = C_grade = D_grade = F_grade = gradeCount = 0;
        while (isDone == false)
        {
            int testInput = keyboard.nextInt();
            //90-100 is an A, 80-89 is a B, 70-79 is a C, 60-69 is a D, and 0-59 is an F.
            if (testInput < 0)
            {
                isDone = true;
            } else if (testInput < 60)
            {
                gradeCount++;
                F_grade++;
            } else if (testInput < 70)
            {
                gradeCount++;
                D_grade++;
            } else if (testInput < 80)
            {
                gradeCount++;
                C_grade++;
            } else if (testInput < 90)
            {
                gradeCount++;
                B_grade++;
            } else if (testInput < 101)
            {
                gradeCount++;
                A_grade++;
            }
        }
        //produce output
        System.out.println("The total amount of grades calculated is " + gradeCount);
        System.out.println("Amount of A's: " + A_grade);
        System.out.println("Amount of B's: " + B_grade);
        System.out.println("Amount of C's: " + C_grade);
        System.out.println("Amount of D's: " + D_grade);
        System.out.println("Amount of F's: " + F_grade);

        //terminate program
    }
}

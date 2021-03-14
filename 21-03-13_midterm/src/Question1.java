/**
 * Write a program that finds if a number is divisible by both 5 and 7.
 *
 * Write a method named isDivisible, that accepts a number as a parameter and returns true if the number is divisible by both 5 an 7, or false otherwise.
 *
 * Write a main method and call the isDivisible method (from the main method) with the numbers 35 and 40.
 */

import java.util.Scanner;

public class Question1 {

    /**
     * Tests if the input parameter is divisible by 5 and 7
     * @param parameter the number being tested
     * @return whether or not it is divisible
     */
    public static boolean isDivisible(int parameter)
    {
        if ((parameter%5==0) && (parameter%7==0))
        {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        boolean test1 = isDivisible(35);
        boolean test2 = isDivisible(40);

        System.out.println("Is 35 divisible by 5 and 7? " + test1);
        System.out.println("Is 40 divisible by 5 and 7? " + test2);

    }
}

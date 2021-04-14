import java.util.Scanner;

public class DriverExam {
    /**
     * Initializes the constant of the exam answers and creates a space to be checked against
     */
    char[][] examAnswers = {
            {'Z', 'Z'}, //initializes a 20x2 instead of a 20x1
            {'B'}, {'D'}, {'A'}, {'A'}, {'C'},
            {'A'}, {'B'}, {'A'}, {'C'}, {'D'},
            {'B'}, {'C'}, {'D'}, {'A'}, {'D'},
            {'C'}, {'C'}, {'B'}, {'D'}, {'A'}
    };

    /**
     * the error message that appears whwn there is a validation error
     */
    String invalidErrorMessage = "This answer is invalid. Please try again...";

    /**
     * Get Exam Answers
     *
     * @return Exam answers
     */
    public char[][] getExamAnswers() {
        return examAnswers;
    }

    /**
     * Set exam answers
     *
     * @param examAnswers
     */
    public void setExamAnswers(char[][] examAnswers) {
        this.examAnswers = examAnswers;
    }

    /**
     * Validates answers as A, B, C, or D
     * @param input the answer in question
     * @return whether or not it is a valid answer
     */
    public boolean isValid(char input) {
        if (input == 'A' || input == 'B' || input == 'C' || input == 'D') {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Answer an individual question from the exam
     * @param questionNumber the question number you wish to answer
     */
    public void answerQuestion(int questionNumber) {
        Scanner keyboard = new Scanner(System.in);
        boolean readyForNext = false;
        char userInput;
        do {
            userInput = keyboard.next().charAt(0);
            if (isValid(userInput)==true) {
                readyForNext = true;
            }
            else {
                System.out.println(invalidErrorMessage);
            }
        } while (readyForNext == false);
        // SET userInput TO examAnswers[questionNumber][1]
    }

    /**
     * Takes input from user and places it in the examAnswers[][1] column until through to the end.
     */
    public void takeExam() {
        System.out.println("The exam has begun.");
        for (int questionNumber = 1; questionNumber < examAnswers.length; questionNumber++) {
            System.out.println("Enter the answer to Question " + questionNumber);
            answerQuestion(questionNumber);
        }
        System.out.println("The exam is now complete. Thank you.");
    }

    /* how many correct
    create counter
    for i in examAnswers.length
        if examAnswers[i][0]==examAnswers[i][1]
            counter++
    return counter */

    /* how many incorrect
    create counter
    for i in examAnswers.length
        if examAnswers[i][0]==!examAnswers[i][1]
            counter++
    return counter */

    /* how many empty
    create counter
    for i in examAnswers.length
        if examAnswers[i][1] == null
            counter++
    return counter */
}
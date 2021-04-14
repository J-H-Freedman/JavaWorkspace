import java.util.Scanner;

public class DriverExam {
     // the correct answer constant to be checked against
    char[] CORRECT_ANSWERS = {
            'B', 'D', 'A', 'A', 'C',
            'A', 'B', 'A', 'C', 'D',
            'B', 'C', 'D', 'A', 'D',
            'C', 'C', 'B', 'D', 'A'
    };

    // the user's stored answers
    char[] userAnswers = new char[20];

    // the error message that appears when there is a validation error
    String invalidErrorMessage = "This answer is invalid. Please try again...";

    public char getCORRECT_ANSWER(int i) {
        return CORRECT_ANSWERS[i];
    }

    /**
     * Get a single user answer
     * @param i the index of the answer
     * @return the char value at the index
     */
    public char getUserAnswer(int i) {
        return this.userAnswers[i];
    }

    /**
     * set a single answer
     * @param i the index of the answer we are setting
     * @param answer the answer to be set
     */
    public void addUserAnswer(int i, char answer) {
        this.userAnswers[i] = answer;
    }

    /**
     * Validates answers as A, B, C, or D
     * @param input the answer in question
     * @return whether or not it is a valid answer
     */
    public boolean isValid(char input) {
        return (input == 'A' || input == 'B' || input == 'C' || input == 'D');
    }

    /**
     * Answer an individual question from the exam
     * @param questionNumber the question number you wish to answer
     */
    public void answerQuestion(int questionNumber) {
        Scanner keyboard = new Scanner(System.in);
        boolean readyForNext = false;
        char userInput;
        // validate before continuing
        do {
            userInput = keyboard.next().charAt(0);
            if (isValid(userInput)) {
                readyForNext = true;
            }
            else {
                System.out.println(invalidErrorMessage);
            }
        } while (!readyForNext);
        // add answer
        addUserAnswer(questionNumber, userInput);
    }

    /**
     * Takes input from user and places it in the examAnswers[][1] column until through to the end.
     */
    public void fullExam() {
        System.out.println("The exam has begun.");
        for (int questionNumber = 1; questionNumber < CORRECT_ANSWERS.length; questionNumber++) {
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
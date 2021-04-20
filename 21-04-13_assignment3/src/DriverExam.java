import java.util.Scanner;

public class DriverExam {
    // keyboard input
    Scanner keyboard = new Scanner(System.in);

     // the correct answer constant to be checked against
    static char[] CORRECT_ANSWERS = {
            'B', 'D', 'A', 'A', 'C',
            'A', 'B', 'A', 'C', 'D',
            'B', 'C', 'D', 'A', 'D',
            'C', 'C', 'B', 'D', 'A'
    };



    // the user's stored answers
    char[] userAnswers = new char[CORRECT_ANSWERS.length];

    // the error message that appears when there is a validation error
    String invalidErrorMessage = "This input is invalid. Please try again...";

    // which question we are currently on
    int navTracker = 0;

    // is the exam completed?
    boolean examCompleted = false;

    // ---

    /**
     * get a specific correct answer
     * @param i the index of the answer
     * @return the answer for the index inq question
     */
    public static char getCORRECT_ANSWER(int i) {
        return CORRECT_ANSWERS[i];
    }

    /**
     * Get a single user answer
     * @param i the index of the answer
     * @return the char value at the index
     */
    public Character getUserAnswer(int i) {
        return this.userAnswers[i];
    }

    // ---

    /**
     * set a single answer
     * @param i the index of the answer we are setting
     * @param answer the answer to be set
     */
    public void addUserAnswer(int i, char answer) {
        this.userAnswers[i] = Character.toUpperCase(answer);
    }

    /**
     * Validates answers as A, B, C, or D
     * @param i the answer in question
     * @return whether or not it is a valid answer
     */
    boolean answerIsValid(char i) {
        return (i == 'A' || i == 'B' || i == 'C' || i == 'D');
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
            userInput = Character.toUpperCase(keyboard.next().charAt(0));
            if (answerIsValid(userInput)) {
                readyForNext = true;
            }
            else {
                System.out.println(invalidErrorMessage);
            }
        } while (!readyForNext);
        // add answer
        addUserAnswer(questionNumber, userInput);
    }

    // ---

    /**
     * Validates nav location
     * @param i nav location in question
     * @return whether or not the location is valid
     */
    boolean navIsValid(int i) {
        return (1 <= i && i <= CORRECT_ANSWERS.length);
    }

    /**
     * Navigate which question will be asked next
     * @param i the input to decide where to go next
     */
    void navigate(int i) {
        if (navIsValid(i)) {
            this.navTracker = i-1;
        }
        else if (i == -1) {
            this.navTracker--;
        }
        else if (i == 0) {
            this.navTracker++;
        }
    }

    /**
     * Navigate to previous question
     */
    void navPrev() {
        navigate(-1);
    }

    /**
     * Navigate to next question
     */
    void navNext(){
        navigate(0);
    }

    /**
     * Select which question to go to next
     */
    void navSelect() {
        boolean selectionCompleted = false;
        System.out.println("Please select which question you would like to navigate to:");
        do {
            int i = keyboard.nextInt();
            if (navIsValid(i)) {
                navigate(i);
                selectionCompleted = true;
            }
            else {
                System.out.println(invalidErrorMessage);
            }
        } while (!selectionCompleted);
    }

    /**
     * Based con context, choose to go previous, next, select, or finish
     */
    void navMenu() {
        boolean navCompleted = false;
        //for the first question
        if (navTracker == 0) {
            System.out.println("Type \"next\" or \"select\"");
            do {
                String navInput = keyboard.next().toLowerCase();
                switch (navInput) {
                    case "next" -> {
                        navNext();
                        navCompleted = true;
                    }
                    case "select" -> {
                        navSelect();
                        navCompleted = true;
                    }
                    default -> {
                        System.out.println(invalidErrorMessage);
                    }
                }
            } while (!navCompleted);
        }
        // for the last question
        else if (navTracker == (DriverExam.CORRECT_ANSWERS.length-1)) {
            System.out.println("Type \"prev,\" \"select,\" or \"finish\"");
            do {
                String navInput = keyboard.next().toLowerCase();
                switch (navInput) {
                    case "prev" -> {
                        navPrev();
                        navCompleted = true;
                    }
                    case "finish" -> {
                        navCompleted = true;
                        examCompleted = true;
                    }
                    case "select" -> {
                        navSelect();
                        navCompleted = true;
                    }
                    default -> {
                        System.out.println(invalidErrorMessage);
                    }
                }
            } while (!navCompleted);
        }
        //for the rest of the questions
        else {
            System.out.println("Type \"prev,\" \"next,\" or \"select\"");
            do {
                String navInput = keyboard.next().toLowerCase();
                switch (navInput) {
                    case "prev" -> {
                        navCompleted = true;
                    }
                    case "next" -> {
                        navNext();
                        navCompleted = true;
                    }
                    case "select" -> {
                        keyboard.reset();
                        navSelect();
                        navCompleted = true;
                    }
                    default -> {
                        System.out.println(invalidErrorMessage);
                    }
                }
            } while (!navCompleted);
        }
    }

    // ---

    /**
     * How many of the user's answers are correct
     * @return the amount of correct answers
     */
    int totalCorrect() {
        int counter = 0;
        for (int i = 0; i < CORRECT_ANSWERS.length; i++) {
            if (getUserAnswer(i) == getCORRECT_ANSWER(i)) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * ow many of the user's answers are incorrect
     *      * @return the amount of incorrect answers
     */
    int totalIncorrect() {
        int counter = 0;
        for (int i = 0; i < CORRECT_ANSWERS.length; i++) {
            if (getUserAnswer(i) != getCORRECT_ANSWER(i)) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Did the user pass the exam?
     * @return whether the user passed or failed
     */
    boolean quizPassed() {
        return (totalCorrect()>15);
    }

    /**
     * An array of the questions missed
     * @return the missed questions
     */
    int[] questionsMissed() {
        int[] missed = new int[totalIncorrect()];
        int key = 0;
        {
            for (int i = 0; i < CORRECT_ANSWERS.length; i++) {
                if (getUserAnswer(i) != getCORRECT_ANSWER(i)) {
                    missed[key] = i+1;
                    key++;
                }
            }
        }
        return missed;
    }
}
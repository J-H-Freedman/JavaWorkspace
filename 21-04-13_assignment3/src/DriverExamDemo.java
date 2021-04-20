public class DriverExamDemo {
    public static void main(String[] args) {
        DriverExam studentExam = new DriverExam();
        // Welcome!
        System.out.println("Welcome to the Driver Exam!");
        // The quiz:
        do {
            System.out.println("Question " + (studentExam.navTracker + 1) + " of " + (DriverExam.CORRECT_ANSWERS.length)
                    + ": " + DriverExam.CORRECT_ANSWERS[studentExam.navTracker]);
            studentExam.answerQuestion(studentExam.navTracker);
            studentExam.navMenu();
        } while (!studentExam.examCompleted);
        System.out.println("Thank you for completing the exam!");

        // Grading and analysis
        if (studentExam.quizPassed()) {
            System.out.print("Congratulations! You passed with ");
        } else {
            System.out.print("Ah shoot! You failed with ");
        }
        System.out.println(
                studentExam.totalCorrect() + " question(s) answered correctly, " +
                        studentExam.totalIncorrect() + " question(s) answered incorrectly.");
        if (studentExam.totalIncorrect() > 0) {
            System.out.println("Here is a list of the missed question(s): ");
            System.out.print(studentExam.questionsMissed()[0]);
            if (studentExam.questionsMissed().length > 1) {
                for (int i = 1; i < studentExam.questionsMissed().length; i++) {
                    System.out.print(", " + studentExam.questionsMissed()[i]);
                }
            }
        }
        // goodbye
        if (!studentExam.quizPassed()) {
            System.out.print("\nBetter luck next time!");
        }
        System.out.print("\nThank you for taking the exam.");
    }
}
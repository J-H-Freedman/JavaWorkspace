public class DriverExamDemo {
    public static void main(String[] args) {
        DriverExam studentExam = new DriverExam();

        do {
            System.out.println("Question " + (studentExam.navTracker+1) + " of " + (DriverExam.CORRECT_ANSWERS.length)
                    + ": " + DriverExam.CORRECT_ANSWERS[studentExam.navTracker]);
            studentExam.answerQuestion(studentExam.navTracker);
            studentExam.navMenu();
        } while (!studentExam.examCompleted);
        System.out.println("Thank you for completing the exam!");
    }
}
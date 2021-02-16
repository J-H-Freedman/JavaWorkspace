import java.util.Scanner;

class TaxCalc {
  public static void main(String[] args) {
    //initialize keyboard input
    Scanner keyboard = new Scanner(System.in);

    //recieve subtotal
    System.out.println("What is the subtotal for your purchase?");
    double subtotal = keyboard.nextDouble();

    //claculate total
    double salestax = subtotal * 0.02;
    double statetax = subtotal * 0.04;
    double total = subtotal + salestax + statetax;

    //print result
    System.out.printf("With the state tax of $%1.2f and the slaes tax of $%1.2f the total is $%1.2f", statetax, salestax, total);
  }
}
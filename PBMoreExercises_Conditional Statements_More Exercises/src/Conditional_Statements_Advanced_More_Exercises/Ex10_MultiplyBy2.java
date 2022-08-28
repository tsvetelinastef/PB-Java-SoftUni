package Conditional_Statements_Advanced_More_Exercises;

import java.util.Scanner;

public class Ex10_MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      //  boolean isPositive =
        double x = 0;
        for (int i = 1; i > 0; i++) {
            x= Double.parseDouble(scanner.nextLine());
            if (x< 0) {
                System.out.println("Negative number!");
                break;
            } else {
                System.out.printf("Result: %.2f%n",x*2);
            }
        }




    }
}

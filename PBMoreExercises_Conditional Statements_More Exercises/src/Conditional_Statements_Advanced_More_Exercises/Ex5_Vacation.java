package Conditional_Statements_Advanced_More_Exercises;

import java.util.Scanner;

public class Ex5_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        if (budget <= 1000) {
            if (season.equals("Summer")) {
                double percent = 0.65 * budget;
                System.out.printf("Alaska - Camp - %.2f", percent);
            } else if (season.equals("Winter")) {
                double percent = 0.45 * budget;
                System.out.printf("Morocco - Camp - %.2f", percent);
            }

        } else if (budget > 1000 && budget <= 3000) {
            if (season.equals("Summer")) {
                double percent = 0.80 * budget;
                System.out.printf("Alaska - Hut - %.2f", percent);
            }  else if (season.equals("Winter")) {
                double percent = 0.60 * budget;
                System.out.printf("Morocco - Hut - %.2f", percent);
            }
        } else if (budget > 3000) {
            if (season.equals("Summer")) {
                double percent = 0.90 * budget;
                System.out.printf("Alaska - Hotel - %.2f", percent);
            }  else if (season.equals("Winter")) {
                double percent = 0.90 * budget;
                System.out.printf("Morocco - Hotel - %.2f", percent);
            }
        }




    }
}

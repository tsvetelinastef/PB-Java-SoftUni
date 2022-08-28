package Conditional_Statements_Advanced_More_Exercises;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        if (budget <= 100) {

            System.out.println("Economy class");


            if (season.equals("Summer")) {
                double price = 0.35 * budget;
                System.out.printf("Cabrio - %.2f", price);

            } else  if (season.equals("Winter")) {
                double price = 0.65 * budget;
                System.out.printf("Jeep - %.2f", price);
            }


        } else if (budget >= 100  &&  budget <= 500) {

            System.out.println("Compact class");


            if (season.equals("Summer")) {
                double price = 0.45 * budget;
                System.out.printf("Cabrio - %.2f", price);

            } else if (season.equals("Winter")) {
                double price = 0.80 * budget;
                System.out.printf("Jeep - %.2f", price);

            }

        } else if (budget >= 500) {

            System.out.println("Luxury class");


            if (season.equals("Summer") || season.equals("Winter")) {
                double price = 0.90 * budget;
                System.out.printf("Jeep - %.2f", price);
            }

        }


        
    }

}

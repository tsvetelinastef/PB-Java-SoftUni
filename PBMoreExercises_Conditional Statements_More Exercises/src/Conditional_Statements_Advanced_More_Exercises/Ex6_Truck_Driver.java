package Conditional_Statements_Advanced_More_Exercises;

import java.util.Scanner;

public class Ex6_Truck_Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmMonthly = Double.parseDouble(scanner.nextLine());

        double finalSum = 0.0;

        if (kmMonthly <= 5000) {
            if (season.equals("Spring")) { //  if (season.equals("Spring") || season.equals("Autumn"))
                double price = 0.75 * kmMonthly;
                double sum = price * 4;
                double finalPercent = sum * 0.1;
                finalSum = sum - finalPercent;

            } else if (season.equals("Autumn")) {
                double price = 0.75 * kmMonthly;
                double sum = price * 4;
                double finalPercent = sum * 0.1;
                finalSum = sum - finalPercent;

            } else if (season.equals("Summer")) {
                double price = 0.90 * kmMonthly;
                double sum = price * 4;
                double finalPercent = sum * 0.1;
                finalSum = sum - finalPercent;

            } else if (season.equals("Winter")) {
                double price = 1.05 * kmMonthly;
                double sum = price * 4;
                double finalPercent = sum * 0.1;
                finalSum = sum - finalPercent;
            }


     // 5000 < км на месец <= 10000 ---> ПРОВЕРКА
        } else if (5000 < kmMonthly && kmMonthly <= 10000 ) {
            if (season.equals("Spring")) { // season.equals("Spring") || season.equals("Autumn")
                double price = 0.95 * kmMonthly;
                double sum = price * 4;
                double finalPercent = sum * 0.1;
                finalSum = sum - finalPercent;

            }  else if (season.equals("Autumn")) {
                double price = 0.95 * kmMonthly;
                double sum = price * 4;
                double finalPercent = sum * 0.1;
                finalSum = sum - finalPercent;

            } else if (season.equals("Summer")) {
                double price = 1.10 * kmMonthly;
                double sum = price * 4;
                double finalPercent = sum * 0.1;
                finalSum = sum - finalPercent;

            } else if (season.equals("Winter")) {
                double price = 1.25 * kmMonthly;
                double sum = price * 4;
                double finalPercent = sum * 0.1;
                finalSum = sum - finalPercent;
            }



     // 10000 < км на месец <= 20000 ---> ПРОВЕРКА
        } else if (10000 < kmMonthly && kmMonthly <= 20000) {
            if (season.equals("Spring")) { // season.equals("Spring") || season.equals("Autumn") || season.equals("Summer") || season.equals("Winter")
                double price = 1.45 * kmMonthly;
                double sum = price * 4;
                double finalPercent = sum * 0.1;
                 finalSum = sum - finalPercent;

            } else if (season.equals("Autumn")) {
                double price = 1.45 * kmMonthly;
                double sum = price * 4;
                double finalPercent = sum * 0.1;
                finalSum = sum - finalPercent;

            } else if (season.equals("Summer")) {
                double price = 1.45 * kmMonthly;
                double sum = price * 4;
                double finalPercent = sum * 0.1;
                finalSum = sum - finalPercent;

            } else if (season.equals("Winter")) {
                double price = 1.45 * kmMonthly;
                double sum = price * 4;
                double finalPercent = sum * 0.1;
                finalSum = sum - finalPercent;
            }

        }

        System.out.printf("%.2f", finalSum);

    }
}

package Conditional_Statements_Advanced_More_Exercises;

import java.util.Scanner;

public class Ex2_BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorCyclists = Integer.parseInt(scanner.nextLine());
        int seniorCyclists = Integer.parseInt(scanner.nextLine());
        String typeRoute = scanner.nextLine();


        double remain = 0;

        if (typeRoute.equals("trail")) {
            double sum = juniorCyclists * 5.5 + seniorCyclists * 7;
            double expenses = 0.05 * sum;
            remain = sum - expenses;


        } else if (typeRoute.equals("cross-country")) {

            if ((juniorCyclists + seniorCyclists) >= 50) {
                double sum = juniorCyclists * (8 - (8 * 0.25)) + seniorCyclists * (9.5 - (9.5 * 0.25));
               //double expenses = sum - (sum * 0.25);
                double expenses = sum * 0.05;
                remain = sum - expenses;
            } else {
                double sum = juniorCyclists * 8 + seniorCyclists * 9.5;
                double expenses = sum * 0.05;
                remain = sum - expenses;
            }


        } else if (typeRoute.equals("downhill")) {
            double sum = juniorCyclists * 12.25 + seniorCyclists * 13.75;
            double expenses = 0.05 * sum;
            remain = sum - expenses;

        } else if (typeRoute.equals("road")) {
            double sum = juniorCyclists * 20 + seniorCyclists * 21.50;
            double expenses = 0.05 * sum;
            remain = sum - expenses;
        }


        System.out.printf("%.2f", remain);


    }
}

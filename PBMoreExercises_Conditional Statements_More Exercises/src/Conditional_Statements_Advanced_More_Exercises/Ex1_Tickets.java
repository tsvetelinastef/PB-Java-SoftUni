package Conditional_Statements_Advanced_More_Exercises;

import java.util.Scanner;

public class Ex1_Tickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int numberPeopleInGroup = Integer.parseInt(scanner.nextLine());

     //   double transport = 0.0;
        double remain = 0;

        //  double remain = 0.0;



        if (numberPeopleInGroup >= 1 && numberPeopleInGroup <= 4) {
           double transport = budget * 0.75; // 750
            remain = budget - transport; // 250

        } else if (numberPeopleInGroup >= 5 && numberPeopleInGroup <= 9) {
          double  transport = budget * 0.60;
            remain = budget - transport;

        } else if (numberPeopleInGroup >= 10 && numberPeopleInGroup <= 24) {
          double  transport = budget * 0.50;
            remain = budget - transport;

        } else if (numberPeopleInGroup >= 25 && numberPeopleInGroup <= 49) {
          double  transport = budget * 0.40;
            remain = budget - transport;

        } else if (numberPeopleInGroup >= 50) {
          double  transport = budget * 0.25; // transport 12 500
            remain = budget - transport; // 37 500
        }


// double remain = budget - transport;





        if (category.equals("VIP")) {
            double ticket = 499.99 * numberPeopleInGroup;

            if (ticket >= 499.99) {
                double enoughSum = ticket - remain;
                System.out.printf("Not enough money! You need %.2f leva.", enoughSum);

            } else if (ticket <= 499.99) {
                double notEnoughSum = 499.99 - remain;
                System.out.printf("Yes! You have %.2f leva left.", notEnoughSum);
            }

        } else if (category.equals("Normal")) {
            double ticket = 249.99 * numberPeopleInGroup; // 49 998

            if (ticket > 249.99) {
                double enoughSum = Math.abs(249.99 - remain);
                System.out.printf("Not enough money! You need %.2f leva.", enoughSum);

            } else if (ticket <= 249.99) {
                double notEnoughSum =  remain - 249.99;
                System.out.printf("Yes! You have %.2f leva left.", notEnoughSum);
            }


        }




    }
}


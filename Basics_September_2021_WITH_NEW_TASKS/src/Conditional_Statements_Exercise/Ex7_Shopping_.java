package Conditional_Statements_Exercise;

import java.util.Scanner;

public class Ex7_Shopping_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());


        double videoCardsSum = videoCards * 250;


        double processorPrice = videoCardsSum * 0.35;
        double processorSum = processors * processorPrice;


        double ramPrice = videoCardsSum * 0.10;
        double ramSum = ram * ramPrice;


        double allSum = videoCardsSum + processorSum + ramSum;

        if (videoCards > processors) {
            //  allSum = allSum - allSum * 0.15;
            allSum = allSum - allSum * 0.15;
        }

        if (allSum <= budget) {

            System.out.printf("You have %.2f leva left!", budget - allSum);

        } else  {

            // if (allSum >= budget)
            System.out.printf("Not enough money! You need %.2f leva more!", allSum - budget);

        }


    }
}

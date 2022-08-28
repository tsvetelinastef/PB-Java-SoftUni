package NEW_TASKS;

import java.util.Scanner;

public class Ex7_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupNumber = Integer.parseInt(scanner.nextLine()); // брой групи

        // int peopleInGroup1 = Integer.parseInt(scanner.nextLine()); // не въвеждам броя в групата
        // иска ми се колко е процента изкачващи въпросния връх
        int peopleInGroup1 = 0;
        int peopleInGroup2 = 0;
        int peopleInGroup3 = 0;              // ----> процентите
        int peopleInGroup4 = 0;
        int peopleInGroup5 = 0;

        for (int i = 0; i < groupNumber; i++) {
            int numberPeople = Integer.parseInt(scanner.nextLine()); // броя на хората във всяка група

            if (numberPeople <= 5) {
                peopleInGroup1 += numberPeople; // добавяне на човек към тази група
            } else if (numberPeople <= 12) {
                peopleInGroup2 += numberPeople;
            } else if (numberPeople <= 25) {
                peopleInGroup3 += numberPeople;
            } else if (numberPeople <= 40) {
                peopleInGroup4 += numberPeople;
            } else {
                peopleInGroup5 += numberPeople;
            }
        }

        int sumAllPeople = peopleInGroup1 + peopleInGroup2 + peopleInGroup3 + peopleInGroup4 + peopleInGroup5;
        System.out.printf("%.2f%%%n", peopleInGroup1 * 1.0 / sumAllPeople * 100);
        System.out.printf("%.2f%%%n", peopleInGroup2 * 1.0 / sumAllPeople * 100);
        System.out.printf("%.2f%%%n", peopleInGroup3 * 1.0 / sumAllPeople * 100);
        System.out.printf("%.2f%%%n", peopleInGroup4 * 1.0 / sumAllPeople * 100);
        System.out.printf("%.2f%%%n", peopleInGroup5 * 1.0 / sumAllPeople * 100);

    }
}



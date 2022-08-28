package Original_Exam_1;

import java.util.Scanner;

public class Ex3_Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int people = Integer.parseInt(scanner.nextLine()); //  брой хора
        String season = scanner.nextLine(); // сезон

        double allSum = 0.0;

        switch (season) {
            case "spring":
                if (people <= 5){
                    allSum = people * 50.00;
                } else if(people >= 5) {
                    allSum = people * 48.00;
                }
                break;
            case "summer":
                if (people <= 5) {
                    allSum = (people * 48.50) - ((15 * 1.0/ 100) * (people * 48.50)) ;
                    // double withDiscount = allSum - ((15 * 1.0/ 100) * allSum);
                } else if(people > 5) {
                    allSum = (people * 45.00) - ((15 * 1.0/ 100) * (people * 45.00));
                    // double withDiscount = allSum - ((15 * 1.0/ 100) * allSum);
                }
                break;
            case "autumn":
                if (people <= 5) {
                    allSum = people * 60.00;
                } else if (people > 5) {
                    allSum = people * 49.50;
                }
                break;
            case "winter":
                if (people <= 5) {
                    allSum = (people * 86.00) + ((8 * 1.0/ 100) * (people * 86.00) ) ;
                    // double withDiscount = allSum - ((8 * 1.0/ 100) * allSum);
                } else if (people > 5){
                    allSum = (people * 85.00) + ((8 * 1.0/ 100) *(people * 85.00) ) ;
                    //  double withDiscount = allSum + ((8 * 1.0/ 100) * allSum);
                }
                break;
        }

        System.out.printf("%.2f leva.", allSum);

    }
}

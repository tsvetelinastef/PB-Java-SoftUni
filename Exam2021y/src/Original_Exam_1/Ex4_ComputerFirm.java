package Original_Exam_1;

import java.util.Scanner;

public class Ex4_ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double sales = 0.0;
        double all = 0.0;

      //  int rating = Integer.parseInt(scanner.nextLine());

        for (int rating = 0; rating < n ; rating++) {
            rating = Integer.parseInt(scanner.nextLine());




            if (rating % 10 == 0){
                double possibleSales = rating - (rating * 0.02);
                sales += possibleSales;

            } else if (rating % 100 == 0) {
                double possibleSales = rating - (rating * 0.50);
                sales += possibleSales;

            } else if (rating % 1000 == 0) {
                double possibleSales = rating - (rating * 0.70);
                sales += possibleSales;

            } else if (rating % 10000 == 0) {
                double possibleSales = rating - (rating * 0.85);
                sales += possibleSales;

            } else if (rating % 100000 == 0) {
                double possibleSales = rating - (rating * 1.0);
                sales += possibleSales;

            }

           all = sales / n;


        }

        System.out.printf("%.2f", sales);
        System.out.printf("%.2f", all);




    }
}

//
//int n = Integer.parseInt(scanner.nextLine()); // моделите компютри

// int sum = 0;
// for (int number = 1; number <= n ; number++) {
//   int value = Integer.parseInt(scanner.nextLine());
//  sum = sum + value;
// }
// System.out.println(sum);

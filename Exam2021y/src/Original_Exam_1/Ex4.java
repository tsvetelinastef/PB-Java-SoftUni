package Original_Exam_1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine()); // моделите компютри

        double sales = 0.0;
        double possibleSales = 0.0;
         double allSales = 0.0;
         double avgSumSales = 0.0;


        for (int number = 1; number <= n ; number++) {
            int value = Integer.parseInt(scanner.nextLine());


            if (value % 10 == 2) {
                 possibleSales = (value - (value % 10)) * 0.002;
                allSales = possibleSales * n;
                sales++;
                avgSumSales = sales/n;

            } else if (value % 100 == 3) {
                // possibleSales = value - (value * 0.50);
                possibleSales = (value - (value % 100 )) * 0.05;
                 allSales = possibleSales * n;
               // avgSumSales = (3.0 + 3.0 + 3.0) / n;
                sales++;
                avgSumSales = sales/n;

            } else if (value % 1000 == 4) {
                 possibleSales = (value - (value % 1000)) * 0.070;
                allSales = possibleSales * n;
                sales++;
                avgSumSales = sales/n;

            } else if (value % 10000 == 5) {
                 possibleSales =( value - (value % 10000)) * 0.085;
                allSales = possibleSales * n;
                sales++;
                avgSumSales = sales/n;

            } else if (value % 100000 == 6) {
                 possibleSales = (value - (value % 100000)) * 10.0;
                allSales = possibleSales * n;
                sales++;
                avgSumSales = sales/n;

            }

           // possibleSales = sales / n;



        }


        System.out.printf("%.2f%n", allSales);
        System.out.printf("%.2f%n", avgSumSales);




    }
}



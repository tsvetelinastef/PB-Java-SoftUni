package Conditional_Statements_Advanced_More_Exercises;

import java.util.Scanner;

public class Ex3_Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();


        double discount = 0;
        double finalPrice = 0;




        if (season.equals("Spring") || season.equals("Summer")) {

            double price = chrysanthemums * 2.00 + roses * 4.10 + tulips * 2.50;

            if (holiday.equals("Y")) {

                double weekday = price + price * 0.15;

                if (tulips > 7) {

                    discount = weekday - (weekday * 0.05);
                }
                if ((chrysanthemums + roses + tulips) > 20) {

                    discount = weekday - (weekday * 0.20);
                }

                 finalPrice = discount + 2;


            } else if (holiday.equals("N")) {
                // double weekday = price;

               if (tulips > 7) {

                    discount = price - (price * 0.05);
                }

                if ((chrysanthemums + roses + tulips) > 20) {

                    discount = price - (price * 0.20);
                }

                finalPrice = discount + 2;

            }






        } else if (season.equals("Autumn") || season.equals("Winter")) {

            double price = chrysanthemums * 3.75 + roses * 4.50 + tulips * 4.15; // 93.6

            if (holiday.equals("Y")) {

                if (roses >= 10) {

                    discount = price - (price * 0.10);
                }
                if ((chrysanthemums + roses + tulips) > 20) {

                    discount = price - (price * 0.20);
                }

                 finalPrice = discount + 2;

            } else if (holiday.equals("N")) {

                if (roses > 10) {

                    discount = price - (price * 0.20); // 74.88
                    //   discount = price;
                }
                if (roses <= 10) {

                    discount = price - (price * 0.10); //
                }

                if ((chrysanthemums + roses + tulips) >= 20) {

                    discount = discount - (discount * 0.20); // 89.28
                    //   discount = price - (price * 0.20);
                }

                finalPrice = discount + 2;

            }
        }


        System.out.printf("%.2f", finalPrice);


    }
}





       /*         if (roses >= 10) {

                    discount = price - (price * 0.10); // price 124, discount 111.6

                 //   discount = price;
                }

                if ((chrysanthemums + roses + tulips) > 20) {

                    discount = discount - (discount * 0.20); // 89.28
                 //   discount = price - (price * 0.20);
                }

       */

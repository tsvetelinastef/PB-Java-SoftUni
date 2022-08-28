package Conditional_Statements_Advanced_More_Exercises;

import java.util.Scanner;

public class Ex7_SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String typeGroup = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double finalPrice = 0.0;

        if (season.equals("Spring")) {

            if (typeGroup.equals("girls")) {
                double nightPrice = students * 7.20 * nights;

                if (students >= 50) {
                     double discount = nightPrice * 0.50;
                     finalPrice = nightPrice - discount;

                } else if (students >= 20 && students < 50) {
                    double discount = nightPrice * 0.15;
                    finalPrice = nightPrice - discount;

                } else if (students >= 10 && students < 20) {
                     double discount = nightPrice * 0.05;
                     finalPrice = nightPrice - discount;
                }

                 System.out.printf("Athletics %.2f lv.", finalPrice );




            } else if (typeGroup.equals("boys")) {
                double nightPrice = students * 7.20 * nights;

                if (students >= 50) {
                    double discount = nightPrice * 0.50;
                    finalPrice = nightPrice - discount;

                } else if (students >= 20 && students < 50) {
                    double discount = nightPrice * 0.15;
                    finalPrice = nightPrice - discount;

                } else if (students >= 10 && students < 20) {
                    double discount = nightPrice * 0.05;
                    finalPrice = nightPrice - discount;
                }

                System.out.printf("Tennis %.2f lv.", finalPrice );




            } else if (typeGroup.equals("mixed")) {
                double nightPrice = students * 9.50 * nights;

                if (students >= 50) {
                    double discount = nightPrice * 0.50;
                    finalPrice = nightPrice - discount;

                } else if (students >= 20 && students < 50) {
                    double discount = nightPrice * 0.15;
                    finalPrice = nightPrice - discount;

                } else if (students >= 10 && students < 20) {
                    double discount = nightPrice * 0.05;
                    finalPrice = nightPrice - discount;
                }

                System.out.printf("Cycling %.2f lv.", finalPrice );


            }


        } else if (season.equals("Winter")) {

            if (typeGroup.equals("girls")) {
                double nightPrice = students * 9.60 * nights;

                if (students >= 50) {
                    double discount = nightPrice * 0.50;
                    finalPrice = nightPrice - discount;

                } else if (students >= 20 && students < 50) {
                    double discount = nightPrice * 0.15;
                    finalPrice = nightPrice - discount;

                } else if (students >= 10 && students < 20) {
                    double discount = nightPrice * 0.05;
                    finalPrice = nightPrice - discount;
                }

                System.out.printf("Gymnastics %.2f lv.", finalPrice );




            } else if (typeGroup.equals("boys")) {
                double nightPrice = students * 9.60 * nights;

                if (students >= 50) {
                    double discount = nightPrice * 0.50;
                    finalPrice = nightPrice - discount;

                } else if (students >= 20 && students < 50) {
                    double discount = nightPrice * 0.15;
                    finalPrice = nightPrice - discount;

                } else if (students >= 10 && students < 20) {
                    double discount = nightPrice * 0.05;
                    finalPrice = nightPrice - discount;
                }

                System.out.printf("Judo %.2f lv.", finalPrice );




            } else if (typeGroup.equals("mixed")) {
                double nightPrice = students * 10.0 * nights;

                if (students >= 50) {
                    double discount = nightPrice * 0.50;
                    finalPrice = nightPrice - discount;

                } else if (students >= 20 && students < 50) {
                    double discount = nightPrice * 0.15;
                    finalPrice = nightPrice - discount;

                } else if (students >= 10 && students < 20) {
                    double discount = nightPrice * 0.05;
                    finalPrice = nightPrice - discount;

                }

                finalPrice = nightPrice;

               System.out.printf("Ski %.2f lv.", finalPrice );
             //   System.out.printf("Ski %.2f lv.", nightPrice );
            }




        } else if (season.equals("Summer")) {

            if (typeGroup.equals("girls")) {
                double nightPrice = students * 15.0 * nights;

                if (students >= 50) {
                    double discount = nightPrice * 0.50;
                    finalPrice = nightPrice - discount;

                } else if (students >= 20 && students < 50) {
                    double discount = nightPrice * 0.15;
                    finalPrice = nightPrice - discount;

                } else if (students >= 10 && students < 20) {
                    double discount = nightPrice * 0.05;
                    finalPrice = nightPrice - discount;
                }

                System.out.printf("Volleyball %.2f lv.", finalPrice );




            } else if (typeGroup.equals("boys")) {
                double nightPrice = students * 15.0 * nights;

                if (students >= 50) {
                    double discount = nightPrice * 0.50;
                    finalPrice = nightPrice - discount;

                } else if (students >= 20 && students < 50) {
                    double discount = nightPrice * 0.15;
                    finalPrice = nightPrice - discount;

                } else if (students >= 10 && students < 20) {
                    double discount = nightPrice * 0.05;
                    finalPrice = nightPrice - discount;
                }

                System.out.printf("Football %.2f lv.", finalPrice );




            } else if (typeGroup.equals("mixed")) {
                double nightPrice = students * 20.0 * nights;

                if (students >= 50) {
                    double discount = nightPrice * 0.50;
                    finalPrice = nightPrice - discount;

                } else if (students >= 20 && students < 50) {
                    double discount = nightPrice * 0.15;
                    finalPrice = nightPrice - discount;

                } else if (students >= 10 && students < 20) {
                    double discount = nightPrice * 0.05;
                    finalPrice = nightPrice - discount;
                }

                System.out.printf("Swimming %.2f lv.", finalPrice );

            }


        }


    }
}

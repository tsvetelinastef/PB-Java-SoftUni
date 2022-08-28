package NEW_TASKS;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = Double.parseDouble(scanner.nextLine());

        double pricePerFruit = 0.0;
         double finalPrice = 0;
                 // quantity * pricePerFruit;

        switch(dayOfWeek) {  // Monday / Tuesday / Wednesday / Thursday / Friday
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")) {
                    pricePerFruit = 2.50;
                    finalPrice = price * pricePerFruit;

                    System.out.printf("%.2f", finalPrice);

                } else if (fruit.equals("apple")) {
                    pricePerFruit = 1.20;
                    finalPrice = price * pricePerFruit;

                    System.out.printf("%.2f", finalPrice);

                } else if (fruit.equals("orange")) {
                    pricePerFruit = 0.80;
                    finalPrice = price * pricePerFruit;

                    System.out.printf("%.2f", finalPrice);

                } else if (fruit.equals("grapefruit")) {
                    pricePerFruit = 1.45;
                    finalPrice = price * pricePerFruit;

                    System.out.printf("%.2f", finalPrice);

                } else if (fruit.equals("kiwi")) {
                    pricePerFruit = 2.70;
                    finalPrice = price * pricePerFruit;

                    System.out.printf("%.2f", finalPrice);

                } else if (fruit.equals("pineapple")) {
                    pricePerFruit = 5.50;
                    finalPrice = price * pricePerFruit;

                    System.out.printf("%.2f", finalPrice);

                } else if (fruit.equals("grapes")) {
                    pricePerFruit = 3.85;
                    finalPrice = price * pricePerFruit;

                    System.out.printf("%.2f", finalPrice);

                } else {
                    //System.out.printf("%.2f", finalPrice);
                    System.out.println("error");
                }
                break;
            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")) {
                    pricePerFruit = 2.70;
                    finalPrice = price * pricePerFruit;

                    System.out.printf("%.2f", finalPrice);

                } else if (fruit.equals("apple")) {
                    pricePerFruit = 1.25;
                    finalPrice = price * pricePerFruit;

                    System.out.printf("%.2f", finalPrice);

                } else if (fruit.equals("orange")) {
                    pricePerFruit = 0.90;
                    finalPrice = price * pricePerFruit;

                    System.out.printf("%.2f", finalPrice);

                } else if (fruit.equals("grapefruit")) {
                    pricePerFruit = 1.60;
                    finalPrice = price * pricePerFruit;

                    System.out.printf("%.2f", finalPrice);

                } else if (fruit.equals("kiwi")) {
                    pricePerFruit = 3.00;
                    finalPrice = price * pricePerFruit;

                    System.out.printf("%.2f", finalPrice);

                } else if (fruit.equals("pineapple")) {
                    pricePerFruit = 5.60;
                    finalPrice = price * pricePerFruit;

                    System.out.printf("%.2f", finalPrice);

                } else if (fruit.equals("grapes")) {
                    pricePerFruit = 4.20;
                    finalPrice = price * pricePerFruit;

                    System.out.printf("%.2f", finalPrice);

                } else {
                   // System.out.printf("%.2f", finalPrice);
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }


       // System.out.printf("%.2f", finalPrice);

    }
}

package MORE_EXERCISES;

import java.util.Scanner;

public class Ex9_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String accommodation = scanner.nextLine();
        String feedback = scanner.nextLine();

        double pricePerNight = 0;
        int nights = days - 1;
        double discount = 0.0;


        switch (accommodation) {
            case "room for one person":
                pricePerNight = 18.00;
                break;
            case "apartment":
                pricePerNight = 25.00;
                if (nights < 10) {
                    discount = 0.30;
                } else if (nights <= 15) {
                    discount = 0.35;
                } else {
                    discount = 0.50;
                }
                break;
            case "president apartment":
                pricePerNight = 35.00;
                if (nights < 10) {
                    discount = 0.10;
                } else if (nights <= 15) {
                    discount = 0.15;
                } else {
                    discount = 0.20;
                }
                break;
        }

        double totalPrice = pricePerNight * nights;
        totalPrice = totalPrice - totalPrice * discount;

        switch (feedback) {
            case "positive":
                totalPrice *= 1.25;
                break;
            case "negative":
                totalPrice *= 0.90;
                break;
        }
        System.out.printf("%.2f", totalPrice);


    }
}

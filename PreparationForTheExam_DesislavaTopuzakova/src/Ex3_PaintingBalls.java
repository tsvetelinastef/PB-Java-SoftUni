import java.util.Scanner;

public class Ex3_PaintingBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //печалба = цена за партида (броя и цвета) * бр. партиди
        //крайна сума = печалба - разходи (35 % от печалбата)

        String sizeEggs = scanner.nextLine(); // "Large", "Medium" или "Small"
        String colorEggs = scanner.nextLine(); // "Red", "Green" или "Yellow"
        int count = Integer.parseInt(scanner.nextLine()); // брой партидите

        double price = 0; // цена на партидата

        switch (sizeEggs) {
            case "Large":
                //проверка за цвета
                if (colorEggs.equals("Red")) {
                    price = 16;
                } else if (colorEggs.equals("Green")) {
                    price = 12;
                } else if (colorEggs.equals("Yellow")) {
                    price = 9;
                }
                break;

            case "Medium":
                //проверка за цвета
                if (colorEggs.equals("Red")) {
                    price = 13;
                } else if (colorEggs.equals("Green")) {
                    price = 9;
                } else if (colorEggs.equals("Yellow")) {
                    price = 7;
                }
                break;

            case "Small":
                // проверка за цвета
                if (colorEggs.equals("Red")) {
                    price = 9;
                } else if (colorEggs.equals("Green")) {
                    price = 8;
                } else if (colorEggs.equals("Yellow")) {
                    price = 5;
                }
                break;
        }

        double profit = count * price; //
        double expenses = 0.35 * profit; //
        double finalPrice = profit - expenses; //

        System.out.printf("%.2f leva.", finalPrice);


    }
}

import java.util.Scanner;

public class Ex11_NOOO_FruitShop_Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double pricePerFruit = 0;
       // double finalPrice = quantity * pricePerFruit;


        switch(dayOfWeek) {  // Monday / Tuesday / Wednesday / Thursday / Friday
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")) {
                    pricePerFruit = 2.50;
                } else if (fruit.equals("apple")) {
                    pricePerFruit = 1.20;
                } else if (fruit.equals("orange")) {
                    pricePerFruit = 0.80;
                } else if (fruit.equals("grapefruit")) {
                    pricePerFruit = 1.45;
                } else if (fruit.equals("kiwi")) {
                    pricePerFruit = 2.70;
                } else if (fruit.equals("pineapple")) {
                    pricePerFruit = 5.50;
                } else if (fruit.equals("grapes")) {
                    pricePerFruit = 3.85;
                } else {
                    System.out.println("error");
                }
                break;
            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")) {
                    pricePerFruit = 2.70;
                } else if (fruit.equals("apple")) {
                    pricePerFruit = 1.25;
                } else if (fruit.equals("orange")) {
                    pricePerFruit = 0.90;
                } else if (fruit.equals("grapefruit")) {
                    pricePerFruit = 1.60;
                } else if (fruit.equals("kiwi")) {
                    pricePerFruit = 3.00;
                } else if (fruit.equals("pineapple")) {
                    pricePerFruit = 5.60;
                } else if (fruit.equals("grapes")) {
                    pricePerFruit = 4.20;
                } else {
                    System.out.println("error");
                }
               break;
        }
       // default:
       // System.out.println("error");
       // break;

        switch(dayOfWeek){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
            case "Sunday":
            case "banana":
            case "apple":
            case "orange":
            case "grapefruit":
            case "kiwi":
            case "pineapple":
            case "grapes":
               // double finalPrice = quantity * pricePerFruit;
                System.out.printf("%.2f",pricePerFruit);
                break;
            default:
                System.out.println("error");
                break;
        }

       // System.out.println(finalPrice);
    }
}

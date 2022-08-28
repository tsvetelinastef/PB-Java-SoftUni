import java.util.Scanner;

public class Ex6_Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodLeftKg = Integer.parseInt(scanner.nextLine());
        double foodDogKg = Double.parseDouble(scanner.nextLine());
        double foodCatKg = Double.parseDouble(scanner.nextLine());
        double foodTurtleGr = Double.parseDouble(scanner.nextLine());

        double foodNeededDog = days * foodDogKg;
        double foodNeededCat = days * foodCatKg;
        double foodNeededTurtle = (days * foodTurtleGr) / 1000;

        double allFood = foodNeededDog + foodNeededCat + foodNeededTurtle;

        if (allFood <= foodLeftKg) {
           double foodLeft = Math.floor(foodLeftKg - allFood);
            System.out.printf("%.0f kilos of food left.", foodLeft);
        } else {
            double foodNeeded = Math.ceil(allFood - foodLeftKg);
            System.out.printf("%.0f more kilos of food are needed.", foodNeeded);
        }



    }
}

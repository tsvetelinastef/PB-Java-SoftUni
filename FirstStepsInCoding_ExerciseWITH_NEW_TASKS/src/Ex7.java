import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double chicken = 10.35;
        double fish = 12.40;
        double vegetarian = 8.15;


        int chickenMeal = Integer.parseInt(scanner.nextLine());
        int fishMeal = Integer.parseInt(scanner.nextLine());
        int vegetarianMeal = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chickenMeal * chicken;
        double fishPrice = fishMeal * fish;
        double vegetarianPrice = vegetarianMeal * vegetarian ;
        double allPrice = chickenPrice + fishPrice + vegetarianPrice;

        double desert = allPrice * 0.20;
        double delivery = 2.50;

        double price = desert + allPrice + delivery;

        System.out.println(price);
      //  System.out.printf("%.2f",Price);
    }
}

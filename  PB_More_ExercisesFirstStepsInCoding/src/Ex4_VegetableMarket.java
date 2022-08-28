import java.util.Scanner;

public class Ex4_VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceVegetables = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        int totalKgVegetables = Integer.parseInt(scanner.nextLine());
        int totalKgFruits = Integer.parseInt(scanner.nextLine());

        double vegetablesCost = priceVegetables * totalKgVegetables;
        double fruitsCost = priceFruits * totalKgFruits;
        double total = (vegetablesCost + fruitsCost) / 1.94;

        System.out.printf("%.2f", total);
    }
}

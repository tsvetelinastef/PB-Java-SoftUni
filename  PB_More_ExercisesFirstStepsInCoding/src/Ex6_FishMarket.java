import java.util.Scanner;

public class Ex6_FishMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceMackerel = Double.parseDouble(scanner.nextLine()); // lv
        double priceSprats = Double.parseDouble(scanner.nextLine());
        double bonitoKg = Double.parseDouble(scanner.nextLine());  // kg
        double horseMackerelKg = Double.parseDouble(scanner.nextLine());
        int musselsKg = Integer.parseInt(scanner.nextLine());

        double priceBonito = priceMackerel + priceMackerel * 0.60;
        double sumBonito = bonitoKg * priceBonito;
        double priceHorseMackerel = priceSprats + priceSprats * 0.80;
        double sumHorseMackerel = horseMackerelKg * priceHorseMackerel;
        double sumMussels = musselsKg * 7.50;
        double total = sumBonito + sumHorseMackerel + sumMussels;

        System.out.printf("%.2f", total);
    }
}

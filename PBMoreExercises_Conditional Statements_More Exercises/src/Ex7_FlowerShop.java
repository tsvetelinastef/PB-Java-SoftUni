import java.util.Scanner;

public class Ex7_FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double gift = Double.parseDouble(scanner.nextLine());

        double sum = magnolias * 3.25 + hyacinths * 4 + roses * 3.5 + cactus * 8;

        double taxes = 0.05 * sum;
        double profit = sum - taxes;

        if (gift > profit){
            double moneyNeeded = Math.ceil(gift - profit);
            System.out.printf("She will have to borrow %.0f leva.", moneyNeeded);
        } else {
            double moneyRemain = Math.floor(profit - gift);
            System.out.printf("She is left with %.0f leva.", moneyRemain);
        }

    }
}

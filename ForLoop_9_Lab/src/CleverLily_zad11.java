import java.util.Scanner;

public class CleverLily_zad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine()); // годините на Лили
        double washer = Double.parseDouble(scanner.nextLine()); // цената на пералнята
        int priceToy = Integer.parseInt(scanner.nextLine()); // цената за една играчка

        int toys = 0; // броим играчки
        double allMoney = 0.0;
        double saveMoney = 0.0; // спестените пари без парите, които брат ѝ и е взел

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                allMoney = allMoney + 10; // allMoney += 10;
                saveMoney = saveMoney + allMoney - 1; // парите, които брат ѝ е взел
            } else { // за нечетен рожден ден
                toys++;
            }
        }

        double totalSum = toys * priceToy + saveMoney;
        if (totalSum >= washer) {
            System.out.printf("Yes! %.2f", totalSum - washer);
        } else {
            System.out.printf("No! %.2f", washer - totalSum);
        }



    }
}

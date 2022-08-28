package Original_Exam_1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pocketsPerDay = Double.parseDouble(scanner.nextLine()); //  джобните на Тереза на ден
        double moneyEarnsPerDaySales = Double.parseDouble(scanner.nextLine()); //  парите, които тя печели на ден от продажби
        double expensesForWholePeriod = Double.parseDouble(scanner.nextLine()); //  разходите на Тереза за целия период
        double priceGift = Double.parseDouble(scanner.nextLine()); //  цената на подаръка

        double pocketMoneySaved = 5 * pocketsPerDay; //
        double earnedMoney = 5 * moneyEarnsPerDaySales;

        double allSavedMoney = pocketMoneySaved + earnedMoney;

        double moneyWithoutExpenses = allSavedMoney - expensesForWholePeriod;

        if (moneyWithoutExpenses > priceGift) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", moneyWithoutExpenses);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", priceGift - moneyWithoutExpenses);
        }




    }
}

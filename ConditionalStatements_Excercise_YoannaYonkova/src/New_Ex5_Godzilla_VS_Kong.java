import java.util.Scanner;

public class New_Ex5_Godzilla_VS_Kong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                double  filmBudget = Double.parseDouble(scanner.nextLine());
                int statists = Integer.parseInt(scanner.nextLine());
                double priceClothing = Double.parseDouble(scanner.nextLine());


                //Сума за декор: 10% от 20000 = 2000 лв.
                double sumDecor = filmBudget * 0.1;

                // Сума за облекло: 120 * 55.5 = 6660 лв.
                double sumClothing = statists * priceClothing;

                if(statists >= 150) {
                    sumClothing = sumClothing - (sumClothing * 0.1);
                }

                // Обща сума за филма: 2000 + 6660 = 8660 лв.
                double allSumForTheFilm = sumDecor + sumClothing;

                // 20000 – 8660 = 11340 лева остават.
                double moneyLeft = filmBudget - allSumForTheFilm;

                // 9587.88 – 12083.652 = 2495.77 лева не достигат
                double moneyNeed = Math.abs (filmBudget - allSumForTheFilm);



                if (allSumForTheFilm > filmBudget) {
                    System.out.println("Not enough money!");
                    System.out.printf("Wingard needs %.2f leva more." ,moneyNeed );
                } else if (allSumForTheFilm <= filmBudget) {
                    System.out.println("Action!");
                    System.out.printf("Wingard starts filming with %.2f leva left." , moneyLeft );
                }

    }
}

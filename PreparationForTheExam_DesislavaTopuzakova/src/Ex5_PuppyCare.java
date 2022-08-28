import java.util.Scanner;

public class Ex5_PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boughtKg = Integer.parseInt(scanner.nextLine());
        int boughtGr = boughtKg * 1000; // закупеното количество храна
        // дали закупеното количество ще стигне за кучето
        int totalEatenGrams = 0; // колко количество е изядено
         // command -> грамове или Adopted
        String command = scanner.nextLine();
        //stop: command == "Adopted" -> command != "Adopted"
        while (!command.equals("Adopted")) {
            // изядени грамове -> command = "130" -> 130
            int eatenGrams = Integer.parseInt(command); // изядени грамове на ядене
            totalEatenGrams += eatenGrams;
            command = scanner.nextLine();
        }

        // проверка дали купеното е достатъчно
        if (boughtGr >= totalEatenGrams) {
            int left = boughtGr - totalEatenGrams;
            System.out.printf("Food is enough! Leftovers: %d grams.", left);
        } else {
            int need = totalEatenGrams - boughtGr;
            System.out.printf("Food is not enough. You need %d grams more.", need);
        }
    }
}

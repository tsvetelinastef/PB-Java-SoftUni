import java.util.Scanner;

public class Ex5_AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalSum = 0;  // може и double totalSum = 0.0; сумата от всички въведени суми на конзолата

        // въвеждаме текстове докато не получим команда "NoMoreMoney"
        // повтаряме: въвеждане на текст
        // спираме: текст == "NoMoreMoney"
        // продължаваме: текст != "NoMoreMoney"
        // може да е под формата на текст 45.67 или "NoMoreMoney"

        String text = scanner.nextLine(); // начална стойност
        while (!text.equals("NoMoreMoney")) {  // докато теста не ни е = на "NoMoreMoney" значи
            // трябва да въвеждаме нов текст
            // сумата -> text == "45.67" -> дробно число
            double sum = Double.parseDouble(text);
            // ако сумата < 0
            if (sum < 0) {
                System.out.println("Invalid operation!");
                break;
            } else {    // ако сумата >= 0
                System.out.printf("Increase: %.2f%n", sum); //вместо(+ sum)-> пиша: , sum (не тр просто да я печатаме)
                totalSum += sum;
            }
            text = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", totalSum);
    }
}

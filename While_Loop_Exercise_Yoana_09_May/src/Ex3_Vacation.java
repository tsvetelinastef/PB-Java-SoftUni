import java.util.Scanner;

public class Ex3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationCost = Double.parseDouble(scanner.nextLine()); // колко струва ваканцията
        double availableCash = Double.parseDouble(scanner.nextLine()); // парите с които ние разполагаме

        int days = 0;  // брояч за всички дни , на изхода имаме отброени дни
        int daysSpend = 0; // брояч за последователните дни в които тя харчи

        while (availableCash < vacationCost && daysSpend < 5) { // и дните в които тя харчи са < 5
            // 5 , защото на изхода имаме:  5 последователни дни
            String action = scanner.nextLine(); // действието - save/ spend
            double cash = Double.parseDouble(scanner.nextLine()); // парите , които о ще спести/похарчи

            days++; // на всяко завъртане на цикъла - дните се увеличават с 1 , имаме и отброяване на изхода

            if (action.equals("spend")) {    // !!!похарчени пари!!!
                availableCash -= cash; // пари, които имаме и трябва да извадим, защото ги харчим , махаме ги
                daysSpend++; // ако влезе в тази if проверка, броячът е станал 1

                if (availableCash < 0) { // ако е по-малко от 0
                    availableCash = 0; // => налични пари = 0
                }
            } else if (action.equals("save")) { // !!! спестени пари!!!
                availableCash += cash; // пари, които имаме и трябва да съберем , защото ги спестяваме , добявяме
                daysSpend = 0; // занулираме
            }
        }

        // отпечатваме

        if (availableCash >= vacationCost) {
            System.out.printf("You saved the money for %d days.", days);
        }
        if (daysSpend == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d",days);
        }

    }
}

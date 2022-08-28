import java.util.Scanner;

public class Ex5_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Входът се чете от конзолата и се състои от два реда, въведени от потребителя:
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String typeVacation = "";

        if (budget <= 100) {   // при 100 лв или по- малко - демек и 100 , тоест и  = 100, щом е При!! ... Think!! ;)
            destination = "Bulgaria";
            if (season.equals("summer")) {
                typeVacation = "Camp";
                budget = budget * 0.30;  //  30% от бюджета
            } else if (season.equals("winter")) {
                typeVacation = "Hotel";
                budget = budget * 0.70;  // 70% от бюджета
            }
        } else if (budget > 100 && budget <= 1000) { // При 1000лв. или по-малко (някъде на Балканите) - 101....1000
            destination = "Balkans";
            if(season.equals("summer")) {
                typeVacation = "Camp";
                budget = budget * 0.40; // 40% от бюджета
            } else if (season.equals("winter")) {
                typeVacation = "Hotel";
                budget = budget * 0.80; // 80% от бюджета
            }
        } else if (budget > 1000) {  // При повече от 1000лв. – някъде из Европа
            destination = "Europe";
            typeVacation = "Hotel";
            budget = budget * 0.90;
        }

        System.out.printf("Somewhere in %s%n", destination); // %s - destination, %n - за нов ред - System.out.println(); /n
        System.out.printf("%s - %.2f", typeVacation, budget);
    }
}

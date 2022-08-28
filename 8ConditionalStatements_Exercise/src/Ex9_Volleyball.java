import java.util.Scanner;

public class Ex9_Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String yearType = scanner.nextLine();
        int vacationDays = Integer.parseInt(scanner.nextLine());
        int weekendsHome = Integer.parseInt(scanner.nextLine());

        double countPlayDays = vacationDays * 2.0 / 3 +
                (48 - weekendsHome) * 3.0 / 4 +
                weekendsHome;

        if (yearType.equals("leap")) {
            countPlayDays *= 1.15;
        }

        System.out.printf("%.0f", Math.floor(countPlayDays));

    }
}

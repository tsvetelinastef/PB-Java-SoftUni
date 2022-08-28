import java.util.Scanner;

public class Ex6_EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countEasterBread = Integer.parseInt(scanner.nextLine());
        int maxPoints = Integer.MIN_VALUE;
        String bestChef = "";

        for (int easterBread = 1; easterBread <= countEasterBread; easterBread++) {
            String chefName = scanner.nextLine();
            int totalGrades = 0;
            String command = scanner.nextLine(); // оценка или Stop
            // стоп: command == "Stop" -> command != "Stop"
            while (!command.equals("Stop")) {
                // оценка -> command = "10" -> 10
                int grade = Integer.parseInt(command);
                totalGrades += grade;

                command = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", chefName, totalGrades);
            // проверка дали този шеф е най-добрия
            if (totalGrades > maxPoints) {
                maxPoints = totalGrades;
                bestChef = chefName;
                System.out.printf("%s is the new number 1!%n", bestChef);
            }

        }

        System.out.printf("%s won competition with %d points!%n", bestChef, maxPoints);

    }
}

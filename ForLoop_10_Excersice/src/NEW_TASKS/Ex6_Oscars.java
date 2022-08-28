package NEW_TASKS;

import java.util.Scanner;

public class Ex6_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorsName = scanner.nextLine();
        double initialPoints = Double.parseDouble(scanner.nextLine());
        int judgesCount = Integer.parseInt(scanner.nextLine());
        double totalPointsFromJudges = 0;

        for (int i = 1; i <= judgesCount; i++) {
            String judgesName = scanner.nextLine();
            double judgesPoints = Double.parseDouble(scanner.nextLine());

            totalPointsFromJudges += (judgesName.length() * judgesPoints) / 2;


            if (totalPointsFromJudges + initialPoints > 1250.50) {
                break;
            }
        }

        if (totalPointsFromJudges + initialPoints > 1250.50) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorsName, totalPointsFromJudges + initialPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorsName, 1250.50 - totalPointsFromJudges - initialPoints);

        }


    }
}


package NEW_TASKS;

import java.util.Scanner;

public class Ex8_TennisRankList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentsHeParticipated = Integer.parseInt(scanner.nextLine()); //  Брой турнири, в които е участвал
        int initialPoints = Integer.parseInt(scanner.nextLine());  // Начален брой точки в ранглистата
        String reachedStageTournament = scanner.nextLine(); // Достигнат етап от турнира

       // initialPoints = 0;
        double percentWinTournaments = 0.0;

        if (reachedStageTournament.equals("W")){
            initialPoints += 2000;
        } else if(reachedStageTournament.equals("F")){
            initialPoints += 1200;
        } else if(reachedStageTournament.equals("SF")) {
            initialPoints += 720;
        }

        double averagePoints = ((initialPoints * 1.0)   * tournamentsHeParticipated)/ tournamentsHeParticipated;

        if (initialPoints == 2000) {
            percentWinTournaments = (initialPoints * 1.0 /tournamentsHeParticipated) * 100;
        }

        System.out.printf("Final points: %.2d", initialPoints);
        System.out.printf("Average points: %.2f", averagePoints);
        System.out.printf("%.2f", percentWinTournaments);

    }
}

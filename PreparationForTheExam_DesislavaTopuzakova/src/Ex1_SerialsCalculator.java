import java.util.Scanner;

public class Ex1_SerialsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // време за 1 епизод с реклами = епизод + рекламите ( 20% от епизод)
        // допълнително време от спец. епизоди = бр. сезони * 10
        // общо време = сезони * бр. епизоди за сезон * вр. за един епизод с реклами + доп. вр. от спец. епизоди

        String seriesName = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double timeForEpisode = Double.parseDouble(scanner.nextLine());

        double totalTimeEpisode = timeForEpisode + 0.2 * timeForEpisode;
        int additionalTime = seasons * 10;

        double totalTime = (seasons * episodes * totalTimeEpisode) + additionalTime;
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", seriesName, Math.floor(totalTime));
    }
}

import java.util.Scanner;

public class Ex2_Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //спечелено време = пъти печели време (общо растояние / 120) * 2.5
        //време за пързаляне = (общ разстояние / 100) * сек за 100 м
        // времето на Марин = време за пързаляне - спечелено време
        // проверим дали времето покрива контролата

        int controlMinutes = Integer.parseInt(scanner.nextLine());
        int controlSeconds = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        int secondsFor100Metres = Integer.parseInt(scanner.nextLine());

        double additionalTime = (length / 120) * 2.5;
        double slopeTime = (length / 100) * secondsFor100Metres;
        double totalTime = slopeTime - additionalTime;

        //контролното време в сек
        int controlTimeSeconds = controlMinutes * 60 + controlSeconds;

        //проверка за квота
        if(totalTime <= controlTimeSeconds) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", totalTime);
        } else {
            double needSeconds = totalTime - controlTimeSeconds;
            System.out.printf("No, Marin failed! He was %.3f second slower.",needSeconds);
        }

    }
}

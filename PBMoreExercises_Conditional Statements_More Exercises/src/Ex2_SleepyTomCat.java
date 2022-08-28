import java.util.Scanner;

public class Ex2_SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int holidays = Integer.parseInt(scanner.nextLine());

        int breakDays = holidays * 127;
        int workdays = (365 - holidays) * 63;
        int realTime = breakDays + workdays;

        int difference = 30000 - realTime;


        if (30000 > realTime) {
            int hours = difference / 60;
            int minutes = difference % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        } else {
            int point = realTime - 30000;
            int hoursOver = point / 60;
            int minutesOver = point % 60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hoursOver, minutesOver);
        }


    }

}

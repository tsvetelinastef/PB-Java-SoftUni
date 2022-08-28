import java.util.Scanner;

public class Ex5_Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hoursNeeded = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int workersOvertime = Integer.parseInt(scanner.nextLine());

        double percentWorkers = days - (days * 0.1);
        double workHours = percentWorkers * 8;
        double additional = workersOvertime * (2 * days);
        double allHours = Math.floor(workHours + additional);


        if (allHours >= hoursNeeded) {
            double enough = allHours - hoursNeeded;
            System.out.printf("Yes!%.0f hours left.", Math.floor(enough));
        } else {
            double notEnough = hoursNeeded - allHours;
            System.out.printf("Not enough time!%.0f hours needed.", Math.floor(notEnough));
        }


    }
}

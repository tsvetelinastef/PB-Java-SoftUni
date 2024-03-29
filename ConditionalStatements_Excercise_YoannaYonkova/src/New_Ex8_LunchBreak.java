import java.util.Scanner;

public class New_Ex8_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
                String serialName = scanner.nextLine();
                int episodeDuration = Integer.parseInt(scanner.nextLine());
                int totalTime = Integer.parseInt(scanner.nextLine());

                // времето за обяд 1/8...
                double lunchTime = totalTime / 8.0;

                //  времето за отдих 1/4...
                double restTime = totalTime / 4.0;

                double neededTime = episodeDuration + lunchTime + restTime;

                if (neededTime <= totalTime) {

                    System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serialName, Math.ceil(totalTime - neededTime));

                } else {

                    System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serialName, Math.ceil(neededTime - totalTime));
                }


    }
}

import java.util.Scanner;

public class Ex7_WorkingHours_Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();


        switch(dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
            if(hour >= 10 && hour <= 18) {
                System.out.println("open");
                break;
            } default:
                System.out.println("closed");
                break;
        }


    }
}

// if (dayOfWeek.equals("Monday") && dayOfWeek.equals("Tuesday")) {
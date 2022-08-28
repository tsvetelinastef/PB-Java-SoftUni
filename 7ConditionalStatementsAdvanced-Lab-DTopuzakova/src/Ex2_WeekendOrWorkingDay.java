import java.util.Scanner;

public class Ex2_WeekendOrWorkingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ден от седмицата -> text
        // Monday, Tuesday, Wednesday, Thursday, Friday -> Working day
        // Saturday, Sunday -> Weekend
        // other -> Error

 /*       String dayOfWeek = scanner.nextLine();
        switch(dayOfWeek) {
            case "Monday":
                System.out.println("Working day");
                break;
            case "Tuesday":
                System.out.println("Working day");
                break;
            case "Wednesday":
                System.out.println("Working day");
                break;
            case "Thursday":
                System.out.println("Working day");
                break;
            case "Friday":
                System.out.println("Working day");
                break;
        }
*/

        //друг начин , за да не повтаряме System.out.println("Working day"); многократно:

        String dayOfWeek = scanner.nextLine();
        switch(dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;
        }

    }
}

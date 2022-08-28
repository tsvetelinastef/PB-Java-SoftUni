import java.util.Scanner;

public class Ex8_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ден от седмицата
        // Monday, Tuesday, Friday -> 12
             // dayOfWeek.equals("Monday")
             // dayOfWeek.equals("Tuesday")
             // dayOfWeek.equals("Friday")
        // Wednesday, Thursday -> 14
             // dayOfWeek.equals("Wednesday")
             // dayOfWeek.equals("Thursday")
        // Saturday, Sunday -> 16
             // dayOfWeek.equals("Saturday")
             // dayOfWeek.equals("Sunday")
        String dayOfWeek = scanner.nextLine();
        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Friday")) { //щом 1 е вярно, цялото нещо е вярно
            System.out.println(12);
        } else if (dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday")) {
            System.out.println(14);
        } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            System.out.println(16);
        }


    }
}

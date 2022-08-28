import java.util.Scanner;

public class Ex8_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minutesArrival = Integer.parseInt(scanner.nextLine());

        int totalMinutes = hourExam * 60 + minutesExam;
        int totalArrivalMinutes = hourArrival * 60 + minutesArrival;


        //int hour = Integer.parseInt(scanner.nextLine());
        //int minutes = Integer.parseInt(scanner.nextLine());
        //int arrivalHour = Integer.parseInt(scanner.nextLine());
        //int arrivalMinutes = Integer.parseInt(scanner.nextLine());

       // int totalMinutes = hour * 60 + minutes;
        //int totalArrivalMinutes = arrivalHour * 60 + arrivalMinutes;

        if (totalMinutes == totalArrivalMinutes) {
            System.out.println("On time");
        } else if (totalArrivalMinutes < totalMinutes) {
            if (totalMinutes - totalArrivalMinutes <= 30) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", totalMinutes - totalArrivalMinutes);
            } else {
                System.out.println("Early");
                if (totalMinutes - totalArrivalMinutes < 60) {
                    System.out.printf("%d minutes before the start", totalMinutes - totalArrivalMinutes);
                } else {
                    hourExam = (totalMinutes - totalArrivalMinutes) / 60;
                    minutesExam = (totalMinutes - totalArrivalMinutes) % 60;
                    System.out.printf("%d:%02d hours before the start", hourExam, minutesExam);
                }
            }
        } else {
            System.out.println("Late");
            if (totalArrivalMinutes - totalMinutes < 60) {
                System.out.printf("%d minutes after the start", totalArrivalMinutes - totalMinutes);
            } else {
                hourExam = (totalArrivalMinutes - totalMinutes) / 60;
                minutesExam = (totalArrivalMinutes - totalMinutes) % 60;
                System.out.printf("%d:%02d hours after the start", hourExam, minutesExam);
            }
        }









    }
}



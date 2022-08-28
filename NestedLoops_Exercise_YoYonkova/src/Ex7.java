import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        double student = 0;
        double standard = 0;
        double kid = 0;
        int totalTickets = 0;
        double numTickets = 0;

        while (!movieName.equals("Finish")) {
            int freeSpades = Integer.parseInt(scanner.nextLine());
            // свободни места за всяка прожекция
            numTickets = 0;

            for (int i = 1; i <= freeSpades; i++) {
                String ticketType = scanner.nextLine();
                if (ticketType.equals("student")) {
                    student++;
                } else if(ticketType.equals("kid")) {
                    kid++;
                } else if(ticketType.equals("standard")) {
                    standard++;
                } else  if (ticketType.equals("End") || numTickets > freeSpades ) {
                    break; // прекратявам програмата
                    // ако стигнем до командата или свободните места свършват -> break;- ни
                }
                // увеличаваме
                numTickets++;
                totalTickets++;
            }
            double percent = numTickets / freeSpades * 100; // заради процента умножен по 100
            System.out.printf("%s - %.2f%% full.%n", movieName, percent);

           movieName = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", student / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standard / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", kid / totalTickets * 100);
    }
}


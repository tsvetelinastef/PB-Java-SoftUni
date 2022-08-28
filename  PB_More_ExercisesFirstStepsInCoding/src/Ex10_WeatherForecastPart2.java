import java.util.Scanner;

public class Ex10_WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degrees = Double.parseDouble(scanner.nextLine());

        if (26.00 <= degrees && degrees <= 35) {
            System.out.println("Hot");
        } else if ( 20.1 <= degrees && degrees <= 25.9) {
            System.out.println("Warm");
        } else if ( 15.00 <= degrees && degrees <= 20.00) {
            System.out.println("Mild");
        } else if ( 12.00 <= degrees && degrees <= 14.9) {
            System.out.println("Cool");
        } else if ( 5.00 <= degrees && degrees <= 11.9) {
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }

    }
}

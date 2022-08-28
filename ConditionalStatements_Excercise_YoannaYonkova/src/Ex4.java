import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 m = 1000mm
        // 1m = 100 cm

        double number = Double.parseDouble(scanner.nextLine());
        String inputMetric = scanner.nextLine();
        String outputMetric = scanner.nextLine();

        if (inputMetric.equals("mm")) {
            number = number / 1000;  // 1 m = 1000 mm
        } else if (inputMetric.equals("cm")) {
            number = number / 100;  // 1 m = 100 cm
        }

        if (outputMetric.equals("mm")) {
            number = number * 1000;
        } else if (outputMetric.equals("cm")) {
            number = number * 100;
        }

        System.out.printf("%.3f", number);  // %.3f -> искаме да закръглим double число до третия знак

    }
}

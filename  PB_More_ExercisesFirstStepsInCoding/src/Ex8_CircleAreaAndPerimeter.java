import java.util.Scanner;

public class Ex8_CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double areaCircle = Math.PI * r * r;
        double perimeterCircle = 2 * Math.PI * r;

        System.out.printf("%.2f%n", areaCircle);
        System.out.printf("%.2f%n", perimeterCircle);
    }
}

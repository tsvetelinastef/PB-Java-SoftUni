import java.util.Scanner;

public class Ex5_TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine()); // in meters
        double h = Double.parseDouble(scanner.nextLine());

        // 3 <= h <= w <= 100

        int wide = (int) ((h * 100) - 100);
    //    double wide = h * 100 - 100;
        int disposeWide = wide / 70;
        //

       int length = (int) (w * 100);
       // double length = w * 100;
       int disposeLength = (int) Math.floor(length / 120);
       //

        double places = disposeWide * disposeLength - 3.0;

        System.out.printf("%.0f", places);
    }
}


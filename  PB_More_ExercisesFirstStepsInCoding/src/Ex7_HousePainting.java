import java.util.Scanner;

public class Ex7_HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double xHeightHouse = Double.parseDouble(scanner.nextLine());
        double yLengthSide = Double.parseDouble(scanner.nextLine());
        double hHeightRoof = Double.parseDouble(scanner.nextLine());

    //double 158.3625
        double sideWallArea = xHeightHouse * yLengthSide;
        double windowArea = 1.5 * 1.5;
        double twoSides = 2 * sideWallArea - 2 * windowArea;
        int backSide =  6 * 6;
        double entrance = 1.2 * 2;
        double frondBack = 2 * backSide - entrance;
        double totalArea = twoSides + frondBack;
        double greenPaint = totalArea / 3.4; // 112.56617647058823

        double twoRectanglesRoof = 2.0 * (xHeightHouse * yLengthSide);
        double twoTriangles = 2.0 * (xHeightHouse * hHeightRoof / 2.0);
        double totalAreaRoof = twoRectanglesRoof + twoTriangles;
        double redPaint = totalAreaRoof / 4.3;

        System.out.printf("%.2f%n", greenPaint);
        System.out.printf("%.2f%n" ,redPaint);
    }
}

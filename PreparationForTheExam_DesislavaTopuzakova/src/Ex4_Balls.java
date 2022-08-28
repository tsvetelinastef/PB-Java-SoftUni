import java.util.Scanner;

public class Ex4_Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBalls = Integer.parseInt(scanner.nextLine());
        int totalPoints = 0; // общо точки

        int countRed = 0;  // брой червени топки
        int countOrange = 0;  // брой оранжеви топки
        int countYellow = 0; // брой жълтите топки
        int countWhite = 0; // брой на белите топки
        int countOthers = 0; // брой на останалите топки
        int countBlack = 0; // брой на черните топки
        //за всяка топка от 1 до последната -> четем цвят

        for (int ball = 1; ball <= countBalls; ball++) {
            String color = scanner.nextLine();
            switch (color) {
                case "red":
                    totalPoints += 5; // totalPoints = totalPoints + 5;
                    countRed++;
                    break;
                case "orange":
                    totalPoints += 10;
                    countOrange++;
                    break;
                case "yellow":
                    totalPoints += 15;
                    countYellow++;
                    break;
                case "white":
                    totalPoints += 20;
                    countWhite++;
                    break;
                case "black":
                    totalPoints /= 2;
                    countBlack++;
                    break;
                default:
                    countOthers++;
                    break;
            }
        }

        System.out.println("Total points: " + totalPoints);
        System.out.println("Points from red balls: " + countRed);
        System.out.println("Points from orange balls: " + countOrange);
        System.out.println("Points from yellow balls: " + countYellow);
        System.out.println("Points from white balls: " + countWhite);
        System.out.println("Other colors picked: " + countOthers);
        System.out.println("Divides from black balls: " + countBlack);
    }
}

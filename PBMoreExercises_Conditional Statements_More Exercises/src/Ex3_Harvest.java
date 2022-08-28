import java.util.Scanner;

public class Ex3_Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int xVineyard = Integer.parseInt(scanner.nextLine());
        double yGrape = Double.parseDouble(scanner.nextLine());
        int zNeededLiters = Integer.parseInt(scanner.nextLine());
        int numberWorkers = Integer.parseInt(scanner.nextLine());

        double allGrape = xVineyard * yGrape;
        double wine = 0.4 * allGrape / 2.5;

        if (wine < zNeededLiters) {
           double need = zNeededLiters - wine;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(need));
        } else if (wine >= zNeededLiters) {
            double remain = wine - zNeededLiters;
            double forPerson = remain / numberWorkers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.%n" , Math.ceil(remain) , Math.ceil(forPerson));
        }


    }
}

import java.util.Scanner;

public class Ex8_FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFuel = scanner.nextLine();
        double littersFuel = Double.parseDouble(scanner.nextLine());

        switch(typeFuel){
            case "Diesel":
            case "Gasoline":
            case "Gas":
               if (25 <= littersFuel) {
                   System.out.printf("You have enough %s.", typeFuel.toLowerCase());
               } else {
                   System.out.printf("Fill your tank with %s!", typeFuel.toLowerCase());
               }
               break;
            default:
                System.out.println("Invalid fuel!");
                break;
        }

    }
}

/*

 if (25 <= littersFuel && typeFuel.equals("Diesel") || typeFuel.equals("Gasoline") || typeFuel.equals("Gas")) {
            System.out.printf("You have enough %s.", typeFuel.toLowerCase());
        } else if (25 >= littersFuel) {
            System.out.printf("Fill your tank with %s!", typeFuel.toLowerCase());
        }
        if (!(typeFuel.equals("Diesel") || typeFuel.equals("Gasoline") || typeFuel.equals("Gas"))) {
            System.out.println("Invalid fuel!");
        }

 */
import java.util.Scanner;

public class Ex4_TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nNumberKm = Integer.parseInt(scanner.nextLine());
        String word = scanner.nextLine();

        if (nNumberKm < 20) {
            if (word.equals("day")) {
                double priceTaxi = 0.70 + nNumberKm * 0.79;
                System.out.printf("%.2f", priceTaxi);
            } else if (word.equals("night")) {
                double priceTaxiAgain = 0.70 + nNumberKm * 0.90;
                System.out.printf("%.2f", priceTaxiAgain);
            }

        }   else if ( 20 < nNumberKm  && nNumberKm < 100 ) {
            if (word.equals("day") || (word.equals("night"))) {
                double priceBus = nNumberKm * 0.09;
                System.out.printf("%.2f", priceBus);
            }

        }  if (nNumberKm >= 100) {
            if (word.equals("day") || (word.equals("night"))) {
                double priceTrain = nNumberKm * 0.06;
                System.out.printf("%.2f", priceTrain);
            }
        }


    }
}

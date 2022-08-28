import java.util.Scanner;

public class Ex12_NOOO_TradeCommissions_Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
       double s = Double.parseDouble(scanner.nextLine());


        double percentPerTown = 0;

        switch (town) {
            case "Sofia":
                if ( (0 <= s) && (s <= 500)) {
                    percentPerTown = s * 0.05;
                } else if ( (500 < s) && (s<= 1000) ) {
                    percentPerTown = s * 0.07;
                } else if ( (1000 < s) && (s <= 10000)) {
                    percentPerTown = s * 0.08;
                } else if (s > 10000) {
                    percentPerTown = s * 0.12;
                }
                break;
            case "Varna":
                if ( (0 <= s) && (s <= 500)) {
                    percentPerTown = s * 0.045;
                } else if ( (500 < s) && (s<= 1000) ) {
                    percentPerTown = s * 0.075;
                } else if ( (1000 < s) && (s <= 10000)) {
                    percentPerTown = s * 0.1;
                } else if (s > 10000) {
                    percentPerTown = s * 0.13;
                }
                break;
            case "Plovdiv":
                if ( (0 <= s) && (s <= 500)) {
                    percentPerTown = s * 0.055;
                } else if ( (500 < s) && (s<= 1000) ) {
                    percentPerTown = s * 0.08;
                } else if ( (1000 < s) && (s <= 10000)) {
                    percentPerTown = s * 0.12;
                } else if (s > 10000) {
                    percentPerTown = s * 0.145;
                }
                break;
        }

        switch(town){
            case "Sofia":
            case "Varna":
            case "Plovdiv":
                System.out.printf("%.2f", percentPerTown);
                break;
            default:
                System.out.println("error");
                break;
        }


    }
}

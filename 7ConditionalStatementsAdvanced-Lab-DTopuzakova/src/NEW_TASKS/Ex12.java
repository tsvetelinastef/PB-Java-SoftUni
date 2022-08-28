package NEW_TASKS;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double salesVolume = Double.parseDouble(scanner.nextLine()); //s

        double tradeCom = 0.0;
        //tradecom= salesVol*%

        if (city.equals("Sofia")) {
            if (salesVolume >= 0 && salesVolume <= 500) {
                tradeCom = salesVolume * 0.05;
                System.out.printf("%.2f", tradeCom);
            } else if (salesVolume > 500 && salesVolume <= 1000) {
                tradeCom = salesVolume * 0.07;
                System.out.printf("%.2f", tradeCom);
            } else if (salesVolume > 1000 && salesVolume <= 10000) {
                tradeCom = salesVolume * 0.08;
                System.out.printf("%.2f", tradeCom);
            } else if (salesVolume > 10000) {
                tradeCom = salesVolume * 0.12;
                System.out.printf("%.2f", tradeCom);
            }else {
                System.out.println("error");
               // System.out.printf("error");
            }
        }


        else if (city.equals("Varna")) {
            if (salesVolume >= 0 && salesVolume <= 500) {
                tradeCom = salesVolume * 0.045;
                System.out.printf("%.2f", tradeCom);
            } else if (salesVolume > 500 && salesVolume <= 1000) {
                tradeCom = salesVolume * 0.075;
                System.out.printf("%.2f", tradeCom);
            } else if (salesVolume > 1000 && salesVolume <= 10000) {
                tradeCom = salesVolume * 0.10;
                System.out.printf("%.2f", tradeCom);
            } else if (salesVolume > 10000) {
                tradeCom = salesVolume * 0.13;
                System.out.printf("%.2f", tradeCom);
            }else {
                System.out.println("error");
              //  System.out.printf("error");
            }
        }

        else if (city.equals("Plovdiv")) {
            if (salesVolume >= 0 && salesVolume <= 500) {
                tradeCom = salesVolume * 0.055;
                System.out.printf("%.2f", tradeCom);
            } else if (salesVolume > 500 && salesVolume <= 1000) {
                tradeCom = salesVolume * 0.08;
                System.out.printf("%.2f", tradeCom);
            } else if (salesVolume > 1000 && salesVolume <= 10000) {
                tradeCom = salesVolume * 0.12;
                System.out.printf("%.2f", tradeCom);
            } else if (salesVolume > 10000) {
                tradeCom = salesVolume * 0.145;
                System.out.printf("%.2f", tradeCom);
            }else {
                System.out.println("error");
               // System.out.printf("error");
            }
        }
        else {
            System.out.println("error");
           // System.out.printf("error");
        }


       /*
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
                } else {
                    System.out.printf("%.2f", percentPerTown);
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
                } else {
                    System.out.printf("%.2f", percentPerTown);
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
                } else {
                    System.out.printf("%.2f", percentPerTown);
                   // System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }

        switch(town){
            case "Sofia":
            case " Varna ":
            case "Plovdiv":
                System.out.printf("%.2f", percentPerTown);
                break;
            default:
                System.out.println("error");
                break;
        }

        */




    }
}

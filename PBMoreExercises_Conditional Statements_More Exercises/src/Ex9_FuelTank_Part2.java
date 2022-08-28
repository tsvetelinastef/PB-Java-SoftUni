
import java.util.Scanner;

public class Ex9_FuelTank_Part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFuel = scanner.nextLine();
        double fuelQuantity = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine(); // текст с възможности: "Yes" или "No"


        boolean checkCard = true;


        if (clubCard.equals("No")) {
            checkCard = false;

        } else if (clubCard.equals("Yes")) {
            checkCard = true;
        }

        double diesel = 2.33;
        double dieselDiscount = 0.12;
        double gasoline = 2.22;
        double gasolineDiscount = 0.18;
        double gas = 0.93;
        double gasDiscount = 0.08;

        if (checkCard) {
            diesel -= dieselDiscount;
            gasoline -= gasolineDiscount;
            gas -= gasDiscount;
        }

        double fuelPrice = 0.0;
        double discount20 = 0.08;
        double discount25 = 0.10;

        switch (typeFuel) {
            case "Diesel":
                fuelPrice = diesel * fuelQuantity;
                break;
            case "Gasoline":
                fuelPrice = gasoline * fuelQuantity;
                break;
            case "Gas":
                fuelPrice = gas * fuelQuantity;
                break;
            default:
                System.out.println();
                break;
        }

        if (fuelQuantity >= 20 && fuelQuantity <= 25) {
            fuelPrice = fuelPrice - (fuelPrice * discount20);

        } else if (fuelQuantity > 25) {
            fuelPrice = fuelPrice - (fuelPrice * discount25);
        }

        System.out.printf("%.2f lv.", fuelPrice);


    }
}

/*

        if (typeFuel.equals("Gas")) {


            if (clubCard.equals("Yes")) {
                double finalPrice = 0.93 - 0.08;


                if (20 <= fuelQuantity && fuelQuantity <= 25) {
                    double discount = finalPrice - (finalPrice * 0.08);
                } else if (fuelQuantity >= 25) {
                    //   double discountSecond =   finalPrice - (finalPrice * 0.1);
                    double discount = finalPrice - (finalPrice * 0.1);
                }

            } else if (clubCard.equals("No")) {
                if (20 <= fuelQuantity && fuelQuantity <= 25) {
                    double discountThird = fuelQuantity * 0.93;
                    double finalPrice = discountThird - 0.08;


                    System.out.printf("%.2f", finalPrice);

                } else if (fuelQuantity >= 25) {
                    double discountForth = fuelQuantity * 0.93;
                    double finalPrice = discountForth - 0.1;


                    System.out.printf("%.2f", finalPrice);
                }


            }

        } else if (typeFuel.equals("Gasoline")) {
            if (clubCard.equals("Yes")) {
                double finalPrice = 2.22 - 0.18;

                if (20 <= fuelQuantity && fuelQuantity <= 25) {
                    double discount = finalPrice - (finalPrice * 0.08);

                } else if (fuelQuantity >= 25) {
                    //   double discountSecond =   finalPrice - (finalPrice * 0.1);
                    double discount = finalPrice - (finalPrice * 0.1);
                }

            } else if (clubCard.equals("No")) {

                if (20 <= fuelQuantity && fuelQuantity <= 25) {
                    double discountThird = fuelQuantity * 2.22;
                    double finalPrice = discountThird - 0.08;


                    System.out.printf("%.2f", finalPrice);


                } else if (fuelQuantity >= 25) {
                    double discountForth = fuelQuantity * 2.22;
                    double finalPrice = discountForth - 0.1;


                    System.out.printf("%.2f", finalPrice);
                }


            }

        } else if (typeFuel.equals("Diesel")) {

            if (clubCard.equals("Yes")) {
                double finalPrice = 2.33 - 0.12;

                if (20 <= fuelQuantity && fuelQuantity <= 25) {
                    double discount = finalPrice - (finalPrice * 0.08);

                } else if (fuelQuantity >= 25) {
                    //   double discountSecond =   finalPrice - (finalPrice * 0.1);
                    double discount = finalPrice - (finalPrice * 0.1);
                }

            } else if (clubCard.equals("No")) {

                if (20 <= fuelQuantity && fuelQuantity <= 25) {
                    double discountThird = fuelQuantity * 2.33;
                    double finalPrice = discountThird - 0.08;


                    System.out.printf("%.2f", finalPrice);


                } else if (fuelQuantity >= 25) {
                    double discountForth = fuelQuantity * 2.33;
                    double finalPrice = discountForth - 0.1;


                    System.out.printf("%.2f", finalPrice);
                }
            }
        }

 */



/*
if (20 <= fuelQuantity && fuelQuantity <= 25) {
            double discountGas;
            if (clubCard.equals("Yes")) {
                double discountGas = gas - 0.08;
            } else if (clubCard.equals("No")) {
                System.out.println( );
            }
            double discount =  discountGas - ( discountGas * 0.08);
        }

  if (clubCard.equals("Yes")) {
                    double discountGasoline = gasoline - 0.18;
                } else if (clubCard.equals("No")) {
                    System.out.println( );
                }

  if (clubCard.equals("Yes")) {
                    double discountDiesel = diesel - 0.18;
                } else if (clubCard.equals("No")) {
                    System.out.println( );
                }
            break;

 switch (typeFuel) {
                case "Gas":
                case "Gasoline":
                case "Diesel":
             }


 double gasoline = 2.22;
        double diesel = 2.33;
        double gas = 0.93;
 */

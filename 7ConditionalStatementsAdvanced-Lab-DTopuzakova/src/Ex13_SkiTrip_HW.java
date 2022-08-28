import java.util.Scanner;

public class Ex13_SkiTrip_HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysForStay = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String rating = scanner.nextLine();

        //double finalPrice = 0;
        //boolean finalPrice = daysForStay * typeOfRoom;



        if ( typeOfRoom.equals("room for one person")) {
            if (daysForStay < 10) {
                System.out.println("no discount");
            } else if ((daysForStay >= 10) && (daysForStay <= 15)) {
                System.out.println("no discount");
            } else if (daysForStay > 15) {
                System.out.println("no discount");
            }
        } else if (typeOfRoom.equals("apartment")) {
            if (daysForStay < 10) {


            } else if ((daysForStay >= 10) && (daysForStay <= 15)) {

            } else if (daysForStay > 15) {

            }
        } else if (typeOfRoom.equals("president apartment")) {
            if (daysForStay < 10) {

            } else if ((daysForStay >= 10) && (daysForStay <= 15)) {


            } else if (daysForStay > 15) {

            }
        }



    }
}

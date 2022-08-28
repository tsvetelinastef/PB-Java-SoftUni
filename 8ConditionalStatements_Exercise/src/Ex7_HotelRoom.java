import java.util.Scanner;

public class Ex7_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int night = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0.0; // пазим парите за студио
        double apartmentPrice = 0.0; // пазим парите за апартамент

        switch (month) {
            case "May":      // първа двойка месеци в таблицата - Май и октомври
            case "October":
                studioPrice = night * 50;
                apartmentPrice = night * 65;

                if (night > 14) {
                    studioPrice = studioPrice * 0.70; // studioPrice = studioPrice - (studioPrice * 0.30);
                    //  при повече от 14 нощувки, намаляваме цената на студиото с 30%
                    apartmentPrice = apartmentPrice * 0.90; // apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
                    //  а на апартамента – с 10% ,
                    //  За апартамент, при повече от 14 нощувки без значение от месеца : 10% намаление.
                } else if (night > 7) {
                    studioPrice = studioPrice * 0.95;  // studioPrice = studioPrice - (studioPrice * 0.05);
                    // • За студио, при повече от 7 нощувки през май и октомври : 5% намаление
                }
                break;
            case "June":
            case "September":
                studioPrice = night * 75.20;
                apartmentPrice = night * 68.70;

                if (night > 14) {
                    studioPrice = studioPrice * 0.80; // studioPrice = studioPrice - (studioPrice * 0.20);
                    // За студио, при повече от 14 нощувки през юни и септември: 20% намаление
                    apartmentPrice = apartmentPrice * 0.90; // apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
                    // За апартамент, при повече от 14 нощувки без значение от месеца : 10% намаление.
                }
                break;
            case "July":
            case "August":
                studioPrice = night * 76;    // 76 - от таблицата
                apartmentPrice = night * 77;  // 77 - от таблицата

                if (night > 14) {
                    apartmentPrice = apartmentPrice * 0.90; // apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
                    // • За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление
                    // не пишем за studio нищо , защото никъде в условието намаме за studio
                }
                break;
        }

        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.%n", studioPrice);

// default в случая не ни трябва , то не е и обходимо
    }
}

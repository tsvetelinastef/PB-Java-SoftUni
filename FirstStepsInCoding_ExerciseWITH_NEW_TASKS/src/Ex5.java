import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитане на вход
        int penPackets = Integer.parseInt(scanner.nextLine());
        int markerPackets = Integer.parseInt(scanner.nextLine());
        int boardCleaner = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        // Изчисления
        // • пакети химикали -  5.80 лв.
        // • пакети маркери -  7.20 лв.
        // • препарат  -  1.20 лв (за литър)

        // сметката без отстъпка =  химикали * цената им + маркерите * цената им +
        // препарата * цената му
        double totalWithoutDiscount = penPackets * 5.80 +
                markerPackets * 7.20 + boardCleaner * 1.20;

        // сметката = сметката без отстъпка - намалението
        double total = totalWithoutDiscount - (discount * 1.0 / 100) * totalWithoutDiscount;

        // Принтиране
        System.out.println(total);

    }
}

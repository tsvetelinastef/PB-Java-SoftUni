import java.util.Scanner;

public class Ex1_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();   // тип на прожекция
        int r = Integer.parseInt(scanner.nextLine()); // брой редове
        int c = Integer.parseInt(scanner.nextLine());  // брой колони

        double income = 0.0; // задаве начална стойност 0
        // r * c може да го запиша като отделна променлива
        // int area = r * c;  и после надолу навсякъде в кода на мястото на r * c - пиша area

        if (type.equals("Premiere")) {
            income = r * c * 12.00; //  "са наредени в правоъгълна форма в r реда и c колони", S = r * c все едно
            // лице на правоъгълник =  дължина * широчина,  "колко са ми приходите при пълна зала? "
            // щом имаме правоъгълник и всичките приходи - значи S = r * c го умножаваме по парите за Premiere
        } else if (type.equals("Normal")) {
            income = r * c * 7.50;
        } else if (type.equals("Discount")) {
            income = r * c * 5.00;
        }

        System.out.printf("%.2f leva", income);

     /*   вариант с switch - конструкция

        switch (type) {
            case "Premiere":
                income = r * c * 12.00;
                break;
            case "Normal":
                income = r * c * 7.50;
                break;
            case "Discount":
                income = r * c * 5.00;
                break;
      } */

    }
}

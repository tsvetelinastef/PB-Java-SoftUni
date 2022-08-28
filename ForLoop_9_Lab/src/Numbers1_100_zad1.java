import java.util.Scanner;

public class Numbers1_100_zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // отпечатваме числата от 1 до 100
        /* със знанията до момента:
        System.out.println(1);
        System.out.println(2);  и т.н - многократно използване на 1 и съща команда
        и променлива int for = не мога да създам, защото for си е запазена дума в езика
           */

        // определен брой пъти
       // for (int number = 1; number <= 100; number += 1) {     // може и по този начин
        for (int number = 1; number <= 100; number++) {         // по този също
            // кода, който искаме да повторим
            System.out.println(number);
        }





    }
}

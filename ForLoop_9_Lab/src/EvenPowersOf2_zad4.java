import java.util.Scanner;

public class EvenPowersOf2_zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // степени от 0 до n
        // повтаряме: печатаме 2 на дадената степен
        // начална стойност: 0
        // крайна стойност:  n
        // променяме: увеличаваме с 2 степените
        int n = Integer.parseInt(scanner.nextLine());

        for (int power = 0; power <= n; power += 2) {   // power - степен
         //   System.out.println(Math.pow(2, power));   отпечатва ми: 1.0 ,  4.0  ,  16.0
            System.out.printf("%.0f%n", Math.pow(2, power));   // за да не ми отпечатва с .0 резултата
        }

        // input:  4
        // output:  2 ^ 0 = 1  ,  2 ^ 2 = 4  ,  2 ^ 4= 16


    }
}

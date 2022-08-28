import java.util.Scanner;

public class Number1_N_with3_zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // отпечатваме числата от n до 1
        // повтаряме: печатане на число
        // начална стойност: n
        // крайна стойност: 1
        // промяна: увеличаваме с 3
        int n = Integer.parseInt(scanner.nextLine());
        for (int number = 1; number <= n; number += 3) {  // number = number + 3 - същото
            System.out.println(number);
        }
        // input: 10
        // output: 1   4  7  10



    }
}

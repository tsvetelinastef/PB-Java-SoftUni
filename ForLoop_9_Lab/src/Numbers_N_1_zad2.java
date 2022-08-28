import java.util.Scanner;

public class Numbers_N_1_zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        // отпечатваме числата от n до 1
        // повтаряме: печатане на число
        // начална стойност: n
        // крайна стойност: 1
        // промяна: намаляване с 1

        for (int number = n; number >= 1 ; number-- ) {
            System.out.println(number);
        }
        // input: 5
        // output: 5   4   3   2   1

    }
}

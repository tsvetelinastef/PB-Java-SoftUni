import java.util.Scanner;
// Combinations

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        // всяко първо + всяко второ + всяко трето

        for (int number1 = 0; number1 <= n; number1++) {
            for (int number2 = 0; number2 <= n; number2++) {
                for (int number3 = 0; number3 <= n; number3++) {
                    // всички комбинации от трите числа
                    // валидна -> число1 + число2 + число3 = n
                    if (number1 + number2 + number3 == n) {
                        count++;
                    }
                }

            }
        }
        //знаем броя на валидните комбинации
        System.out.println(count);
    }
}
// input& 25 , output: 351
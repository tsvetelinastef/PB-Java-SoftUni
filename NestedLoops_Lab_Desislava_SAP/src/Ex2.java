public class Ex2 {
    public static void main(String[] args) {
        // MULTIPLICATION TABLE
        for (int number1 = 1; number1 <= 10; number1++) {
            for (int number2 = 1; number2 <= 10; number2++) {
                int result = number1 * number2;
                System.out.printf("%d * %d = %d%n", number1, number2, result);
            }

        }
    }
}

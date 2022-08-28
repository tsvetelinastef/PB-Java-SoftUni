package MORE_EXERCISES;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        int sum = 0;

        if (operator.equals("+")) {
            sum = n1 + n2;

            if (sum % 2 == 0) {
                // System.out.println("even");
                // System.out.printf("%.2d", sum);
                System.out.printf("%d + %d = %d - even", n1, n2, sum);
            } else {
                System.out.printf("%d + %d = %d - odd", n1, n2, sum);
            }


        } else if (operator.equals("-")) {
            sum = n1 - n2;

            if (sum % 2 == 0) {
                System.out.printf("%d - %d = %d - even", n1, n2, sum);
            } else {
                System.out.printf("%d - %d = %d - odd", n1, n2, sum);
            }


        } else if (operator.equals("*")) {
            sum = n1 * n2;

            if (sum % 2 == 0) {
                System.out.printf("%d * %d = %d - even", n1, n2, sum);
            } else {
                System.out.printf("%d * %d = %d - odd", n1, n2, sum);
            }


        } else if (operator.equals("/")) {
           // sum = n1 / n2;

            //  System.out.printf("Cannot divide %d by zero", n1);
            //  System.out.printf("%d / %d = %.2d", n1, n2, sum);

            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                double divideResult = (1.0 * n1) / n2;
                System.out.printf("%d %s %d = %.2f", n1, operator, n2, divideResult);
            }


        } else if (operator.equals("%")) {
           // sum = n1 % n2;

            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                sum = n1 % n2;
                System.out.printf("%d %s %d = %d", n1, operator, n2, sum);
            }

        }


    }
}

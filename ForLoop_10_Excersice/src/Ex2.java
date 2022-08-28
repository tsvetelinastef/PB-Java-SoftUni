import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // n-на брой цели числа, въведени от потребителя

        int sum = 0;
        int max = Integer.MIN_VALUE; // - 10000000
     // int min = Integer.MAX_VALUE;  // 10000000

        for (int i = 0; i < n; i++) {  // от 1 до 7
            int number = Integer.parseInt(scanner.nextLine()); // ми създава число при всяка итерация
            sum = sum + number;

            if (number > max) {
                max = number;
            }

        }

        //   System.out.println(sum);
        sum = sum - max;

        if (max == sum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", max);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sum - max));
        }

    }
}

// Input:
// 7
// 3
// 4
// 1
// 1
// 2
// 12
// 1
// Output:
//  Yes
// Sum = 12

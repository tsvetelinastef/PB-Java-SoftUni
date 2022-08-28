import java.util.Scanner;

public class LeftAndRightSum_zad9_HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;

           // leftSum = leftSum + value; // sum = нова стойност -> взимаме домоментната стойност sum и добавяме нова стойност


            for (int i = 0; i < n; i++) {
                int n1 = Integer.parseInt(scanner.nextLine());
                leftSum = leftSum + n1;
            }
            for (int i = 0; i < n; i++) {
                int n2 = Integer.parseInt(scanner.nextLine());
                rightSum = rightSum + n2;
            }
            if (leftSum == rightSum) {
                System.out.printf("Yes, sum = %d", leftSum);
            } else {
                System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
            }

    }
}



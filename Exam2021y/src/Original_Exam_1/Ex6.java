package Original_Exam_1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int maxFirst = Integer.parseInt(scanner.nextLine());
            int maxSecond = Integer.parseInt(scanner.nextLine());
            int  maxThird = Integer.parseInt(scanner.nextLine());

            for (int firstDigit = 1; firstDigit <= maxFirst; firstDigit++) {
                for (int secondDigit = 1; secondDigit <= maxSecond; secondDigit++) {
                    for (int thirdDigit = 1; thirdDigit <= maxThird; thirdDigit++) {
                        if (firstDigit % 2 == 0 && thirdDigit % 2 == 0) {
                            if (secondDigit == 2 || secondDigit == 3 || secondDigit == 5 || secondDigit == 7) {
                                System.out.printf("%d %d %d%n", firstDigit, secondDigit, thirdDigit);
                            }
                        }
                    }
                }
            }
        }


}

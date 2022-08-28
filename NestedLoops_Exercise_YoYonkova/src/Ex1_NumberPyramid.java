import java.util.Scanner;

public class Ex1_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int current = 1; //  колко числа сте отпечатали до момента (и кое е текущото число).
        boolean isBigger = false; // проверява дали сме излезнали от вътрешния.

        for (int rows = 1; rows <= n; rows++) {  // колко реда да се отпечатат
            for (int cols = 1; cols <= rows; cols++) {   // колко числа се принтират на съответния ред
                if (current > n) { // проверка дали променливата current е станала по-голяма от n
                    isBigger = true; // Ако е, променете стойността на булевата променлива
                    break;
                }
                System.out.print(current + " ");
                current++;
            }
            if (isBigger) { // проверка дали трябва да излезем и от него
                break;
            }
            System.out.println();
        }


    }
}

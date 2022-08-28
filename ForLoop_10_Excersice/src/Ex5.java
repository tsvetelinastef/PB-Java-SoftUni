import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double p1 = 0.0;
        double p2 = 0.0;
        double p3 = 0.0;

        for (int i = 0; i < n; i++) { // int i = 1; i <= n; i++ --> имам равно, иначе
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0) { // остатъкът ми е 0, числото се дели на 2
                p1++;
            }
            if (number % 3 == 0) { // ако остатъкът ми е 0, числото се дели на 2
                p2++;
            }
            if (number % 4 == 0) {
                p3++;
            }

        }

        System.out.printf("%.2f%%%n", p1/n * 100); // * 100 -> заради процента
        System.out.printf("%.2f%%%n", p2/n * 100);
        System.out.printf("%.2f%%%n", p3/n * 100);

    }
}

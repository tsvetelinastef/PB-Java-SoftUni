import java.util.Scanner;

public class Ex3_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); // моето число ИЛИ моята команда
        int sumPrime = 0;
        int sumNotPrime = 0;

        while (!input.equals("stop")) {

            int num = Integer.parseInt(input); // взела съм си числото - превръщам Стринг - в инт
            boolean isPrime = true; // дали е просто числото, кога ще стане false? - когато числото не е просто

            if (num < 0) {
                System.out.println("Number is negative.");
            } else {
               for (int i = 2; i < num; i++) {
                   if (num % i == 0) {   // ако числото, което сме задали % i == 0
                       isPrime = false;  // то числото не е просто
                       break; // програмата приключва
                   }
               }
               if (isPrime) {  // if ще се изпълни само когато isPrime е true
                   sumPrime += num;
               } else {
                   sumNotPrime += num;
               }
            }
            input = scanner.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " + sumPrime);
        System.out.println("Sum of all non prime numbers is: " + sumNotPrime);
    }
}

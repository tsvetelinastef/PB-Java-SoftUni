import java.util.Scanner;

public class OddEvenSum_zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int evenSum = 0;
        int oddSum = 0;

        int diff = 0;

        for (int number = 1; number <= n; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            if (value % 2 == 0) {
                if (value > evenSum) {
                    evenSum = value;
                }
                //  evenSum = evenSum + number;
                if (value < oddSum) {
                    oddSum = value;
                }

            } else {
                evenSum -= value;
                diff = evenSum - oddSum;
            }

            System.out.println("No%n");
            System.out.println("Diff = " + diff);
        }
        System.out.println("Yes%n");
        System.out.println("Diff = " + evenSum);
    }

}


/*  int n = Integer.parseInt(scanner.nextLine());

           int evenSum = 0;
           int oddSum = 0;

        for (int i = 0; i < n ; i++) {
                int n1 = Integer.parseInt(scanner.nextLine());
                  if (n1 % 2 == 0) {
                    //  evenSum += 0;
                   //  evenSum += evenSum;
                     evenSum = evenSum + n1;

            } else {
                     //int n2 = Integer.parseInt(scanner.nextLine());
                    // oddSum += 0;
                     oddSum += oddSum;
                    // evenSum = evenSum + n2;
                  }
        }



       for (int i = 0; i < n; i++) {
                    int n2 = Integer.parseInt(scanner.nextLine());
                      if ( )              // ???????????????? if - някакакъв трябва да си добави май тук - за odd
                }



           if (evenSum == oddSum) {
                    System.out.println("Yes");
                    System.out.printf("Sum= %d%n", evenSum);
                    } else {
                    System.out.println("No");
                    System.out.printf("Diff = %d%n", Math.abs(evenSum - oddSum));
                    //   System.out.printf("Diff = %d%n", oddSum);
                    }

        */


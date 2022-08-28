import java.util.Scanner;
// SUM OF TWO NUMBERS
public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        boolean isFound = false;
        //всички комбинации от две числа -> първата валидна комбинация -> n1 + n2 = magicNumber
        //първото число -> [startNumber, endNumber]
        //второто число -> [startNumber, endNumber]

        int count = 0; // броим всички комбинации
        for (int number1 = startNumber; number1 <= endNumber; number1++) {
            for (int number2 = startNumber; number2 <= endNumber; number2++) {
                // комбинация от двете числа
                count++;
                if (number1 + number2 == magicNumber) {
                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, number1, number2, magicNumber);
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        // вече сме обходили всички комбинации
        if(!isFound)  {
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);
        }

    }
}
// input:
// 1
//10
//5
// output:
// Combination N:4
//(1 + 4 = 5)
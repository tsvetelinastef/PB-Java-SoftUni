import java.util.Scanner;

public class NumberSequence_zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 1. прочитаме n на брой цели числа
        // 2. намираме най- голямото число

        int max = Integer.MIN_VALUE;  // - 2147483648 най- малкото число , което можем да съхраним в една променлива
        int min = Integer.MAX_VALUE;  // 2147483648  най- голямото число , което можем да съхраним в една променлива
        for (int number = 1; number <= n ; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            // проверка дали е по- голямо от моментния макс
            // макс = число , което е било по - голямо от макс

            // проверка дали числото е максимум
            if (value > max) {   // 10 > - 2147483648
                max = value; // value, ако съм въвела: 10 , ще стане 10 = max
            }
            // проверка дали числото е минумум
            if (value < min) {
                min = value;
            }

        }

       System.out.println("Max number: " + max);  // само 1 интервал трябва да имам, сложа ли 2 - грешка
        System.out.println("Min number: " + min);

      //  System.out.println("Max number: %d", max); - може и така да се запише , ама на мен ми дава грешка така

    }
}

// System.out.println(Integer.MIN_VALUE); - това е команда за отпечатване на най- малко число
// въвеждам: 5     10  20  304  0  50
//  1- вото число отговаря на: 10
//  2 - рото число отговаря на: 20
//  3 - тото число отговаря на: 304
//  4 - тото число отговаря на: 0
//  5 - тото число отговаря на: 50
//
// и 0 - 4тото число не е по - голямо от 304
// при Debug- ването виждаме , че 0 я пропуска и си остава 304 най - голямо число, както си и трябва
// и накрая проверяваме и последното число по - голямо ли е от 304
// и приключваме с обхождането

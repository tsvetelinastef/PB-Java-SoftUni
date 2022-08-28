import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
  ................ 1-ви ПРИМЕР, 1-ви начин ...................
        String name = scanner.nextLine();


        if (name.equals("SoftUni")) {
            System.out.println("softuni");
        } else if (name.equals("Yoana")) {
            System.out.println("My name is Yoana");
        } else if (name.equals("Programming Basics")) {
            System.out.println("programming basics");
        } else {
            System.out.println("NO");
        }


   .............. 2-ри начин  ..............
        switch (name) {
            case "SoftUni":
                System.out.println("softuni");
                break;
            case "Yoana":
                System.out.println("My name is Yoana");
                break;
            case "Programming Basics":
                System.out.println("programming basics");
                break;
            default:
                System.out.println("NO");
                break;
        } */
// output: programming basicsss и извежда NO




/*

.................. 3-ти начин .........................
        String type = scanner.nextLine();

        if (type.equals("SoftUni") || type.equals("Programming Basics")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
*/





        /*
   ............. 2-ри   ПРИМЕР .............
        String fruits = scanner.nextLine();

        switch (fruits) {
            case "Cherry":
            case "Banana":
            case "Strawberry":
                System.out.println("Is fruit");
                break;
            default:
                System.out.println("Is vegetables");
                break;
        } */


        /*
   ..............  3ти ПРИМЕР ..............
        int a = Integer.parseInt(scanner.nextLine());

        // && -> И ->  приемаме и двете условия да са вярна
        if(a > 4 && a <= 11) {  // 5, 6, 7, 8, 9, 10, 11
            System.out.println("YES");
        } else {
            System.out.println("NO");
        } */
// output: 7  и извежда YES




 //   ............... 4- ти ПРИМЕР ...................

   //     int number = Integer.parseInt(scanner.nextLine());

        // boolean - true and false
     //   boolean isValid = (number > 20) && (number % 2 == 0);

        /*
        if (isValid) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        } */

    // Вариант в който ако не искам да проверявам дали ми е Валидно числото , а само дали е Невалидно - махам else и слагам
    // ! -  отрицание
/*
        if (!isValid) {  //! , защото не искам да ми е true, обратното на isValid
            System.out.println("Invalid");
        } */
// output: число, което е > от 20 и не ми е четно - примерно 23 и ми извежда Invalid



// ................ 5-ти ПРИМЕР .........................................
       // int number = Integer.parseInt(scanner.nextLine());

        // boolean - true and false - закоментирам го това
        //   boolean isValid = (number > 20) && (number % 2 == 0);  - закоментирам го това

       /* if (!((number > 20) && (number % 2 == 0))) {  // ! - отрича целия израз (1 условие + 2 условие  )
            System.out.println("Invalid");
        } */

    }
}

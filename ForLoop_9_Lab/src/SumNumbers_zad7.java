import java.util.Scanner;

public class SumNumbers_zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        // за всяко едно число от първото до n-тото
        // прочитаме неговата стойност


        int sum = 0;  // ще съхраняваме сумата от числата
        for (int number = 1; number <= n ; number++) {    // fori + Tab -> нов for-цикъл ->  for (int i = 0; i < ; i++) ...
            int value = Integer.parseInt(scanner.nextLine());
            // int value си седи в for - цикъла
            // за всяко число си имаме отделна променлива


            sum = sum + value;  // sum = нова стойност -> взимаме домоментната стойност sum и добавяме нова стойност

            // System.out.println(value);
        }

        System.out.println(sum);
        // за да може да я използваме  sum - трябва да и зададем начална стойност
        //  int sum = 0;

    }

}


        /*
        1-вото число: 45
        sum = 0 + 45 = 45
        2 - рото число: - 20
        sum = 45 + (-20) = 25 и т.н  ....




        */

       /*    въвеждам: 5
          и имам    int number = 1 , на това след него отговаря 5 ,
          value = 56 - това е второто число , което трябва и да го отпечатаме ,за това пишем: System.out.println(value);



 четем for така:
          за(for) всяко число от 1-вото ( int number = 1 ) до n-тото ( number <= n ) искам да прочитам някаква стойност ,
           да я съхраня  в променливата value:   int value = Integer.parseInt(scanner.nextLine());
           и после правя нещо с тази стойност - примерно я отпечатвам:  System.out.println(value);
           и пренимавам към следващото число: number++



          въвеждам:  4
          и сега трябва 4 числа -   45     -20      7      11
          0 + 45 = 45,
          45 - 20 = 25
          25 + 7 = 32
          32 + 11 = 43
          - всеки път като получавам стойност на число





       */

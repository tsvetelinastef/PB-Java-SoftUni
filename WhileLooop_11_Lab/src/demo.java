

public class demo {
    public static void main(String[] args) {
      /*  for (int i = 1; i <= 3; ) {
            System.out.println(i);
        }
       // Output: постоянно повтарящи се  1...
       // безкраен цикъл

      */




      /*
        for ( ; ; ) {
            System.out.println("SoftUni");
        }
        // Output: постоянно ще отпечатва SoftUni
        // безкраен цикъл

        */




       // Израз с особеност при  +=
        for (int i = 0; i < 2; i += 0.5) {
            System.out.println(i + ", ");
        }
        // ще отпечатва постоянно "0, "  , защото
        // към i , като добавим 0.5 -> пак ще е 0
        // т.като i ми е integer, то и изразът i = i + 0.5 ще ми е цяло число
        // при i = i + 0.5 в цикъла for -> ще ми даде грешка защото ние един вид все едно искаме int = double
        // докато при += -> i = (int)i + 0.5; -> задай ми го като int и след това , каквото получиш






        for (double i = 0; i < 2; i += 0.5) {
            System.out.println(i + ", ");
        }
        // тук нямаме проблем с отпечатването
        // извежда ни: 0.0, 0.5, 1.0, 1.5
        // защото няма разминаване в типовете double = double





        // без скенер
        // отпечатваме числата от 1 до 10
        for (int number = 1; number <= 10 ; number++) {
            System.out.println(number);
        }


        // 2ри начин по който да отпечатваме числата от 1 до 10
        int number = 1; // начална стойност
        // повтаряме: печатане на стойността на числото
        // спираме: number > 10
        // продължавам:  number <= 10
        while (number <= 10) {
            System.out.println(number);
            number++;
        }




    }
}

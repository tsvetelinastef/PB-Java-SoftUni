import java.util.Scanner;

public class Ex4_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int goal = 10000; // цел на Габи за ден - пазим ги
       int total = 0; // пази всички стъпки - крайни стъпки

       while (total < goal) {
           String input = scanner.nextLine(); // може и преди while да го напиша
           if (input.equals("Going home")) {
               int wayHome = Integer.parseInt(scanner.nextLine()); // стъпките към вкъщи след командата
               total += wayHome; // + към total искам да си имам всички стъпки
               break;
           }

           int current = Integer.parseInt(input); // трябва ми число, а не String , за това parse - вам

           total += current;
       }
       // от тук надолу - принтирам
       if (total >= goal) {
           System.out.println("Goal reached! Good job!");
           System.out.printf("%d steps over the goal!", total - goal);
       } else {
           System.out.printf("%d more steps to reach goal.", goal - total);
       }
    }
}

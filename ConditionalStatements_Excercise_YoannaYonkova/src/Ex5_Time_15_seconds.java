import java.util.Scanner;

public class Ex5_Time_15_seconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int result = hours * 60 + minutes + 15;
        //int result = 0;

        hours = result / 60;
        minutes = result % 60 ;

        if (hours > 23) {
            hours = 0;
        }

        //с %02d си спестяваме if проверката
        // Какво прави %02d? -> ако числото е едноцифрено(т.е. минутите) долепя 0 преди нашето число;
        //ако числото е двуцифрено, не прави нищо, а просто го принтира

        // %d:%02d -> %d - за часовете, : (по условие), %02d - минутите, като обяснихме защо е така
        System.out.printf("%d:%02d", hours, minutes);

    }
}

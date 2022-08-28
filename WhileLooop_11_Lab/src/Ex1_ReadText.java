import java.util.Scanner;

public class Ex1_ReadText {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // начална стойнност
    // повтаряме: принтиране на даден текст
    // спираме: текст = "Stop"
    // продължаваме текст != "Stop"

    // повторението спира като види "Stop"
        String text = scanner.nextLine();  // задаваме начална стойнност на нашата променлива
        while (!text.equals("Stop")) {
            System.out.println(text);
            text = scanner.nextLine(); // добавяме го, за да променим стойността на променливата в цикъла/ итерираме
        }

    }
}
// output: чете думи стига до думата Stop" и спира да изпълнява/ копира

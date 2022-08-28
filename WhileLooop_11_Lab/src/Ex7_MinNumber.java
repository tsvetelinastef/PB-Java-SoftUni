import java.util.Scanner;

public class Ex7_MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        // повтаряме за всяко едно число: проверка дали е минимум -> min = число
        String text = scanner.nextLine();

        // "99" или "Stop"
        // четем текст докато не получим команда Stop
        // спираме да четем, когато text == "Stop"
        // продължаваме да четем , когато text != "Stop"

        while(!text.equals("Stop")) {
            int number = Integer.parseInt(text); // text = "99" - число под формата на текст и
            // за това трябва да го преобразувам в число ,  parse = преобразуваме text към число
            if (number < min) {
                min = number;
            }
            text = scanner.nextLine();
        }
        System.out.println(min);
    }
}

import java.util.Scanner;

public class StreamLetters_zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        // SoftUni
        // отпечатваме символи -> позиции
        // начална стойност: 0
        // крайна стойност: дължина - 1

        for (int position = 0; position <= text.length() - 1; position++) {
            System.out.println(text.charAt(position));  // от текста ми отпечатай символа на позиция 3
            // тук особеното е , че и интервалът между думите и той се брои за символ
        }

        // input:  ice cream


    }
}



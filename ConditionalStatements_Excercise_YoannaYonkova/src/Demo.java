import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());

        if (a > 5) {
            // ...
        } else if (a == 5) {  // ето тук вече си разделяме, и тук "или да ми е равно"
            // ....
        }
        else {     // или да ми е по-малко -( в случая си остава на този ред този else , където числото да ми е по-малко)
            // или да ми е равно  , и ако искаме тези двете да ги разбием - добавяме преди този else един else if ,
            // където а == 5, тоест "или да ми е равно"
            // ...
        }
    }
}

import java.util.Scanner;

public class Ex10_InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // число -> int
        // валидно -> [100,200] или е 0
        // невалидно -> обратното на валидното
        int number = Integer.parseInt(scanner.nextLine());
        boolean isValid = (number >= 100 && number <= 200) || number == 0;
        // isValid -> true -> валидно
        // isValid -> false -> невалидно
        if (!isValid) {  // !true -> false , isValid == false
            System.out.println("invalid");
        }


    }
}

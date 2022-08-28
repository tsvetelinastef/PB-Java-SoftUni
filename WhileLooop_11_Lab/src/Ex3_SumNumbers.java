import java.util.Scanner;

public class Ex3_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // четем цяло число от конзолата
        int n = Integer.parseInt(scanner.nextLine());

        //  повтаряме: четем число -> сумираме
        // на всеки следващ ред цели числа докато тяхната сума стане по-голяма или равна на първоначалното число
        // щом  спираме на    сума >= n    по условие
        // то значи при обратното    сума < n  продължаваме

        int sum = 0; // на тази променлива и задаваме начална стойност, както в предишните задачи
        while (sum < n) {
            int number = Integer.parseInt(scanner.nextLine()); // чета цяло число
            sum += number; // добавям го към сумата
        }
        System.out.println(sum);
    }
}

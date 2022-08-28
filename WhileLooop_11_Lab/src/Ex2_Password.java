import java.util.Scanner;

public class Ex2_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     // име и парола
        String name = scanner.nextLine();
        String password = scanner.nextLine();

     // начална стъпка: въвеждане на парола
     // спираме въвеждането: ако въведената парола == password -> спираме
     // продължаваме въвеждането: ако въведената парола != password -> продължаваме въвеждането
     // повтаряме: въвеждане на парола
        String enteredPassword = scanner.nextLine();
        while (!enteredPassword.equals(password)) {
            enteredPassword = scanner.nextLine();
        }
        System.out.println("Welcome " + name + "!");
    }
}

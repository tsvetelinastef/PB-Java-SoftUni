import java.util.Scanner;

public class Ex3_AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // име на животното
        // dog -> mammal
        //  crocodile, tortoise, snake -> reptile
        //  others -> unknown
        String animal = scanner.nextLine();
        switch(animal) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }

    }
}

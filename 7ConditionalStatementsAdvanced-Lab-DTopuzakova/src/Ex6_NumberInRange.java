import java.util.Scanner;

public class Ex6_NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // число
        // число >= -100 и число <= 100 и число != 0
        int number = Integer.parseInt(scanner.nextLine());
        if(number >= -100 && number <= 100 && number != 0 ) { // 1 нещо да не е изпълнено вярно - цялото става false
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
// например -25, отгоравя на целия if so it's - Yes
// 0 -> отпечатва No , защото едно нещо от условието да е False, веднага целия израз става False

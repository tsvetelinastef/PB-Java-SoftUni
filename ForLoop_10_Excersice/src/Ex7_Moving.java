import java.util.Scanner;

public class Ex7_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int totalSpace = width * length * height;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Done")) {
                System.out.printf("%d Cubic meters left.", totalSpace);
                break;
            }

            int boxesCount = Integer.parseInt(input);
            totalSpace -= boxesCount;

            if (totalSpace < 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", totalSpace * -1);
                break;
            }
        }
    }
}

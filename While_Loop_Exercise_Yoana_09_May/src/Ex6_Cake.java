import java.util.Scanner;

public class Ex6_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine()); // четем дължината
        int width = Integer.parseInt(scanner.nextLine()); // четем широчината

        int totalPieces = length * width; // всички парчета
        boolean isFinished = false;  // когато стигнем до опр нещо isFinished = true

        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            int currentPieces = Integer.parseInt(input);
            totalPieces -= currentPieces; // totalPieces = totalPieces - currentPieces
            if (totalPieces <= 0) {
                isFinished = true; // тортата ни е свършила
                break;  // програмата приключва
            }

            input = scanner.nextLine(); // да ми чете отначало
        }
        if (isFinished){
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalPieces));
            // всички парчета
        } else {
            System.out.printf("%d pieces are left.", totalPieces);
        }

    }
}

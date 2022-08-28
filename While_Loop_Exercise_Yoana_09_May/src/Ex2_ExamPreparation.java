import java.util.Scanner;

public class Ex2_ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxBadGrades = Integer.parseInt(scanner.nextLine());

        int badGrades = 0;
        int allGrades = 0;
        int sumGrades = 0;

        String currentName = "";

        String name = scanner.nextLine();
        boolean isFailed = false;

        while (!name.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            allGrades++;
            sumGrades += grade;

            if (grade <= 4) {
                maxBadGrades--;
                badGrades++;
            }
            if(maxBadGrades == 0) {
                isFailed = true;
                break;
            }

            currentName = name;
            name = scanner.nextLine();
        }

        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", badGrades);
        } else {
            System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s",
                    1.0 * sumGrades / allGrades , allGrades, currentName);
        }

    }
}

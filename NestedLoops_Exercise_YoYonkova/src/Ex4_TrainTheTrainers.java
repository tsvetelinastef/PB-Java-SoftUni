import java.util.Scanner;

public class Ex4_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // броя на жури
        String command = scanner.nextLine(); // команда

        double allGradesSum = 0;
        int countPresentation = 0;
        // където принтирам ще ми трябва за средното аритметично
        // 2 променливи, които ще се променят, но не и в while, защото в while се трупа

        while (!command.equals("Finish")) {
            String presentation = command; // моите презентации
            countPresentation++; // колкото пъти го завъртам цикъла, толкова презентации ще имам

            double gradeSum = 0.0; // ще пазя всички оценки от журито
            double avgGrade = 0.0; // средноаритметично на оценките


            for (int i = 0; i < n; i++) { // колкото е журито, толкова оценки трябва да прочета
                double grade = Double.parseDouble(scanner.nextLine());
                // прочитам оценка за презентация от всеки член на журито

                gradeSum += grade;
            }
            avgGrade = gradeSum / n; // взимам оценките, които съм намерила във for - цикъла и ги деля на броя на журито
            allGradesSum += avgGrade; // към общата сума прибавям средно-аритметичните оценки
            System.out.printf("%s - %.2f.%n", presentation, avgGrade);

            command = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", allGradesSum / countPresentation);
    }
}

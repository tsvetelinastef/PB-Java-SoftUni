import java.util.Scanner;

public class Ex8_Graduation_pt2_HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int counter = 0;
        int badGrades = 0;
        double sum = 0;

        while (counter < 12) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 4.00) {
                sum += grade;
            } else {
                ++badGrades;

                if (badGrades == 2) {
                    System.out.printf("%s has been excluded at %d grade", name, counter);
                    break;
                }
            }
            counter++;
        }

        if (counter == 12) {
            sum /= 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, sum);
        }


    }
}


/*
             double sumAverageMark = 0;


             String name = scanner.nextLine();


        double mark = Double.parseDouble(scanner.nextLine());
        while (mark <= 12) {
            double yearGrades = Double.parseDouble(scanner.nextLine());
            mark += yearGrades;


            if (mark >= 4.00) {
                sumAverageMark = mark / 12;
                System.out.printf("%s  graduated. Average grade:  %.2f%n" , name, sumAverageMark);
            } else {

                System.out.printf("%s has been excluded at %.2f grade %n", name ,mark );
            }
        }


 */

import java.util.Scanner;

public class Ex4_PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // години -> double
        // пол -> String
        // проверка за пола
        // m -> възраст < 16 или възраст >= 16
        // f -> възраст < 16 или възраст >= 16
        double age = Double.parseDouble(scanner.nextLine()); // ако въведем 12 -> отива при age
        String gender = scanner.nextLine();   // ако въведем f идва при променливата gender ,
        // f пропуска 1вата проверка за m и си отива на  f и там проверява за възрастта

        if (gender.equals("m")) {
            // проверка за възрастта
            // < 16 или >= 16
             if (age < 16) {
                 System.out.println("Master");
             } else { // в противен случай на предишното тоест да е >= 16
                 System.out.println("Mr.");
             }
        } else if (gender.equals("f")) {
                // проверка за възрастта
                // < 16 или >= 16
                if (age < 16) {
                    System.out.println("Miss");
                } else {
                    System.out.println("Ms.");
                }
            }

        }


    }


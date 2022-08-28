package Original_Exam_1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = Integer.parseInt(scanner.nextLine());
        int money = 0;
        int total = 0;
        String command = scanner.nextLine();

        while (!command.equals("closed")) {

            String type = scanner.nextLine();
            if (command.equals("haircut")) {
                if (type.equals("mens")) {
                    money += 15;
                }
                if (type.equals("ladies")) {
                    money += 20;
                }
                if (type.equals("kids")) {
                    money += 10;
                }
            } else if (command.equals("color")) {
                if (type.equals("touch up")) {
                    money += 20;
                }
                if (type.equals("full color")) {
                    money += 30;
                }


            }



            if (money >= goal) {
                System.out.println("You have reached your target for the day!");
                System.out.println("Earned money: " + money + "lv.");
                break;

            }
            command = scanner.nextLine();
        }

        if (command.equals("closed")) {
            int difference = Math.abs(goal - money);
            System.out.printf("Target not reached! You need %dlv. more.\n", difference);
            System.out.println("Earned money: " + money + "lv.");
        }
    }
}

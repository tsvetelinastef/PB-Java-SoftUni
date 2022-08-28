import java.util.Scanner;

public class Ex9_Moving_HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());


        int volume = width * length * height;

        boolean hasVolume = true;

        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            int box = Integer.parseInt(command);
            volume -= box;
            if (volume < 0) {
                hasVolume = false;
                break;
            }

            command = scanner.nextLine();

        }

        if (hasVolume) {
            System.out.printf("%d Cubic meters left.", volume);
        }  else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume) );
        }

    }
}

/*

        int widthFreeSpace = Integer.parseInt(scanner.nextLine());
        int lengthFeeSpace = Integer.parseInt(scanner.nextLine());
        int heightFreeSpace = Integer.parseInt(scanner.nextLine());

    //    int boxes = Integer.parseInt(scanner.nextLine());

        String text = scanner.nextLine();
        while (!text.equals("Done")) {
            int cubicMeters = Integer.parseInt(text);
            if (cubicMeters > 0) {
                cubicMeters = widthFreeSpace * lengthFeeSpace * heightFreeSpace;

            }
        }

 */




 /*
        String text = scanner.nextLine();  // задаваме начална стойнност на нашата променлива
        while (!text.equals("Stop")) {
            System.out.println(text);
            text = scanner.nextLine(); // добавяме го, за да променим стойността на променливата в цикъла/ итерираме
        }
        // output: чете думи стига до думата Stop" и спира да изпълнява/ копира
 */





/*
        int totalFreeSpace = widthFreeSpace * lengthFreeSpace * heightFreeSpace;

        int sum = 0;

        String input = scanner.nextLine();
        while ((!input.equals("Done"))) {
            int currentBox = Integer.parseInt(input);
           sum += currentBox;
            input = scanner.nextLine();

            if (totalFreeSpace < sum) {
                int result = Math.abs(totalFreeSpace - sum);
                System.out.printf("No more free space! You need %d Cubic meters more.", result);
            }
        }

        int resultHaveSpace = Math.abs(sum - totalFreeSpace);
        System.out.printf("%d Cubic meters left.", resultHaveSpace);
 */



/*
                int width = Integer.parseInt(scanner.nextLine());
           //to do: Read the length and height
                  int volume = width * length * height;
                  boolean hasVolume = true;

                  String command = scanner.nextLine();

             while (!command.equals("Done"))
           {
                  int box = Integer.parseInt(command);
                  volume -= box;

           if (volume < 0) {
                   hasVolume = false;
                   break;
           }
          command = scanner.nextLine();
       }
               if (hasVolume)
                     System.out.printf("%d Cubic meters left.", volume);
              else

                    System.out.printf("No more free space! You need %d
 */
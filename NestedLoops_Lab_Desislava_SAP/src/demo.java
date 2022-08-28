import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
     //   Scanner scanner = new Scanner(System.in);

      /* int i = 0;
        while (i < 6) {
            i++;
            if (i % 2 == 0)
                System.out.print(i);
        }
        // 246  */


        // друг пример
        int i = 0;
        while (i < 4) {
            switch(i) {
                case 1:
                    System.out.print(i);
                case 2:
                    System.out.print(i);
                    break;
                case 3:
                    System.out.print(i);
                    break;
            }
            i++;
        }
        // 1123
    }
}

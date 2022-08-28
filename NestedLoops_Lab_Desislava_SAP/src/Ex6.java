import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. етажите от последния към първия
        //2. за всеки един етаж -> стаите от 0 до последната

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());
        for ( int floor = floors; floor >= 1; floor--) { // - цикъл за етажите от 6 до 1
            for (int room = 0; room < rooms; room++ ) {
                //{буква за тип на стаята}{етаж}{номер на стаята}
                if(floor == floors) {
                    System.out.printf("L%d%d ",floor, room);
                } else if (floor % 2 == 1) {
                    System.out.printf("A%d%d ",floor, room);
                } else if (floor % 2 == 0) {
                    System.out.printf("O%d%d ",floor, room);
                }
            }
            System.out.println();
        }

    }
}

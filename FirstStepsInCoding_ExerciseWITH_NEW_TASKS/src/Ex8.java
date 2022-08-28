import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитане на вход
        int annualFee = Integer.parseInt(scanner.nextLine());

        // изчисления
             // Баскетболни кецове – цената им е 40% по-малка от таксата за една година
             // Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
             // Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
             // Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        double sneakers = annualFee - annualFee * 0.40;
        double outfit = sneakers - sneakers * 0.20;
        double ball = outfit / 4;
        double accessories = ball / 5;

        double totalSum = sneakers + outfit + ball
                + accessories + annualFee;

        // Принтиране
        System.out.println(totalSum);

    }
}

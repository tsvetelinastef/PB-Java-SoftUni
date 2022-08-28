import java.util.Scanner;

public class Ex2_SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();

        // задаваме им празна стойност, за да можем после да ги ползваме многократно в отделните условни конструкции
        // без да ги декларираме 2те променливи всеки път поотделно
        // с кавичките си пазя String
        // за тези градуси трябва да си пазя моят outfit  и shoes
        //  по аналогичен начин на онези променливи на които им задаваме 0
        String outfit = "";  // в променливите outfit и shoes си запазваме outfit и shoes
        String shoes = "";

        switch (dayTime) {
            case "Morning":
                if (degrees >= 10 && degrees <= 18) {
                    outfit = "Sweatshirt";  // в тези променливи аз си пазя моят String за това са в кавички
                    shoes = "Sneakers";
                } else if (degrees > 18 && degrees <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (degrees >= 10 && degrees <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees > 18 && degrees <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (degrees >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                break;
            default:  // няма да ми прави нищо , само ще ми break - не, "ако не си Morning, Afternoon и Evening
                break;  // прескочи ми просто и не прави нищо "
        }

        System.out.printf("It's %d degrees, get your %s and %s.", degrees , outfit, shoes);
    }
}

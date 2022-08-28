import java.util.Scanner;

public class Ex3_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// е програма която да изчисли колко ще им струва, да си засадят определен брой цветя и дали
//наличния бюджет ще им е достатъчен. Различните цветя са с различни цени

        //От конзолата се четат 3 реда:
        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.0; // пазим нашите пари


        // Съществуват следните отстъпки:
        switch (flowerType) {
            case "Roses":
                totalPrice = flowerCount * 5;
                if (flowerCount > 80) {  // Ако Нели купи повече от 80 Рози -
                    totalPrice = totalPrice - (totalPrice * 0.10); // 10% отстъпка от крайната цена
                }
                break;
            case "Dahlias":
                totalPrice = flowerCount * 3.80;
                if (flowerCount > 90) {   // Ако Нели купи повече от 90 Далии -
                    totalPrice = totalPrice - (totalPrice * 0.15); //  15% отстъпка от крайната цена
                }
                break;
            case "Tulips":
                totalPrice = flowerCount * 2.80;
                if (flowerCount > 80) {   // Ако Нели купи повече от 80 Лалета -
                    totalPrice = totalPrice - (totalPrice * 0.15); //  15% отстъпка от крайната цена
                }
                break;
            case "Narcissus":
                totalPrice = flowerCount * 3;
                if (flowerCount < 120) {  // Ако Нели купи по-малко от 120 Нарциса
                    totalPrice = totalPrice + (totalPrice * 0.15); //  цената се оскъпява с 15%
                }
                break;
            case "Gladiolus":
                totalPrice = flowerCount * 2.50;
                if (flowerCount < 80) {    // Ако Нели Купи по-малко от 80 Гладиоли
                    totalPrice = totalPrice + (totalPrice * 0.20); // цената се оскъпява с 20%
                }
                break;
            default:  // else { ... } кодът иначе си върви и без default:
                break;
        }

//Да се отпечата на конзолата на един ред: Сумата да бъде форматирана до втория знак след десетичната запетая
        if ( totalPrice <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    flowerCount, flowerType, Math.abs(budget - totalPrice)); // Math.abs - за + числа
        } else { // бюджета да не ни е достатъчен
            System.out.printf("Not enough money, you need %.2f leva more." , Math.abs(totalPrice - budget));
        }
// ако искам you need %.2f leva more." да ми е на нов ред слагам ->  %n или \n  <- преди него


    }
}

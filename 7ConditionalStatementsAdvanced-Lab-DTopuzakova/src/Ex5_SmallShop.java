import java.util.Scanner;

public class Ex5_SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // чете какъв продукт сме си купили -> текст String
        // град -> String
        // количество -> double
        // крайна цена = количеството * ед. цена за продукт
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double pricePerProduct = 0; // първоначална стойност 0, т.като не сме проверили какъв ни е продукта и града
        // държим единичната цена за продукта

        // проверка за града -> "Sofia", "Plovdiv", "Varna"
        switch (town) {
            case "Sofia":
                // проверка за продукта -> "coffee", "water", "beer", "sweets", "peanuts"
                if (product.equals("coffee")) { // това if може да го заменим със switch и else if- овете ще станат case
                  pricePerProduct = 0.50;
                } else if (product.equals("water")) { // case "coffee":   ... pricePerProduct = 0.80; и накрая break;
                    pricePerProduct = 0.80;
                } else if (product.equals("beer")) {
                    pricePerProduct = 1.20;
                } else if (product.equals("sweets")) {  // проверка ако продукта ми е нито кафе, вода, бира ...
                    pricePerProduct = 1.45;
                } else if (product.equals("peanuts")) {
                    pricePerProduct = 1.60;
                }
                break;
            case "Plovdiv":
                // проверка за продукта -> "coffee", "water", "beer", "sweets", "peanuts"
                if (product.equals("coffee")) {
                    pricePerProduct = 0.40;
                } else if (product.equals("water")) {
                    pricePerProduct = 0.70; //2.0999999999999996 - излиза това, защото double има точност 16 знака след ,
                } else if (product.equals("beer")) {
                    pricePerProduct = 1.15;
                } else if (product.equals("sweets")) {  // проверка ако продукта ми е нито кафе, вода, бира ...
                    pricePerProduct = 1.30;
                } else if (product.equals("peanuts")) {
                    pricePerProduct = 1.50;
                }
                break;
            case "Varna":
                // проверка за продукта -> "coffee", "water", "beer", "sweets", "peanuts"
                if (product.equals("coffee")) {
                    pricePerProduct = 0.45;
                } else if (product.equals("water")) {
                    pricePerProduct = 0.70;
                } else if (product.equals("beer")) {
                    pricePerProduct = 1.10;
                } else if (product.equals("sweets")) {  // проверка ако продукта ми е нито кафе, вода, бира ...
                    pricePerProduct = 1.35;
                } else if (product.equals("peanuts")) {
                    pricePerProduct = 1.55;
                }
                break;
        }

        // знаем ед. цена за продукт
        double finalPrice = quantity * pricePerProduct;
        System.out.println(finalPrice);


    }
}

// ако свети нещо в жълто, не значи , че трябва да го правим , просто ни дава предложение,
// защото при Varna, като ми предлага default - не трябва да  го променяме така ,
// защото ако на конзолата например напишем Разград - ще ми изпълнява за Разград,
// а на мен ми трябва за Varna
import java.util.Scanner;

public class Ex5_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double changeInLeva = Double.parseDouble(scanner.nextLine()); //  в лева
        double changeInSt = Math.round(changeInLeva * 100); // превръщам в стотинки

        int countCoins = 0; // брой на монети

        while (changeInSt > 0) {
            if (changeInSt >= 200) { // 200 стотинки = 2 лв
                changeInSt -= 200;
                countCoins++;
            } else if (changeInSt >= 100) {   // 100 стотинки = 1 лв
                changeInSt -= 100;
                countCoins++;
            } else if (changeInSt >= 50) {   // 50 стотинки
                changeInSt -= 50;
                countCoins++;
            } else if (changeInSt >= 20) {   // 20 стотинки
                changeInSt -= 20;
                countCoins++;
            } else  if (changeInSt >= 10) {  // 10 стотинки
                changeInSt -= 10;
                countCoins++;
            } else  if (changeInSt >= 5) {    // 5 стотинки
                changeInSt -= 5;
                countCoins++;
            } else if (changeInSt >= 2) {    // 2 стотинки
                changeInSt -= 2;
                countCoins++;
            } else if (changeInSt >= 1) {   // 1 ст.
                changeInSt -= 1;
                countCoins++;
            }
        }
        System.out.println(countCoins);
    }
}

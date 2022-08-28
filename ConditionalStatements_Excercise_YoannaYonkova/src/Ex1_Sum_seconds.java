import java.util.Scanner;

public class Ex1_Sum_seconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // прочета данните от конзолата
        int firstTime = Integer.parseInt(scanner.nextLine()); // времето на 1- ви състезател
        int secondTime = Integer.parseInt(scanner.nextLine()); // времето на 2ри състезател
        int thirdTime = Integer.parseInt(scanner.nextLine()); // времето на 3-ти състезател

        // времето в секунди за тримата състезатели, като ги събирам
        int totalTime = firstTime + secondTime+ thirdTime;

         // да намерим минутите
        // totalTime , което ми е в секунди , разделям на 60 целочислено
        int minutes = totalTime / 60;

        // да намерим секундите
        int seconds = totalTime % 60; // секундите- totalTime ми се явяват моят остатък , който искам да взема

        // изпечатваме изхода


        if (seconds < 10) {
            // ако секундите са ми от 0 до 9  -> залепям една 0 -> 00, 01 ... 09
            System.out.printf("%d:0%d", minutes , seconds); // тук се използва printf ,а не println
        } else { // seconds > 10 -> 10 ...
            System.out.printf("%d:%d", minutes, seconds); // %d - първи int за минутите ,пак %d - защото работим с двуцифрени числа
        }
     }
}

// System.out.printf("%d:%02d", minutes, seconds); za 29ti red
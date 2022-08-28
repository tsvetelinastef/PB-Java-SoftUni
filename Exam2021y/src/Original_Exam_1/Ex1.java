package Original_Exam_1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatPercentage = Integer.parseInt(scanner.nextLine());  // мазнини
        int proteinsPercentage = Integer.parseInt(scanner.nextLine());  // протеини
        int carbohydratesPercentage = Integer.parseInt(scanner.nextLine()); // въглехидрати

        int caloriesAll = Integer.parseInt(scanner.nextLine());
        int waterPercentage = Integer.parseInt(scanner.nextLine());

        // 1 грам мазнини = 9 калории
        // 1 грам протеини = 4 калории
        // 1 грам въглехидрати = 4 калории

       double fatGrams =  ( (fatPercentage * 1.0 / 100) * caloriesAll ) / 9;
       double proteinGrams = ( ( proteinsPercentage * 1.0 / 100) * caloriesAll) / 4;
       double carbohydratesGrams = (( carbohydratesPercentage * 1.0 / 100) * caloriesAll) / 4;

       double foodGrams = fatGrams + proteinGrams + carbohydratesGrams;

       double caloriesPerGram = caloriesAll / foodGrams;

       // 100 % - waterPercentage = %
        //  %  * caloriesPerGram
     //  double water =  ((waterPercentage * 1.0) / 100) * caloriesPerGram;

        double percentage = 1 -  ((waterPercentage * 1.0) / 100);
        double water = percentage * caloriesPerGram;

        System.out.printf("%.4f", water);





    }
}

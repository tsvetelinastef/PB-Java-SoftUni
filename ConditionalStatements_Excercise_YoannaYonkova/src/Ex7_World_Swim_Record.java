import java.util.Scanner;

public class Ex7_World_Swim_Record {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSec = Double.parseDouble(scanner.nextLine()); // for 1Meter

        double result = distance * timeInSec; // умножаваме разстоянието в м  *  времето в секунди за 1 m

        double slowDown = Math.floor(distance / 15); // закръглям до по - ниското число -> дистанцията / 15
        double slowDown2 = slowDown * 12.5;  // към времето добавяме 12.5 секунди
        // double slowDown = Math.floor(distance / 15) * 12.5;  ( деля на 15 , защото го забавяме на 15 м ,
        // но по условие искаме да закръглим само тази дистанция и това , че го забавяме с 12.5 секунди

        double finalResult = result + slowDown2; // защото на slowDown2 вече сме си изчислили, че времето / 12.5

        if (finalResult < record) {  // Иван е подобрил рекорда
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalResult);
        } else { // Иван не е подобрил рекорда
            System.out.printf("No, he failed! He was %.2f seconds slower.", finalResult - record);
            // използваме abs за да не получим като резултат отрицателно число
             // ако искаме да използваме отделна променлива и в s0uf  да ни е само diff (някаква променлива )
            // на 19ти ред - преди  if (finalResult < record)  пишем:
            // double diff = Math.abs(record - finalResult);
            // Лекторът сгреши примера и накрая просто за Math.abs(record - finalResult) забравяме
        }
    }
}

import java.util.Scanner;

public class Ex1_PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vLiters = Integer.parseInt(scanner.nextLine());
        int p1ForHour = Integer.parseInt(scanner.nextLine());
        int p2ForHour = Integer.parseInt(scanner.nextLine());
        double hWorkerAbsent = Double.parseDouble(scanner.nextLine());

     //   double firstFilled = hWorkerAbsent * p1ForHour;
     //   double secondFilled = hWorkerAbsent * p2ForHour;
        double total = p1ForHour * hWorkerAbsent + p2ForHour * hWorkerAbsent;

        double overWater = total - vLiters;

        double firstPercent = ( (p1ForHour * hWorkerAbsent) / total) * 100;
        double secondPercent = (( p2ForHour * hWorkerAbsent) / total) * 100;
        double percent = (total / vLiters) * 100;

        if (total <= vLiters){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percent, firstPercent, secondPercent);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hWorkerAbsent, overWater);
        }

    }
}

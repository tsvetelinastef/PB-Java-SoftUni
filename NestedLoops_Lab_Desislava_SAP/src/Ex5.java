import java.util.Scanner;

public class Ex5 {
    // TRAVELLING
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String destination = scanner.nextLine(); // държава или "End"
        //стоп -> destination == "End"
        //продължаваме -> destination != "End"
        while (!destination.equals("End")) {
            // държава - цена
            double excursionPrice = Double.parseDouble(scanner.nextLine());
            // събирам пари
            // минималния бюджет, който ще е нужен за пътуването
            double availableMoney = 0;
            //стоп -> availableMoney >= excursionPrice
            //продължава -> availableMoney < excursionPrice
            while (availableMoney < excursionPrice) {
                // След това ще се четат няколко суми, които Ани спестява като работи
                double savedMoney = Double.parseDouble(scanner.nextLine());
                availableMoney += savedMoney; //  всичките = които
            }
            // налични пари > пари за екскурзията
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }


    }
}

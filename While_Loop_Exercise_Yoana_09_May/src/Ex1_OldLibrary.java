import java.util.Scanner;

public class Ex1_OldLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favBook = scanner.nextLine(); // търсената от нея книга
        int counter = 0; // брояч на книги през който ще преминем ,
        // който ми го искат и в изхода - да отброява книгите ,
        // задавам му начална стойност

        boolean isFound = false; //  за да може, когато намерим книгата
        // да ни стане true , все едно като ключова дума за проверка

        String nextBook = scanner.nextLine(); // четем новите книги -
        // всяка следваща - която предстои и все едно като
        // начална стойност на for цикъла
        while (!nextBook.equals("No More Books")) { // докато моята следваща
            // книга не стане равна на No More Books , то прави ми нещо ...
           if (nextBook.equals(favBook)) {
               isFound = true; // намерила съм си книгата за това става true
               break; // прекрати програмата, не прави повече нищо
           }
           counter++; // увеличава ако нямаме No More Books книгата,
            // която търсим

           nextBook = scanner.nextLine(); // винаги въри с while,
            // докато не намери книгата да ми чете нова
        }
        if (isFound) { // ако сме си намерили книгата
            System.out.printf("You checked %d books and found it.", counter);
            // защото ми искат отброените книги , броим
        } else {  // ако НЕ сме си намерили книгата
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", counter);
        }


    }
}

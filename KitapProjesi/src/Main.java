import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("Java Programming", "John Doe", 450));
        books.add(new Book("Effective Java", "Joshua Bloch", 412));
        books.add(new Book("Clean Code", "Robert Martin", 464));
        books.add(new Book("Algorithms", "John Doe", 320));
        books.add(new Book("Data Structures", "John Doe", 520));

        System.out.println("DOGAL SIRALAMA ");
        Collections.sort(books);
        for(Book book : books){
            System.out.println(book);
        }

        System.out.println("OZEL SIRALAMA");
        books.sort(new AutherTitleComparator());

        for(Book book : books){
            System.out.println(book);
        }


    }
}
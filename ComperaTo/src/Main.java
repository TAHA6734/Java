import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<Book>();

        books.add(new Book("The Great Gatsby", 1925));
        books.add(new Book("Moby Dick", 1851));
        books.add(new Book("1984", 1949));
        books.add(new Book("To Kill a Mockingbird", 1960));

        Collections.sort(books);

        for(Book book : books){
            System.out.println(book);
        }

    }
}
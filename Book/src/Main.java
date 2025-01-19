import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import  java.util.LinkedList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Book>books = new LinkedList<Book>();
        books.add(new Book("C" , 1000000));
        books.add(new Book("D" , 500));
        books.add(new Book("A" , 2000));
        books.add(new Book("R" , 5000));

        Collections.sort(books);

        Iterator iter = books.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        Collections.sort(books , new TitleComparator());
        for(Book book : books){
            System.out.println(book);
        }

    }
}
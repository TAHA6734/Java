import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Book>booklist = new LinkedList<Book>();
        booklist.add(new Book("SA" , 100));
        booklist.add(new Book("AS" , 500));
        booklist.add(new Book("SAS" , 600));
        booklist.add(new Book("ASA" , 700));

        Collections.sort(booklist);
        Iterator book = booklist.listIterator();
        if(book.hasNext()){
            System.out.println(book.next());
        }

        Collections.sort(booklist , new TItleComparator());
        for(Book booklists : booklist){
            System.out.println(booklists);
        }


    }
}
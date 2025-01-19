import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<Book> booklist = new LinkedList<Book>();

        booklist.add(new Book("SA" , 1000 ) ) ;
        booklist.add(new Book("AS" , 2000) ) ;
        booklist.add(new Book("NBR" , 3000 ) ) ;
        booklist.add(new Book("SLM" , 4000 ) ) ;
        booklist.add(new Book("OK" , 5000 ) ) ;

        Collections.sort(booklist);

        Iterator<Book>iteratorList = booklist.listIterator();

        while(iteratorList.hasNext()){
            System.out.println(iteratorList.next());
        }





    }
}
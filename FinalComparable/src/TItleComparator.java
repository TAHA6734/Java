import java.util.Comparator;

public class TItleComparator implements Comparator<Book> {
    public int compare(Book b1 , Book b2){
        return b1.title.compareTo(b2.title);
    }
}

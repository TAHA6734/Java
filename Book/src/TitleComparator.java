import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {
    public int compare(Book b1 , Book b2){
        return b1.name.compareTo(b2.name);
    }
}

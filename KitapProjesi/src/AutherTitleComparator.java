import java.util.Comparator;

public class AutherTitleComparator implements Comparator<Book> {

    public int compare(Book b1 , Book b2){
        int authercompare = b1.getAuther().compareTo(b2.getAuther() ) ;
        if(authercompare != 0 ){
            return authercompare;
        }
        return b1.getTitle().compareTo(b2.getTitle());
    }
}

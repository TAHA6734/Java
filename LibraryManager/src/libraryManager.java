import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class libraryManager{

    private ArrayList<Objects> booklist ; 
    private LinkedList<Objects> barrowlist ;

    public libraryManager(){
        booklist = new ArrayList<>();
        barrowlist = new LinkedList<>();
    }

    public void addBook(Object book){
       booklist.add((Objects) book ) ;
    }
    public void addBookIndex(int index , Object book ){
        booklist.add(index ,(Objects) book ) ;
    }
    public void ensureCapacity(int capacity){
        booklist.ensureCapacity(capacity);
    }
    public void setBooklist(int index  , Object book){
        booklist.set(index , (Objects) book ) ;
    }
    public void removeBook(int index ){
        booklist.remove(index);
    }

    public void Barrowbooks(Object book){
        barrowlist.addLast((Objects)book);
    }
    public Object getFirstBarrowBook(){
        return barrowlist.getFirst();
    }
    public Object getLastBarrowBook(){
        return barrowlist.getLast();
    }

    
    
    
}

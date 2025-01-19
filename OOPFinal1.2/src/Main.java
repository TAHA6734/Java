import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Book> list = new LinkedList<Book>();

        list.add(new Book(" Besiktas " , 100));
        list.add(new Book(" Galatasaray " , 0));
        list.add(new Book(" Fenerbahce " , 50));
        list.add(new Book(" Trabzonspor " , 10));
        list.add(new Book(" Bursaspor " , 20));

        Collections.sort(list);

        Iterator<Book> iter = list.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
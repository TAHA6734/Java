
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //Collection
      /**  Collection<String> collection = new ArrayList<>() ;

        collection.add("elma");
        collection.add("armut");
        collection.add("kiraz");

        System.out.println("Koleksiyon bouyutu : " + collection.size());

        System.out.println("Elemanlari : " + collection);

        System.out.println("armut var mi  ? " + collection.contains("armut"));

        collection.remove("elma") ;

        collection.clear();

        System.out.println("Temizlendi mi  ? " + collection.isEmpty());*/

      //Iterator

        List<String> list = new ArrayList<>() ;
        list.add("taha");
        list.add("kayra");
        list.add("tekin");

        Iterator<String> iter = list.iterator();

        while(iter.hasNext()){
            String element = iter.next();
            System.out.println("eleman : " + element);

            if(element.equals("taha")){
                iter.remove();
            }
        }

        System.out.println(list);

    }
}
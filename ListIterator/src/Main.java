import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;



public class Main {
    public static void main(String[] args) {

        List<String>ogrenci =  new ArrayList<String>();

        ogrenci.add("AHMET");
        ogrenci.add("MEHMET");
        ogrenci.add("AYSE");

        System.out.println("Onceki liste : " + ogrenci) ;

        ListIterator<String> listIterator = ogrenci.listIterator();

        if(listIterator.hasNext()){
            listIterator.next();
        }
        if(listIterator.hasNext()){
            listIterator.next();
        }

        listIterator.add("TAHA");
        System.out.println("EKLENMIS LISTE " + ogrenci);

        while(listIterator.hasPrevious()){
            System.out.println("ONCEKI OGRENCI : " + listIterator.previous());
        }


    }
}
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<ogrenci> ogrencilistesi = new ArrayList<>() ;

        ogrencilistesi.add(new ogrenci(123 , 85.2 , "Taaha"));
        ogrencilistesi.add(new ogrenci(124 , 88.6 , "kayra"));
        ogrencilistesi.add(new ogrenci(125 , 65.2 , "tekin"));
        ogrencilistesi.add(new ogrenci(113 , 25.3 , "ahmet"));
        ogrencilistesi.add(new ogrenci(223 , 11.1 , "Ahmet"));
        ogrencilistesi.add(new ogrenci(120 , 99.2 , "Tekin"));

        System.out.println("okul numarsina gore ");
        Collections.sort(ogrencilistesi);
        for(ogrenci ogrenci : ogrencilistesi){
            System.out.println(ogrenci);
        }

        System.out.println("not ortalamasina gore : ");
        Collections.sort(ogrencilistesi , new OrtalamaComparator());
        for(ogrenci ogrenci : ogrencilistesi){
            System.out.println(ogrenci);
        }

        System.out.println("isme gore : ");
        Collections.sort(ogrencilistesi, new IsmegoreComparator());
        for(ogrenci ogrenci : ogrencilistesi){
            System.out.println(ogrenci);
        }

    }
}
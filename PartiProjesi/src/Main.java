import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        List<SiyasiPartiler> partiler = new ArrayList<>();

        partiler.add(new SiyasiPartiler("A PARTI" , 54.5 , 50));
        partiler.add(new SiyasiPartiler("B PARTI " , 25.5 , 30));
        partiler.add(new SiyasiPartiler("C PARTI " , 20 , 1 ));

        System.out.println("OY YUZDELERI : ");
        Collections.sort(partiler);
        partiler.forEach(System.out::println);

        System.out.println("ISME GORE : ");
        partiler.sort(new NameComparator());
        partiler.forEach(System.out::println);

        System.out.println("ONDE OLDUKLARI SEHIR SAYISI : ");
        partiler.sort(new CityComparator());
        partiler.forEach(System.out::println);
        }
    }

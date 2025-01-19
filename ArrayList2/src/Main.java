import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>() ;

        list.ensureCapacity(20);

        list.add("taha");
        list.add("kayra");
        list.add("tekin");
        list.add("ahmet");
        list.add("ayhan");

        System.out.println("Ilk liste : " + list);

        System.out.println("3. ogrenci : " + list.get(2)) ;

        System.out.println("ogrenci guncellemesi : " + list.set(2 , "ganime"));

        System.out.println("ikinci liste : " + list );

        System.out.println("1.ogrenciyi sil : " + list.remove(0));

        System.out.println("3.liste : " + list );

        for(int i = 0 ; i < 10 ; i++){
            list.add("ogrenci %d " +  i );
        }
        System.out.println(list.size());

        }
    }

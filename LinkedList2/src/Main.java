import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        LinkedList<String> tasklist  = new LinkedList<>();

        tasklist.add("kahvalti yap");
        tasklist.add("ustunu giy");
        tasklist.add("ise git");
        tasklist.add("eve gel");
        tasklist.add("yemke ye ") ;
        tasklist.add("uyu");

        System.out.println( " liste yapilacaklar : " + tasklist);
        System.out.println("ilk is : " + tasklist.getFirst());
        System.out.println("son is : " + tasklist.getLast());

        System.out.println("Yapılan ve Kaldırılan İlk İş: " + tasklist.removeFirst());

        // Son işi yapıp kaldırma
        System.out.println("Yapılan ve Kaldırılan Son İş: " + tasklist.removeLast());

        // Güncellenmiş iş listesi
        System.out.println("Güncellenmiş İş Listesi: " + tasklist);

        // Yeni işler ekleme
        tasklist.addFirst("Kitap oku");
        tasklist.addLast("Uykuya hazırlan");

        System.out.println("Yeni Güncellenmiş İş Listesi: " + tasklist);

    }
}
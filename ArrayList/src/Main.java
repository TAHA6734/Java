import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<String> list = new ArrayList<String>();

        list.add("TAHA");
        list.add("KAYRA");
        list.add("TEKIN");

        System.out.println("ESKI LISTE " + list);

        String first = list.get(0);
        System.out.println("Listedeki ilk eleman : " + first);

        list.set(0, " MEHMET ");
        System.out.println("GUNCEL LISTE " + list);

        list.remove(1);
        System.out.println("SILINMIS LISTE : " + list);

        list.ensureCapacity(20);
        System.out.println("kapasite 20 artti ");

        list.add("BILAL ");
        System.out.println("Listenin son hali : " + list);

    }
}
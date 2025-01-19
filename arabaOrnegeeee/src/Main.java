import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Araclar> list = new ArrayList<Araclar>();
        list.add(new car("Ferrari", 2022, 2));
        list.add(new car("Cupra", 2024, 4));
        list.add(new car("Seat", 2013, 4));
        list.add(new motocycle("BMW", 2018, true));
        list.add(new motocycle("KAWASAKI", 2019, false));

    Collections.sort(list);
    for(Araclar lists : list) {
        System.out.println(lists);
    }
        Collections.sort(list, new BRANDCOMPARATOR());
        for (Araclar lists : list) {
            System.out.println(lists);


        }
    }
}
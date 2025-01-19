import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Ticket> list = new LinkedList() ;
        list.add(new StandartTicket(123 , 456));
        list.add(new StandartTicket(124 , 450));
        list.add((StandartTicket)new DiscountTicket(741 , 753 , 0.5) );
        list.add((StandartTicket)new DiscountTicket(781 , 793 , 1.5) );

        list.sort(new SeatNumberComparator());

        for(Ticket lists : list){
            System.out.println(" seat number : " + lists);
        }


    }
}
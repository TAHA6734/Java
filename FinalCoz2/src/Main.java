import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ticket t1 = new StandartTicket(10, 1);
        Ticket t2 = new DiscountTicket(22, 2, 0.1);
        Ticket t3 = new DiscountTicket(12, 3, 0.2);
        Ticket t4 = new StandartTicket(35, 4);

        List<Ticket> tickets = new ArrayList<>();
        tickets.add(t1);
        tickets.add(t2);
        tickets.add(t3);
        tickets.add(t4);

        public void SortandPrint(List<Ticket> tickets){
            Collections.sort(tickets , new SeatNumberComparator());
            for (Ticket ticket : tickets) {
                ticket.print();
            }
        }

    }
}
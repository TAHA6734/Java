import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<Ticket>ticketList = new ArrayList<Ticket>();
        ticketList.add(new StandartTicket(1 , 10));
        ticketList.add(new DiscountTicket(2 , 65 , 0.5));
        ticketList.add(new DiscountTicket(3 , 31 , 0.6));
        ticketList.add(new DiscountTicket(4 , 9 , 0.9));
        ticketList.add(new StandartTicket(5 , 25));

        SortAndPrint.sortAndPrint(ticketList);

    }
}
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ticket>ticketList = new LinkedList<>();
        ticketList.add(new StandartTicket(125,10));
        ticketList.add(new StandartTicket(125,10));
        ticketList.add(new StandartTicket(125,10));
        ticketList.add(new DiscounTicket(125,10 , 0.5));


        TicketSellelr ts = new TicketSellelr(ticketList);



        SortAndPrint.sortandPrint(ticketList);
    }
}
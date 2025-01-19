import java.util.List;

public class TicketSeller {
    List<Ticket>ticketList ;
    public TicketSeller(List<Ticket>ticketList){
        this.ticketList = ticketList;
    }
    double incomes ;
    public void sell(Ticket ticket){
        for(Ticket  ticket1 : ticketList){
            incomes += ticket1.computePrice();
        }

    }
    public double getIncomes(){
        return incomes;
    }
}

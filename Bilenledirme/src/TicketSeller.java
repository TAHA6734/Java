import java.util.List;

public class TicketSeller {
    List<Ticket>tickets ;
    double incomes = 0 ;
    public TicketSeller(List<Ticket>tickets){
        this.tickets = tickets ;
    }
   public void sell(Ticket tikcets){
        for(Ticket ticket : tickets){
            incomes += ticket.computePrice();
        }
   }
   public double getIncomes(){
        return incomes ;
   }
}

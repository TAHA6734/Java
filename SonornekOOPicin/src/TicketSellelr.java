import java.util.List;

public class TicketSellelr {

    List<Ticket>tickets;
    double incomes ;
    public TicketSellelr(List<Ticket>tickets){
        this.tickets = tickets;
    }
    public void sell(List<Ticket>tickets){
        for(Ticket ticket1 : tickets){
            incomes += ticket1.computePrice();
        }
    }
    public double getIncomes(){
        return incomes;
    }
}

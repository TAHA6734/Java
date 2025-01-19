import java.util.List;

public class TicketSellet {

    List<Ticket>tickets ;
   public double incomes ;

   public  TicketSellet( List<Ticket> tickets){
       this.tickets = tickets;
   }
   public void sell(Ticket ticket){
      ticket.add(ticket);
   }
   public double getIncomes(){
            return incomes;
   }
}

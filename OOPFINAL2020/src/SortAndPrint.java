import java.util.Collections;
import java.util.List;

public class SortAndPrint{
    public static void sortAndPrint(List<Ticket>ticketList){

        Collections.sort(ticketList , new SeatNumberComparator());
        for(Ticket ticket : ticketList){
            System.out.println(ticket);
        }

    }
}

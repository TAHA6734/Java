import java.util.Collections;
import java.util.List;

public class SortAndPrint {
   public static void sortandPrint(List<Ticket>tickets){
       Collections.sort(tickets , new SeatNumberComparator());
       for(Ticket ticket : tickets){
           System.out.println(ticket);
       }
   }

}

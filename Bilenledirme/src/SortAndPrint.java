import java.util.Collections;
import java.util.List;

public class SortAndPrint {
    public static void SortAndPrint(List<Ticket>list){
        Collections.sort( list , new SeatNumberComparator());
        for(Ticket ticket : list ){
            System.out.println( " seat number : " + ticket.seatNumber);
        }
    }

}

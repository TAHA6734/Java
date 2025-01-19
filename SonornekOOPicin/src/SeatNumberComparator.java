import java.util.Comparator;

public class SeatNumberComparator implements Comparator<Ticket> {
    public int compare(Ticket t1 , Ticket t2){
        return Double.compare(t1.seatnumber , t2.seatnumber);
    }
}

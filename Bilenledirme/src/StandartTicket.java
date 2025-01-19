public class StandartTicket extends Ticket{
    double price ;
    public StandartTicket(int number , int seatNumber){
        super(number, seatNumber);
    }
    public void print(){
        System.out.println(" seat number : " + seatNumber );
    }
    public double computePrice(){
        return 10 ;
    }
}

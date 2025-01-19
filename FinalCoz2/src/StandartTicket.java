public class StandartTicket extends Ticket{
    public static final double price = 10 ;
    public StandartTicket(int number , int seatNumber ){
        super(number, seatNumber);

    }
    public void print(){
        System.out.println(" number " + number + "seatnumber " + seatNumber  );
    }
    public double computePrice(){
        return price;
    }

}

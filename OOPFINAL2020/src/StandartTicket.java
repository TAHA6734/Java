public class StandartTicket extends Ticket{
    double price ;
    public StandartTicket(int number , int seatnumber){
       super(number, seatnumber);
    }
    public void print(){
        System.out.println(" number " + number + " seat number : " + seatnumber);
    }
    public double computePrice(){
        return 10.0;
    }

}

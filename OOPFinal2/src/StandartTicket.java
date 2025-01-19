public class StandartTicket extends Ticket{

    protected double price ;
     public  StandartTicket(int number , int Seatnumber){
         super(number , Seatnumber);

     }
     public void print(){
         System.out.println(" number : " + " seat number : " + seatNumber );
     }
     public double ComputePrice(){
         return 10.0 ;

     }
}

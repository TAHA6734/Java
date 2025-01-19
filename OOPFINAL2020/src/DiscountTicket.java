public class DiscountTicket extends Ticket{
    double discount ;
    public DiscountTicket(int number , int seatnumber , double discount){
        super(number, seatnumber);
        this.discount = discount;
    }
    public void print(){
        System.out.println(" number : " + number + " seat number "  + seatnumber );
    }
    public double computePrice(){
       return 10 * discount ;
    }


}

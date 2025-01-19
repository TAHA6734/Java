public class DiscountTicket extends StandartTicket{
    protected double discount ;

    public DiscountTicket(int number , int seatNumber , double discount){
        super(number , seatNumber );
        this.discount = discount ;
    }

    public void print(){
        System.out.println(" number : " + number + " seat number " + seatNumber + " your discount :  " + discount );
    }
    public double ComputePrice(){
        return 10.0 - discount ;
    }

}

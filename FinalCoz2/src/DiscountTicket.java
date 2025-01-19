public class DiscountTicket extends StandartTicket{
    public double discount ;
    public DiscountTicket(int number  , int seatNumber , double discount){
        super(number , seatNumber);
        this.discount = discount;
    }
    public void print(){
        System.out.println("number " + number + "seat number : " + seatNumber + " discount " + discount);
    }
    public double computePrice(){
          return super.computePrice() * discount ;
    }
}

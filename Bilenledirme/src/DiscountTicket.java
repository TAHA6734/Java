public class DiscountTicket extends  StandartTicket{
    double discount ;
    public DiscountTicket(int number , int seatNumber , double discount){
        super(number, seatNumber);
        this.discount = discount ;
    }
    public void print(){
        System.out.println("seat number : " + seatNumber + "discount ticket : " + computePrice());
    }
    public double computePrice(){
        return super.computePrice() * discount ;
    }
}

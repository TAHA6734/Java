public class DiscounTicket extends StandartTicket{
    double discount ;
    public DiscounTicket(int number , int seatnumber , double discount){
        super(number , seatnumber);
        this.discount = discount;
    }
    public void print(){
        System.out.println("number " + " seatnumber " + number + seatnumber + "discount : " + discount);
    }
    @Override
    public double computePrice() {
        return  super.computePrice() * discount ;
    }
}

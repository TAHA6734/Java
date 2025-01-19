abstract class Ticket {
    public int number ;
    int seatnumber ;
    public Ticket(int number , int seatnumber){
        this.number = number;
        this.seatnumber = seatnumber;
    }
    public abstract  void print();
    public abstract double computePrice();


}

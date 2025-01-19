abstract class Ticket {
    public int number  ;
    protected int seatNumber ;

    public Ticket(int number , int seatNumber){
        this.number = number ;
        this.seatNumber = number ;
    }
    abstract void print();
    abstract double ComputePrice() ;

}

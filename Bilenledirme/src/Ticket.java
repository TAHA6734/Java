abstract class Ticket {
    public int number;
    int seatNumber ;

    public Ticket(int number , int seatNumber){
        this.number = number ;
        this.seatNumber = seatNumber ;
    }

    abstract void print();
    abstract double computePrice();


}

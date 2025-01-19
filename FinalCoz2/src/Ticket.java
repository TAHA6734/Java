abstract class Ticket {
    public int number ;
    protected int seatNumber ;

    public Ticket(int number , int seatNumber){
        this.number = number ;
        this.seatNumber = seatNumber ;
    }
    abstract void print();
    abstract double computePrice();

    public int getSeatNumber(){
        return seatNumber;
    }

    public void add(Ticket ticket) {
    }
}

abstract class Ticket {
public int number ;
int seatnumber ;

public Ticket(int number , int seatnumber){
    this.number = number ;
    this.seatnumber = seatnumber;
}
abstract void print();
abstract double computePrice();

}

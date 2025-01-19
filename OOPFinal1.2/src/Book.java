public class Book implements Comparable<Book>{

    private String name ;
    private double price ;

    public Book(String name , double price){
        this.name = name ;
        this.price= price ;
    }
    public double TotalPrice(){
        return  price + ( price * 8 / 100 ) ;
    }
    public int compareTo(Book other){
        return Double.compare(this.TotalPrice(),other.TotalPrice());
    }
    public String toString(){
        return " name : " + name + " price : " + price + " total price : " + TotalPrice();
    }
}

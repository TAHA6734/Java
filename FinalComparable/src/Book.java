

public class Book implements Comparable<Book>{
    public String title ;
    public double price ;

    public Book(String title , double price){
        this.title = title;
        this.price = price ;
    }
    public double TotalPrice(){
        return price * 0.08 ;
    }
public int compareTo(Book other){
        return Double.compare(this.price , other.price);
}
public String toString(){
        return " TITLE : " + title + " PRICE : " + price ;
    }
}

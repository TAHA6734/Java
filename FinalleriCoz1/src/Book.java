public class Book implements Comparable<Book>{
    public String title ;
    public double price ;
    public Book(String title , double price){
        this.price = price ;
        this.title = title ;
    }
    public double Totalprice(){
        return price + (price * 0.08) ;
    }
    public int compareTo(Book other){
        return Double.compare(this.Totalprice() , other.Totalprice());
    }
    public String toString(){
        return " title : " + title + " total price " + Totalprice() ;
    }

}

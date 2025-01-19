public class Book implements Comparable<Book>{
    public String name ;
    public double price ;

    public Book(String name , double price){
        this.name = name ;
        this.price =price;
    }
    public double totalPRice(){
        return price + (price * 0.08) ;
    }
    public int compareTo(Book other){
        return Double.compare(this.totalPRice() , other.totalPRice());
    }
    public String toString(){
        return " TITLE : " + name + " price : " + totalPRice();
    }
}

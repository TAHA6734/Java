public class Book implements  Comparable<Book>{

    private String title ;
    private int year ;

    public Book(String title , int year){
        this.title  =title ;
        this.year = year;
    }
    public String getTitle(){
        return title;
    }
    public int getYear(){
        return year;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }
    public String toString(){
        return "Title : " + title + " year " + year ;
     }
}

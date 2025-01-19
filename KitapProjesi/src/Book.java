import javax.swing.*;

public class Book implements Comparable<Book>{

    private String title ;
    private String auther ;
    private int page ;

    public Book(String title , String auther , int page){
        this.title =title;
        this.auther = auther;
        this.page = page ;
    }
    public String getTitle(){
        return title;
    }
    public String getAuther(){
        return auther;
    }
    public int getPage(){
        return page ;
    }

    public int compareTo(Book other){
        return Integer.compare(this.page , other.page);
    }

    public String toString(){
        return title  +  " "  +  auther  + "  " + page ;
    }


}

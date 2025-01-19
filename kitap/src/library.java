public class library {

    book[] books ;
    public library(book[] books){
        this.books = books ;
    }
    void printAllInfo(){
        for(book book : books){
            System.out.println(book.printInfo());
        }
    }
}

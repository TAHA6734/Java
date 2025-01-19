public class Main{
    public static void main(String[] args){
        try {
            book book1 = new book("kitap1");
            book book2 = new book("kitap2" , "taha kayra") ;
            book book3 = new book("kitap3" , "Ahmet" , 1958) ;

            book[] books = new book[]{book1 ,book2 ,book3} ;
            library library = new library(books);
            library.printAllInfo();
        }catch (IllegalArgumentException e ){
            System.out.println(e.getMessage());
        }
    }
}
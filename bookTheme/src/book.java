public class book {

    private String title ;
    private String auther ;
    private String idsb ;
    private int pages ;

    public void setPages(){
        if(pages < 0 ){
            throw new IllegalArgumentException("0'dan kucuk sayi girilemez ");
        }
        else{
            this.pages = pages;
        }
    }
    public void setAuther(){
        this.auther = auther;
    }
    public void setIdsb(){
        this.idsb=idsb;
    }
    public void setTitle(){
        this.title = title;
    }

    book(String title , String auther , String idsb , int pages){
      this.auther =  auther;
      this.idsb = idsb;
      this.title = title;
      this.pages = pages ;
    }
    book(String title , String  auther , int pages){
        this(title,auther,"unknow" , pages);
    }
    book(String title , String auther){
        this(title, auther,"unknow",0);
    }
    book(String title){
        this(title,"unknow" , "unknow",0);
    }
    public String toString(){
        return String.format("yazar ismi : %s kitap basligi : %s sayfa sayisi :%d kitap numarasi %s " , auther , title,pages,idsb);
    }

}

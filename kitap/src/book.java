public class book {
    private String auther ;
    private String title ;
    private int year ;


    public book(String title , String auther , int year ){
            setAuther(auther);
            setTitle(title);
            setYear(year);
    }
    book(String title){
        this(title , "Unknow" , 2023);
    }
    book(String title , String auther){
        this(title,auther,2022);
    }
    public String printInfo(){
        return String.format("title : "  + this.title + "auther : " + this.auther + "year : " + this.year);
    }
    public void setAuther(String auther){
        this.auther = auther;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setYear(int year){
        if(year > 2024){
            throw new IllegalArgumentException("HATA");
        }
        else{
            this.year = year;
        }
    }
}

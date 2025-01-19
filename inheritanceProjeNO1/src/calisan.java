public class calisan {
    private  String isim ;
    private String soyisim;
    private int id;

    public calisan(String isim ,String soyisim , int id){
        this.isim = isim;
        this.soyisim =soyisim;
        this.id = id;
    }
    public void setIsim(String isim){
        this.isim = isim;
    }
    public void setSoyisim(String soyisim){
        this.soyisim = soyisim;
    }
    public void setMaas(int id){
        this.id = id;
    }
    public String getIsim(){
        return isim;
    }
    public String getSoyisim(){
        return soyisim;
    }
    public int getId(){
        return id;
    }


    public void  BilgiGoster(){
        System.out.println("ISIM : " + isim);
        System.out.println("SOYISIM : " + soyisim);
        System.out.println("Id : " + id);
    }

}

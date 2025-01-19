public class calisan {

    private String isim ;
    private String soyisim ;
    private int id ;

    public calisan(String isim, String soyisim, int id) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.id  = id;
    }


    public void setIsim(String isim){
        this.isim = isim ;
    }

    public String getIsim(){
         return isim ;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void Bilgi_goster(){
        System.out.println("CALISAN BILGILERI");
        System.out.println("isim : " + isim);
        System.out.println("soyisim : " + soyisim);
        System.out.println("ID : " + id);
    }

}


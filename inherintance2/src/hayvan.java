public class hayvan {

    private String isim;
    private int kilo ;
    private int boy ;
    private int bacak_sayisi ;

    public hayvan(String isim,int kilo,int boy ,int bacak_sayisi ){
        this.setBacak_sayisi(bacak_sayisi);
        this.setIsim(isim);
        this.setBoy(boy);
        this.setKilo(kilo);
    }

    public void yemek_ye(){
        System.out.println("Hayvam yemek yiyor");
    }
    public void hareketeGec(int hiz){
        System.out.println("HAYVAN su hizda hareket ediyor : " + hiz);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getBacak_sayisi() {
        return bacak_sayisi;
    }

    public void setBacak_sayisi(int bacak_sayisi) {
        this.bacak_sayisi = bacak_sayisi;
    }
}

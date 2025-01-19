abstract class AskerlikBasvurusu {
    private String isim ;
    private  String soyisim ;
    private int yas ;

    public AskerlikBasvurusu(String isim , String soyisim , int yas){
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas ;
    }

    public String getIsim(){
        return isim;
    }
    public String getSoyisim(){
        return soyisim;
    }
    public int getYas(){
        return yas ;
    }

    public abstract boolean uygunMu();

    public void BasvuruSonucu(){
        if(uygunMu()){
            System.out.println(isim + soyisim + "Askerlik basvurunuz onaylanmistir");
        }
        else{
            System.out.println(isim + soyisim + "Askerlik basvurunuz onaylamadi");
        }
    }


}

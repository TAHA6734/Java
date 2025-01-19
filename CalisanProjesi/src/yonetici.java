public class yonetici extends calisan {
    private int sorumlu_kisi_sayisi ;

    public yonetici(String isim , String soyisim ,  int id , int sorumlu_kisi_sayisi){
        super(isim, soyisim, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi ;
    }

    public void BilgileriGoster(){
        super.Bilgi_goster();
        System.out.println("sorumlu kisi sayisi : " + sorumlu_kisi_sayisi);
    }
    public void zam_yap(int miktar){
        System.out.println(getIsim() + "calisanlara"+miktar+"zam yapti");
    }

}

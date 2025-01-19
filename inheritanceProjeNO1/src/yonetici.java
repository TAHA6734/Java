public class yonetici extends calisan {
    private int sorumlu_kisi_sayisi ;
    public yonetici(String isim , String soyisim , int id , int sorumlu_kisi_sayisi){
        super(isim , soyisim , id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    @Override
    public void BilgiGoster() {
        super.BilgiGoster();
        System.out.println("Sorumlu oldugu kisi sayisi" + sorumlu_kisi_sayisi);
    }
    public void zamYap(int miktar){
        System.out.println(getIsim() + " calisanlara " + miktar + "tl zam yapti");
    }
}

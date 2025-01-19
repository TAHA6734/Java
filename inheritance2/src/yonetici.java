public class yonetici extends calisan{
    // sup class
    private int sorumlu_kisi;
    public yonetici(String isim , int maas , String departman,int sorumlu_kisi){

        super(isim , maas , departman);
        this.sorumlu_kisi = sorumlu_kisi;
    }

    @Override
    public void BilgiGoster() {
        super.BilgiGoster();
        System.out.println("sorumlu kisi sayisi : " + this.sorumlu_kisi);
    }

    @Override
    public void calis() {
        System.out.println("Yonetici calisiyor");
    }
}

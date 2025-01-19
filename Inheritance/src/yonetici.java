public class yonetici extends calisan{

    private int sorumlu_kisi;

    public yonetici(String isim , int maas , String departman, int sorumlu_kisi)
    {
        super(isim, maas, departman);
        this.sorumlu_kisi = sorumlu_kisi;

    }
    public void Bilgi_goster(){

        /*System.out.println("isim : " + getIsim());
        System.out.println("maas : " + getMaas());
        System.out.println("departman : " + getDepartman());
        System.out.println("SOrumlu kisi : " + this.sorumlu_kisi);*/

        super.Bilgi_goster();
        System.out.println("SOrumlu kisi : " + this.sorumlu_kisi);

    }


}

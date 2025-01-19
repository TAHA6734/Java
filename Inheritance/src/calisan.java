public class calisan {
//superclass baseclass

    private String isim ;
    private int maas ;
    private String departman ;

    public calisan(String isim , int maas , String departman){
        this.departman = departman ;
        this.isim = isim ;
        this.maas = maas ;
    }
    public void calis(){
        System.out.println("Calisan calisiyor");
    }
    public void Bilgi_goster(){
        System.out.println("isim : " + isim);
        System.out.println("maas : " + maas);
        System.out.println("departman : " + departman);

    }

    public void departman_degistirme(String yeni_departman){
        System.out.println("Departman degistiriliyor");
        this.departman = yeni_departman ;
        System.out.println("Yeni departmaniniz : " + this.departman);
    }

    public void setIsim(String isim){
        this.isim = isim ;
    }

    public String getIsim() {
        return isim;
    }

    public void setMaas(int maas){
        this.maas = maas ;
    }

    public int getMaas() {
        return maas;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
    public String getDepartman(){
        return departman;
    }
}

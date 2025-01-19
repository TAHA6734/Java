public class calisan {

    //super ya da base class
    private String isim ;
    private int maas ;
    private String departman ;

    public calisan(String isim , int maas , String departman){
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }
    public void calis(){
        System.out.println("calisan calisiyor...");
    }
    public void  BilgiGoster(){
        System.out.println("  isim  :  " + getIsim() + "  maas :   " + getMaas() +  "  departman :  " +getDepartman());
    }
    public void departman_degistir(String yeni_departman){
        System.out.println("Yeni departman : ");
        this.departman = yeni_departman;
        System.out.println(this.departman);
    }
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

}

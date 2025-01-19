public class Worker {

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    private int maas  ;
    private  int yas ;
    private  String isim ;

    public Worker(int maas , int yas , String isim){
        this.maas = maas;
        this.yas = yas ;
        this.isim = isim ;
    }

    public String toString(){
        return "Worker info :  NAME : " + isim + " AGE : " + yas  + " BUDGET : " + maas ;
    }

}

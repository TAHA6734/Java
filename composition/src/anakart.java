public class anakart {

    private String isletim_sistemi ;
    private String uretici ;
    private int yuva_sayisi ;
    private String model ;

    public anakart(String model,String isletim_sistemi,String uretici,int yuva_sayisi){
        this.isletim_sistemi = isletim_sistemi ;
        this.model = model;
        this.uretici=uretici;
        this.yuva_sayisi = yuva_sayisi;
    }

    public String getModel() {
        return model;
    }
    public String getIsletim_sistemi() {
        return isletim_sistemi;
    }
    public String getUretici() {
        return uretici;
    }
    public int getYuva_sayisi() {
        return yuva_sayisi;
    }
    public void setIsletim_sistemi(String isletim_sistemi) {
        this.isletim_sistemi = isletim_sistemi;
    }
    public void setUretici(String uretici) {
        this.uretici = uretici;
    }
    public void setYuva_sayisi(int yuva_sayisi) {
        this.yuva_sayisi = yuva_sayisi;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void isletim_sistemi_yukle(String isletim_sistemi){
        this.isletim_sistemi = isletim_sistemi ;
        System.out.println("Isletim sistemi yuklendi : " + isletim_sistemi);
    }

}

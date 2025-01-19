public class kasa {

    private  String model;
    private String ureteci ;
    private  String malzeme ;

    public kasa(String model, String ureteci, String malzeme) {
        this.model = model;
        this.ureteci = ureteci;
        this.malzeme = malzeme;
    };

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMalzeme() {
        return malzeme;
    }

    public void setMalzeme(String malzeme) {
        this.malzeme = malzeme;
    }

    public String getUreteci() {
        return ureteci;
    }

    public void setUreteci(String ureteci) {
        this.ureteci = ureteci;
    }

    public void bilgisayari_AC(){
        System.out.println("bilgisayar aciliyor ");
    }



}

public class monitor {
    private String model ;
    private String uretici ;
    private String boyut ;
    private resolotion resolotion ;

    public monitor(String model, String uretici, String boyut, resolotion resolotion) {
        this.model = model;
        this.uretici = uretici;
        this.boyut = boyut;
        this.resolotion = resolotion;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public resolotion getResolotion() {
        return resolotion;
    }

    public void setResolotion(resolotion resolotion) {
        this.resolotion = resolotion;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public void monitoru_kapat(){
        System.out.println("monitor kapatiliyor");
    }
}

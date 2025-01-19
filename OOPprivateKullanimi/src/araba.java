public class araba {

    private int tekerlek ;
    private int   kapi ;
    private String  model ;
    private String motor ;
    private String renk ;

    public void setModel(String model){
        this.model = model ;
    }

    public String getModel(){
        return this.model;
    }


    public int getTekerlek() {
        return tekerlek;
    }

    public void setTekerlek(int tekerlek) {
        this.tekerlek = tekerlek;
    }

    public int getKapi() {
        return kapi;
    }

    public void setKapi(int kapi) {
        if(kapi < 0 ){
            System.out.println("HATALI GIRSI ! ");
        }
        else {
            this.kapi = kapi ;
        }
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getRenk() {
        return renk;
    }


}

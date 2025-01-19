public class beybled {

    private  String beybleci ;
    private int donusHizi;
    private int saldiriGucu;

    public beybled(String beybleci, int donusHizi, int saldiriGucu) {
        this.beybleci = beybleci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }


    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public String getBeybleci() {
        return beybleci;
    }

    public void setBeybleci(String beybleci) {
        this.beybleci = beybleci;
    }

    public void saldir(){
        System.out.println(beybleci + " " + saldiriGucu + "ve" + donusHizi + "ile saldiriyor" );
    }

    public void kutsalCanavar(){
        System.out.println("BU beybledin kutsal canavari yok ");
    }

    public void bilgileriGoster(){
        System.out.println("beybledci : " + beybleci);
        System.out.println("saldiri gucu : " + saldiriGucu);
        System.out.println("donus hizi" + donusHizi);
    }
}

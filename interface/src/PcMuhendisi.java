public class PcMuhendisi implements Imuhendis{

    private boolean askerilik_durumu;
private boolean adli_sicil;

public PcMuhendisi(boolean askerilik_durumu , boolean adli_sicil){
    this.askerilik_durumu = askerilik_durumu;
    this.adli_sicil =adli_sicil;
}


    public void askerlik_durumu_sorgula(){
        if(askerilik_durumu){
            System.out.println("askerlik yapilmis");
        }
        else{
            System.out.println("askerlik yapilmamis");
        }
    }
    @Override
    public String mezuniyet_ortalamasi(double ortalama) {
        return "ortalama :  " + ortalama;
    }
    @Override
    public void adli_sicil_kaydi() {
        if(adli_sicil){
            System.out.println("adli sicil kaydi var ");
        }
        else{
            System.out.println("adli  sicil kaydi temiz");
        }
    }

    @Override
    public void is_tecrubesi(String[] array) {

        System.out.println("daha once calistigi yerler : ");
    for(int i = 0 ; i < array.length ; i++){
        System.out.println(array[i]);
    }
}
}

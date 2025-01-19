public class abone {
    private String sehir ;
    private String isim ;
    private int bakiye  = 120 ;

    public abone(String sehir,String isim ,int bakiye){
        this.sehir = sehir ;
        this.isim = isim ;

        if(bakiye >= 0 && bakiye <= 120){
            this.bakiye = bakiye ;
        }
    }

    
}

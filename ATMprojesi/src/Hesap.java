public class Hesap {

     private String kullanici_adi  ;
     private String parola ;
     private int bakiye ;

    public Hesap(String kullanici_adi, String parola, int bakiye) {

       this.kullanici_adi = kullanici_adi ;
       this.parola = parola ;
       this.bakiye =bakiye ;
    }

    public void setKullanici_adi(String kullanici_adi){
        this.kullanici_adi = kullanici_adi ;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void para_yatirma(int miktar){
        this.bakiye += miktar ;
        System.out.println("Bakiyeniz : " + this.bakiye);
        System.out.println("********************");
    }

    public void para_cekme(int miktar){
        if(miktar > 1500){

            System.out.println("Limit Hatasi : 24 Saat icerisinde 1500tl'den fazla para cekme islemi yapmak yasaktir...");
            System.out.println("********************");
        }
        if(miktar-this.bakiye < 0 ){
            System.out.println("Yetersiz Bakiye : Bakiyenizde cekmek istediginiz miktardan az para bulumaktadir...");
            System.out.println("********************");
        }
        else {
            this.bakiye -= miktar ;
            System.out.println("Bakiyeniz : " + this.bakiye);
            System.out.println("********************");
        }
    }
}



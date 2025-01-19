public class MakineMuhendisi implements Imuhendis , Icalisma{
  private boolean askerlik_durumu;
  private boolean adli_sicil;

  public MakineMuhendisi(boolean askerlik , boolean adli_sicil){
      this.adli_sicil =adli_sicil;
      this.askerlik_durumu =askerlik;
  }

    @Override
    public void askerlik_durumu_sorgula() {
        if(askerlik_durumu){
            System.out.println("askerlik yapilmis");
        }
        else{
            System.out.println("askerlik yapilmamis");
        }
    }

    @Override
    public String mezuniyet_ortalamasi(double ortalama) {
        return "ortalamasi :" + ortalama;
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

       if(array.length == 0){
           System.out.println("calisma tecrubesi yok");
       }
       else{
        for(int i = 0 ; i < array.length ; i++){
            System.out.println("daha once calistigi yerler");
            System.out.println(array[i]);
        }
          }
        }
        public void referans_getir(String [] array){
                if(array.length == 0){
                    System.out.println("referansi yok");
                }
                else{
                    System.out.println("referanslari");
                    for(int i = 0 ; i < array.length ; i++){
                        System.out.println(array[i]);
                    }
                }
        }
        public void calisma(){
            System.out.println("calimiyor");
        }
}

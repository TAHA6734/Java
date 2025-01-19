public class yazlilimci extends calisan{

  private String diller ;

    public yazlilimci(String isim , String soyisim , int id,String diller){
        super(isim , soyisim , id ) ;
        this.diller = diller;
    }
    public void formatAt(String isletim_sistemi){
        System.out.println(getIsim() + isletim_sistemi + "yukluyor...");
    }

    @Override
    public void BilgiGoster() {
       super.BilgiGoster();
        System.out.println("Yazlicinin bildigi diller : " + diller );
    }
}

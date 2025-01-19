public class yazilimci extends calisan {

    private String diller ;

    public yazilimci(String isim , String soyisim , int id  , String diller){
            super(isim,soyisim,id);
            this.diller = diller;
    }

    public void format_at(String isletim_Sistemi){
        System.out.println(getIsim() + " " +  isletim_Sistemi + "yukluyor");
    }

    @Override
    public void Bilgi_goster() {
        super.Bilgi_goster();
        System.out.println("Yazilimcinin bildigi diller " + diller);
    }
}

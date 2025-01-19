public class Kadin extends AskerlikBasvurusu implements uygunYas , sagliRaporu {

    public Kadin(String isim, String soyisim, int yas) {
        super(isim, soyisim, yas);
    }

    @Override
    public boolean uygunYas(int yas) {
        if(yas > 21 && yas < 30 ){
            return true ;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean SaglikRaporu() {
        return false;
    }

    @Override
    public boolean uygunMu() {
        return uygunYas(getYas()) && SaglikRaporu();
    }
}

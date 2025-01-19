public class Erkek extends AskerlikBasvurusu implements sagliRaporu , uygunYas{

    public Erkek(String isim  ,String soyisim , int yas){
        super(isim , soyisim , yas) ;
    }

    @Override
    public boolean SaglikRaporu() {
        return true;
    }

    @Override
    public boolean uygunYas(int yas) {
        if(yas >= 18 && yas <= 35){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean uygunMu() {
        return uygunYas(getYas()) && SaglikRaporu();
    }
}

public class traktor extends Arac{
    @Override
    public void sound() {
        System.out.println("traktir tiki tak calisti");
    }

    @Override
    public void engineOff() {
        super.engineOff();
    }

    public void pulluk(){
        System.out.println("pulluk takildi");
    }
}

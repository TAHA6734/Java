import java.util.SplittableRandom;

interface ucabilen{
void uc();
}
interface yuzebilen{
    void yuz();
}

abstract class Hayvan{
    protected String isim ;

    public Hayvan(String isim){
        this.isim = isim;
    }
   public abstract void sescikar();

    public void yemekYe(){
        System.out.println("hayvan yemek yiyor");
    }

}
class Kus extends Hayvan implements ucabilen{

    public Kus(String isim){
        super(isim);
    }

    @Override
    public void sescikar() {
        System.out.println("kus cik cik der");
    }

    @Override
    public void uc() {
        System.out.println("kus ucabilir");
    }
}

class Balik extends Hayvan implements yuzebilen{
    public Balik(String isim){
        super(isim);
    }
    public void sescikar(){
        System.out.println("balik baliktir ");
    }
    public void yuz(){
        System.out.println("balik yuzer");
    }
}


public class Main {
    public static void main(String[] args) {

}
}
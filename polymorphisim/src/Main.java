
class hayvan{
    private String isim ;

    public hayvan(String isim){
        this.isim = isim;
    }
    public void setIsim(String isim){
        this.isim = isim;
    }
    public String getIsim(){
        return isim;
    }
    public String Konus(){
        return "HAYVAN KONUSMAKTA" ;
    }
}

class kedi extends hayvan{

    public kedi(String isim){
        super(isim);
    }

    @Override
    public String Konus() {
        return this.getIsim()   +   " MIYAVLAMAKTA " ;
    }

}

class kopek extends hayvan{

    public kopek(String isim){
        super(isim);
    }
    public String Konus(){
        return this.getIsim()  +  " HAVLAMAKTA " ;
    }
}

class at extends hayvan{
    public at (String isim){
        super(isim);
    }

    @Override
    public String Konus() {
        return this.getIsim() + " KISNEMEKTA " ;
    }

}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void konustur(Object object)
    {
       if (object instanceof kopek){
           kopek kopek1 = (kopek) object;
           kopek.
       }
    }
    public static void main(String[] args) {

        konustur(new kedi("salep"));
        konustur(new kopek("KARABAS"));
        konustur(new at("SAHBATUR"));

            kopek kopek1 = new kopek("ASTROIT YOK EDICI");
            kedi kedi1 = new kedi("SISI");
            at at1 = new at("BATURALP");


    }
}
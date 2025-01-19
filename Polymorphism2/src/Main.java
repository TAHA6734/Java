import javax.print.attribute.HashAttributeSet;

class Hayvan{

    private String isim ;

    public Hayvan(String isim){
        this.isim = isim;
    }
    public void setIsim(String isim){
        this.isim = isim;
    }
    public String getIsim(){
        return isim;
    }
    public String konus(){
        return "hayvan konusuyor " ;
    }
}
class kedi extends Hayvan{
    public kedi(String isim){
        super(isim);
    }
    public String konus(){
        return getIsim() + " miyavliyor " ;
    }
}
class kopek extends Hayvan{
    public kopek(String isim){
        super(isim);
    }

    @Override
    public String konus() {
        return getIsim() + " havliyor " ;
    }
}
class at extends Hayvan{
    public at(String isim){
        super(isim);
    }
    public String konus(){
        return getIsim() + " kisniyor " ;
    }
}

public class Main {
    public static void konustur(Object object){
        if(object instanceof kedi){
            System.out.println(((kedi) object).konus());
        }
        else if(object instanceof  kopek){
            System.out.println(((kopek) object).konus());
        }
        else if(object instanceof  at){
            System.out.println(((at) object).konus());
        }
        else if(object instanceof Hayvan){
            System.out.println(((Hayvan) object).konus());
        }
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        kedi kedi = new kedi("tekir");
        kopek kopek = new kopek("karabas");
        at at = new at("sahbatur");
        Hayvan hayvan = new Hayvan("limon");
        konustur(kedi);
        konustur(kopek);
        konustur(at);
        konustur(hayvan);


    }

    }

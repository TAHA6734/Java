public class Kopek extends Hayvan{
    private  String cins ;

    public Kopek(String isim , String cins){
        super(isim);
        this.cins = cins;
    }

    @Override
    public void sesCikar() {
        System.out.println("Kopek Havliyor");
    }
    public void Kos(){
        System.out.println(cins + " Kopegi  kosuyor...");
    }
}

public class Kedi extends Hayvan{
   private boolean TirmanmaYetenegi ;

    public Kedi(String isim , boolean TirmanmaYetenegi){
        super(isim);
        this.TirmanmaYetenegi = TirmanmaYetenegi;
    }
    public void sesCikar(){
        System.out.println("Kedi miyavliyor");
    }
    public void tirmala(){
        if(TirmanmaYetenegi){
            System.out.println("Timanabiliyor");
        }
        else{
            System.out.println("tirmanamiyor");
        }
    }


}

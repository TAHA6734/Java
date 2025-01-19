//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   /* Imuhendis muhendisi1 = new PcMuhendisi(false , false);
    muhendisi1.adli_sicil_kaydi();
    muhendisi1.askerlik_durumu_sorgula();
        System.out.println(muhendisi1.mezuniyet_ortalamasi(3.33));
        String[] tecrube = {"Aselsan" , "Havelsan" , "MIT" } ;
        muhendisi1.is_tecrubesi(tecrube);*/

        MakineMuhendisi muhendis2 = new MakineMuhendisi(true , false);
        muhendis2.adli_sicil_kaydi();
        muhendis2.askerlik_durumu_sorgula();
        String[] referans = {"TAHA KAYRA TEKIN"} ;
        String[] tecrube = {} ;
        System.out.println(muhendis2.mezuniyet_ortalamasi(2.31));
        muhendis2.is_tecrubesi(tecrube);
        muhendis2.referans_getir(referans);
        muhendis2.calisma();

    }
}
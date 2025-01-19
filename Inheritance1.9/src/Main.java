//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan("Limon");
        Kedi kedi = new Kedi("Pamuk" , true) ;
        Kopek kopek = new Kopek("Karabas" , "golden") ;

        kedi.sesCikar();
        kedi.tirmala();
        kopek.sesCikar();
        kopek.Kos();
        hayvan.sesCikar();
    }
}
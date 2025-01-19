//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        resolotion resolotion =new resolotion(1920 , 1080) ;
        monitor monitor = new monitor("VS197DE" , "ASUS" ,"15.6inc",resolotion);
        kasa kasa = new kasa("VS789Z1" , "EXCALIBUR","metal") ;
        anakart anakart = new anakart("B220 - PRO " , "WINDOWS" , "ASUS",100000);
        bilgisayar bilgisayar1 = new bilgisayar(monitor,anakart,kasa);

        bilgisayar1.getKasa().bilgisayari_AC();
        bilgisayar1.getAnakart().isletim_sistemi_yukle("WINDOWS");
        bilgisayar1.getMonitor().monitoru_kapat();
    }
}
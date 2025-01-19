//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("MERHABA");
        while (true){
            System.out.println("********************************************");

            System.out.println(" SARTLAR :  " + " 1.vizeniz olmali " + " 2.siyasi yasaginiz olmamali " + " 3.Harci yatirmis olmaniz lazim ");
            System.out.println("********************************************");
            yolcu yolcu = new yolcu();
            System.out.println("Harc bedeli kontrol ediyor...");

            Thread.sleep(3000);
            if(yolcu.yurd_disi_harci() == false){
                System.out.println("Tum sartlariniz saglanirsa yurt disina cikabilirsinz");
                continue;
            }

            System.out.println("Siyasi Yasaginiz var mi kontrol ediliyor...");
            Thread.sleep(3000);
            if(yolcu.Siyasi_yasak() == false){
                System.out.println("Tum sartlariniz saglanirsa yurt disina cikabilirsinz");
                continue;
            }
            System.out.println("vize durumu kontrol ediliyor...");
            if(yolcu.vize_izni() == false){
                System.out.println("Tum sartlariniz saglanirsa yurt disina cikabilirsinz");
                continue;
            }
            System.out.println("Islemleriniz tam ");
            break;
            }
    }
}
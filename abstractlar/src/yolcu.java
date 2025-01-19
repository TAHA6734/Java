import java.util.Scanner;
import java.util.SortedMap;

public class yolcu implements YurtDisiKurallari{
  private boolean siyasi_yasak;
  private boolean vize_izni;
   private int yurd_disi_harci;

    public yolcu() {
      Scanner scanner = new Scanner(System.in);
        System.out.println("yatirdiginiz harc bedeli");
        this.yurd_disi_harci = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Siyasi yasaginiz var mi  ? ");
        String cevap = scanner.nextLine();

        if(cevap.equals("evet")){
            this.siyasi_yasak = true;
        }
        else{
            this.siyasi_yasak = false;
        }
        System.out.println("Vizeniz var mi ? (evet - hayir ) ");
        String cevap2 = scanner.nextLine();
        if(cevap2.equals("evet")){
            this.vize_izni = true;
        }
        else{
            this.vize_izni = false ;
        }

    }


    @Override
    public boolean Siyasi_yasak() {
        if(this.siyasi_yasak == false){
            System.out.println("TAM ");
            return true;
        }
        else{
            System.out.println("siyasi yasaginiz var");
            return false;
        }
    }

    @Override
    public boolean vize_izni() {
            if(this.vize_izni == true){
                System.out.println("TAM");
                return true;
            }
            else{
                System.out.println("Vize izniniz yok");
                return false;
            }
    }

    @Override
    public boolean yurd_disi_harci() {
        if(this.yurd_disi_harci < 15000){
            System.out.println("Tam yatirmamissiniz");
            return false;
        }
     else{
            System.out.println("TAM");
         return true;
        }
    }
}

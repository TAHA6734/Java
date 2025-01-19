import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    Scanner scannenr = new Scanner(System.in);
        System.out.println("Calisanlar programina hosgeldiniz");
        String islemler = "1.Yazimlimci islemleri \n "
                            +"2.Yonetici islemleri \n "
                                +"3. q basarak cikin \n " ;

        System.out.println("***************************************************");
        System.out.println(islemler);
        System.out.println("***************************************************");



        while(true){

            System.out.println("Islem seciniz");
            String islem = scannenr.nextLine() ;

            if(islem.equals("q")){
                System.out.println("Programdan cikiliyor");
                break;
            }
            else if(islem.equals("1")){
                yazilimci yazilimci1 = new yazilimci("TAHA KAYRA" , "TEKIN" ,221021043 , "JAVA  , C , python");
               String yazilimci_islemleri = "1.Format at \n "
                                                +"2.Bilgileri Goster\n"
                                                    +"3. Cikis icin q ya basin \n";
                System.out.println("***************************************************");
                System.out.println(yazilimci_islemleri);
                System.out.println("***************************************************");

                while (true){

                    System.out.println("Islem seciniz \n ");
                    String y_islem = scannenr.nextLine();

                    if(y_islem.equals("q")){
                        System.out.println("Yazilimci sekmesinden cikiliyor");
                        break;
                    }
                    else if(y_islem.equals("1")){
                        yazilimci1.format_at("Windows");
                        System.out.println("FOrmat atildi");
                    }
                    else if(y_islem.equals("2")){
                        System.out.println("Bilgileri :");
                        yazilimci1.Bilgi_goster();
                    }
                    else{
                        System.out.println("gecersiz secim (1,2 ya da q ) ");
                    }

                }

            }
            else if(islem.equals("2")){
                yonetici yonetici1 = new yonetici("AYHAN","TEKIN",1111111,4) ;
                String yonetici_islemler = "1.Bilgileri Goster\n"
                                            +"2. zam yapma \n"
                                             +"3. Cikis icin q ya basin \n";
                System.out.println("***************************************************");
                System.out.println(yonetici_islemler);
                System.out.println("***************************************************");

                while (true){
                    System.out.println("islem seciniz");
                    String yo_islemler = scannenr.nextLine();

                    if(yo_islemler.equals("q"))
                    {
                        System.out.println("programdan cikiliyor ");
                        break;

                    }
                    else if(yo_islemler.equals("1")){
                        yonetici1.BilgileriGoster();
                    }
                    else if(yo_islemler.equals("2")){
                        yonetici1.zam_yap(2500);
                    }
                    else{
                        System.out.println("gecersiz islem (1 ya da q ) ");
                    }
                }
            }
        }


    }
}
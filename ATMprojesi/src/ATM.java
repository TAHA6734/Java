import javax.xml.transform.Source;
import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap1){

            login login = new login();

        System.out.println("Vakifbanka Hosgeldiniz");
        System.out.println("********************");
        System.out.println("Kullanici Girisi");
        System.out.println("********************");
        int giris_hakki = 3 ;

        while(true){
            if(login.login(hesap1)){
                System.out.println("Giris basarili");
                break;
            }
            else{
                System.out.println("Giris basarisiz");
                giris_hakki-- ;
                System.out.println("Kalan girsi Hakki : " + giris_hakki) ;
            }
            if(giris_hakki == 0 )
            {
                System.out.println("Giris Hakkiniz kalmadi lutfen vakifbank musteri hizmetlerini ya da en yakin subemizi ziyart edinzi.");
                return;
            }

        }

        System.out.println("********************");
        String islemler = "1.Bakiye goruntule \n "
                            +"2.Para yatirme \n "
                            +"3.Para Cekme \n "
                            +"4.Cikis icin q'ya basin";
        System.out.println(islemler);
        System.out.println("********************");

        while (true){
            System.out.println("Islemi seciniz");
            Scanner scanner = new Scanner(System.in);
            String islem = scanner.nextLine() ;

            if(islem.equals("q"))
            {
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiye : "  + hesap1.getBakiye() );
            }
            else if (islem.equals("2")){
                System.out.println("Para Yatirmak istediginiz miktari girin ");
                int miktar = scanner.nextInt();
                scanner.nextLine();
                hesap1.para_yatirma(miktar);
            }
            else if(islem.equals("3")){
                System.out.println("Para cekmek icin tutari girin ");
                int miktar = scanner.nextInt() ;
                scanner.nextLine();
                hesap1.para_cekme(miktar);
            }
            else {
                System.out.println("Lutfen gecerli bir hizmet secin...");

            }
            
        }














    }

}

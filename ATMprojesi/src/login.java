import java.util.Scanner;

public class login {
    public boolean login(Hesap hesap1){

        Scanner scanner  = new Scanner(System.in) ;
        String kullanici_adi ;
        String parola ;

        System.out.println("Kullanici Adi : ");
        kullanici_adi = scanner.nextLine();
        System.out.println("Parola : ");
        parola = scanner.nextLine();


        if(hesap1.getKullanici_adi().equals(kullanici_adi) && hesap1.getParola().equals(parola))
        {
            return true ;
        }
        else {
            return false ;
        }

    }




}

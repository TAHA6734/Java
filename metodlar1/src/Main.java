import java.util.Scanner;

public class Main {

    public static void selamalama(){
        System.out.println("Merhaba");
        System.out.println("Taha");
    }

    public static void faktoriyel(){

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("bir sayi girin");
        int sayi = scanner.nextInt() ;

        int faktoriyel = 1 ;

        while(sayi > 0 )
        {
            faktoriyel *= sayi ;
            sayi-- ;
        }
        System.out.println("faktoriyel = " + faktoriyel );

    }

    public static void main (String[]  args){

        selamalama();
        faktoriyel();

    }
}
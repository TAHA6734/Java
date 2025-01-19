//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void toplama(int a , int b ){

        System.out.println("toplama : " + (a+b));
    }

    public static void toplama(int a , int b , int c ){

        System.out.println("toplama : " + (a+b+c));
    }

    public static void toplama(String a , String b ){

        System.out.println(a + " " + b );
    }



    public static void skorHesapla(String a , int b ){
        System.out.println(a + "adli oyuncunun"  + b +  "puani var ");
    }

    public static void skorHesapla( int b ){
        System.out.println( "isimsiz oyuncunun"  + b +  "puani var");
    }

    public static void skorHesapla( String a ){
        System.out.println( a + " adli oyuncunun puani yok" );
    }

    public static void main(String[] args) {

        toplama(7,5,6);
        toplama(54, 56);
        toplama("TAHA KAYRA" , "TEKIN");

        skorHesapla("TAHA KAYRA" , 12569);
        skorHesapla( 1269);
        skorHesapla( "TAHA KAYRA ");



    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void toplama(int a , int b , int c ){

        System.out.println("toplama"+ (a+b+c));
    }

    public static void selamlama(String isim){

        System.out.println("selamlar " + isim);
    }

    public static void main(String[] args) {

        selamlama("taha");
        toplama(2,3,5);

    }
}
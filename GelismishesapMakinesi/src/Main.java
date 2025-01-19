import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static double bolme(int a , int b ){

        return ((double)a / b);
    }

    public static int  cikarma(int a , int b ){

        return (a - b );

    }

    public static int  toplama(int a , int b ){

        return (a + b );
    }

    public static int  toplama(int a , int b , int c){

        return (a + b + c)  ;
    }

    public static int carpma(int a ,int b ){

        return (a * b) ;
    }

    public static int carpma(int a ,int b  ,int c ){

        return (a * b  * c) ;
    }


    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in) ;
            String islemler  = "1.Toplama\n"
                                +"2.Cikarma\n"
                                +"3.Carpma\n"
                                +"4.Bolme\n"
                                +"Cikis icin q'ya basin " ;

        System.out.println("**********************************************");
        System.out.println(islemler);
        System.out.println("**********************************************");

        while(true){
            System.out.println("Hangi islemi yapmak istiyorsunuz ? \n  ");

            String islem = scanner.nextLine();

            if(islem.equals("q")){
                System.out.println("Programdan cikiliyor ");
                break;
            }

            else if(islem.equals("1")){

                System.out.println("Kac deger toplayacaksiniz (2 veya 3 ) ");

                int KacAdet = scanner.nextInt();

                if(KacAdet == 2){

                    System.out.println("a:");
                    int a = scanner.nextInt();
                    System.out.println("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Sonuc : " + toplama(a,b) );
                }

                else if(KacAdet == 3){

                    System.out.println("a:");
                    int a = scanner.nextInt();
                    System.out.println("b:");
                    int b = scanner.nextInt();
                    System.out.println("c:");
                    int c = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Sonuc : " + toplama(a,b,c) );
                }

                else {
                    System.out.println("en az 2 en fazla 3 sayi girebilirsiniz ! \n ");
                }
            }

            else if(islem.equals("2")){

                System.out.println("farkini alicagniz sayilari girin \n  ");
                System.out.println("a:");
                int a  = scanner.nextInt() ;
                System.out.println("b:");
                int b = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Sonuc : " + cikarma(a,b));

            }

            else if(islem.equals("3")){

                System.out.println("kac tane sayi carpicaksiniz ( 2 veya 3 )");
                int KacAdet = scanner.nextInt() ;
                if(KacAdet == 2 ){

                    System.out.println("a:");
                    int a  = scanner.nextInt() ;
                    System.out.println("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Sonuc : " + carpma(a,b));

                }
                else if(KacAdet==3){

                    System.out.println("a:");
                    int a  = scanner.nextInt() ;
                    System.out.println("b:");
                    int b = scanner.nextInt();
                    System.out.println("c:");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Sonuc : " + carpma(a,b,c));

                }

                else {
                    System.out.println("en az 2 en fazla 3 sayi girebilirsiniz ! \n ");
                }
            }

            else if (islem.equals("4")){

                System.out.println("a:");
                int a  = scanner.nextInt() ;
                System.out.println("b:");
                int b = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Sonuc : " + bolme(a,b));

            }


        }

    }
}
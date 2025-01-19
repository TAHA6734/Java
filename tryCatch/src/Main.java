import java.util.Scanner;


class CustomExeption extends Exception{
    public CustomExeption(String message){
        super(message);
    }
        }

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            divide(10 , -5);
        }
        catch (ArithmeticException e){
            System.out.println("Yakalanan istisna : " + e.getMessage());
        }
        catch (CustomExeption e){
            System.out.println("Yaklanan istisna : " + e.getMessage());
        }
        finally {
            System.out.println("Finally bloğu çalıştı: Kaynaklar serbest bırakılıyor...");
        }
        System.out.println("Program devam ediyor...");


    }
    public static void divide(int num1 , int num2)throws ArithmeticException , CustomExeption {

        if(num2 == 0){
            throw new ArithmeticException("Sifira bolme hatasi");
        }
        else if(num1 < 0){
            throw new CustomExeption("KUllanici hatasi");
        }
        else{
            System.out.println("Sonuc : " + (num1/num2));
        }

    }
}